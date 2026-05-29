package org.example.hackathon.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import org.example.hackathon.dto.BookRequestDTO;
import org.example.hackathon.dto.BookResponseDTO;
import org.example.hackathon.service.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/books")
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;

    @PostMapping
    public ResponseEntity<BookResponseDTO> addBook(@Valid @RequestBody BookRequestDTO dto) {
        return ResponseEntity.ok(bookService.addBook(dto));
    }

    @GetMapping
    public ResponseEntity<List<BookResponseDTO>> getAllBook(){
        return ResponseEntity.ok(bookService.getAllBook());
    }
}
