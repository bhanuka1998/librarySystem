package com.assignment.library.librarySystem.serviceImpl;

import com.assignment.library.librarySystem.model.BookBorrowings;
import com.assignment.library.librarySystem.model.VideoBorrowings;
import com.assignment.library.librarySystem.model.VideoReservation;
import com.assignment.library.librarySystem.repository.VideoBorrowingsRepository;
import com.assignment.library.librarySystem.service.VideoBorrowingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class VideoBorrowingsServiceImpl implements VideoBorrowingsService {

    @Autowired
    private VideoBorrowingsRepository videoBorrowingsRepository;

    @Override
    public void addVideoBorrowing(VideoBorrowings videoBorrowings) {
        videoBorrowingsRepository.save(videoBorrowings);
    }

    @Override
    public void deleteVideoBorrowing(Integer id) {
        videoBorrowingsRepository.deleteById(id);
    }

    @Override
    public List<VideoBorrowings> getAllVideoBorrowings() {
        List<VideoBorrowings> videoBorrowingsList = new ArrayList<>();
        videoBorrowingsRepository.findAll().forEach(videoBorrowingsList :: add);
        return null;
    }

    @Override
    public Optional<VideoBorrowings> updateVideoBorrowing(VideoBorrowings videoBorrowings, Integer id) {
        return videoBorrowingsRepository.findById(id).map(e -> {
            e.setStatus(videoBorrowings.getStatus());
            return e;
        });
    }

    @Override
    public VideoBorrowings getAllVideoBorrowingsByID(Integer id) {
        Optional<VideoBorrowings> vidBorrow = Optional.ofNullable(
                videoBorrowingsRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid ID"))
        );
        VideoBorrowings videoBorrowings = vidBorrow.get();
        return videoBorrowings;
    }
}
