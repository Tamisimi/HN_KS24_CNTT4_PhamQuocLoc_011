package org.example.hackathon.service;

import org.example.hackathon.dto.BookRequestDTO;
import org.example.hackathon.dto.BookResponseDTO;

import java.util.List;

public interface BookService {
    BookResponseDTO addBook(BookRequestDTO dto);

    List<BookResponseDTO> getAllBook();

    BookResponseDTO updateBook(Long id, BookRequestDTO dto);

    BookResponseDTO patchBook(Long id, BookRequestDTO dto);

    void deleteBook(Long id, boolean hardDelete);




}
