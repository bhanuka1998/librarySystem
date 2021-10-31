package com.assignment.library.librarySystem.controller;

import com.assignment.library.librarySystem.model.BookCategory;
import com.assignment.library.librarySystem.service.BookCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookCategoryController {
    @Autowired
    private BookCategoryService bookCategoryService;

    @RequestMapping(method = RequestMethod.POST, value = "/saveBookCategory")
    public void addBookCategory(@RequestBody BookCategory bookCategory){
        bookCategoryService.addBookCategory(bookCategory);
    }

    @RequestMapping("/getAllBookCategories")
    public List<BookCategory> getAllBookCategories(){
        return bookCategoryService.getAllBookCategories();
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/updateBookCategory/{id}")
    public  void updateBookCategory(@PathVariable Integer id, @RequestBody BookCategory bookCategory){
        bookCategoryService.updateBookCategory(id, bookCategory);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/deleteBookCategory/{id}")
    public void deleteBookCategory(@PathVariable Integer id){
        bookCategoryService.deleteBookCategory(id);
    }
}
