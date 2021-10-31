package com.assignment.library.librarySystem.serviceImpl;

import com.assignment.library.librarySystem.model.BookCategory;
import com.assignment.library.librarySystem.repository.BookCategoryRepository;
import com.assignment.library.librarySystem.service.BookCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookCategoryServiceImpl implements BookCategoryService {
    @Autowired
    private BookCategoryRepository bookCategoryRepository;

    @Override
    public void addBookCategory(BookCategory bookCategory) {
        bookCategoryRepository.save(bookCategory);
    }

    @Override
    public List<BookCategory> getAllBookCategories() {
        List<BookCategory> bookCategoryList = new ArrayList<>();
        bookCategoryRepository.findAll().forEach(bookCategoryList::add);
        return bookCategoryList;
    }

    @Override
    @Transactional
    public Optional<BookCategory> updateBookCategory(Integer id, BookCategory bookCategory) {
        return bookCategoryRepository.findById(id).map(
                e -> {
                    e.setbCatName(bookCategory.getbCatName());
                    return e;
                }
        );
    }

    @Override
    public BookCategory getBookCategoryByID(Integer id) {
        Optional<BookCategory> bookCat = Optional.ofNullable(
                bookCategoryRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid ID"))
        );
        BookCategory bookCategory = bookCat.get();
        return bookCategory;
    }

    @Override
    public void deleteBookCategory(Integer id) {
        bookCategoryRepository.deleteById(id);
    }
}
