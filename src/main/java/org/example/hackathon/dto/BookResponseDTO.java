package org.example.hackathon.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.hackathon.entity.BookStatus;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookResponseDTO {
    private Long id;
    private String title;
    private String author;
    private Double price;
    private BookStatus status;
    private Boolean isDeleted;

    public BookResponseDTO(Long id, String title, String author, String price, BookStatus status, Boolean isDeleted) {
    }
}
