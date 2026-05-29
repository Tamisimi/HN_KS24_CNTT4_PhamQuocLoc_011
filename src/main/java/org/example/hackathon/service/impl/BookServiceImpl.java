package org.example.hackathon.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.hackathon.dto.BookRequestDTO;
import org.example.hackathon.dto.BookResponseDTO;
import org.example.hackathon.entity.Book;
import org.example.hackathon.mapper.BookMapper;
import org.example.hackathon.repository.BookRepository;
import org.example.hackathon.service.BookService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
    private final BookRepository repository;
    private final BookMapper mapper;

    @Override
    @Transactional
    public BookResponseDTO addBook(BookRequestDTO dto) {
        Book book = mapper.toEntity(dto);
        Book savedBook = repository.save(book);
        return mapper.toResponseDTO(savedBook);
    }

    @Override
    public List<BookResponseDTO> getAllBook() {
        return repository.findAll().stream().filter(book -> !book.getIsDeleted()).map(mapper::toResponseDTO).collect(Collectors.toList());
    }

    @Override
    @Transactional
    public BookResponseDTO updateBook(Long id, BookRequestDTO dto) {

        return null;
    }

    @Override
    public BookResponseDTO patchBook(Long id, BookRequestDTO dto) {
        return null;
    }

    @Override
    public void deleteBook(Long id, boolean hardDelete) {

    }
}
