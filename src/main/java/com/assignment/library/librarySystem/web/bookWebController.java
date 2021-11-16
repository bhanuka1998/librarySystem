package com.assignment.library.librarySystem.web;

import com.assignment.library.librarySystem.model.Books;
import com.assignment.library.librarySystem.service.BookCategoryService;
import com.assignment.library.librarySystem.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.Timestamp;

@Controller
public class bookWebController {

    @Autowired
    BookService bookService;

    @Autowired
    BookCategoryService bookCategoryService;

    @GetMapping("/viewBooks")
    public String viewCategories(Model model){
        model.addAttribute("books", bookService.getAllBooks());
        return "viewbooks";
    }

    @GetMapping("/showAddBookForm")
    public String showAddBookForm(Books books, Model model){
        model.addAttribute("bookCategory", bookCategoryService.getAllBookCategories());
        return "addbook";
    }

    @PostMapping("/addNewBook")
    public String addNewStock(@Valid Books books, BindingResult result, Model model, @RequestParam("bImage") MultipartFile imageFile) throws IOException {
        if(result.hasErrors()){
            return  "addbook";
        }
        String fileName = StringUtils.cleanPath(imageFile.getOriginalFilename());
        String fileExt = fileName.substring(fileName.lastIndexOf("."));
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        fileName = books.getbName().replace(" ", "") + "_" + timestamp.getTime() + fileExt;
        books.setImage(fileName);
        String uploadDir = "images/books";
        Path uploadPath = Paths.get(uploadDir);

        if(!Files.exists(uploadPath)){
            Files.createDirectories(uploadPath);
        }

        try(InputStream inputStream = imageFile.getInputStream()){
            Path filePath = uploadPath.resolve(fileName);
            Files.copy(inputStream, filePath, StandardCopyOption.REPLACE_EXISTING);
            bookService.addBook(books);
        }
        catch(IOException exception){
            throw  new IOException("File upload failed:" +fileName+ "\n" + "Please try again", exception);
        }
        return "redirect:/index";
    }
}
