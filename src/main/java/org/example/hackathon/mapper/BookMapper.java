package org.example.hackathon.mapper;

import org.example.hackathon.dto.BookRequestDTO;
import org.example.hackathon.dto.BookResponseDTO;
import org.example.hackathon.entity.Book;
import org.springframework.stereotype.Component;

@Component
public class BookMapper {
    public Book toEntity(BookRequestDTO dto){
        Book book = new Book();
        book.setTitle(dto.getTitle());
        book.setAuthor(dto.getAuthor());
        book.setPrice(String.valueOf(dto.getPrice()));
        if(dto.getStatus() != null){
            book.getStatus(dto.getStatus());
        }
        return book;
    }

    public BookResponseDTO toResponseDTO(Book book){
        return new BookResponseDTO(
                book.getId() , book.getTitle(), book.getAuthor() , book.getPrice() , book.getStatus() ,book.getIsDeleted()
        );
    }
}
