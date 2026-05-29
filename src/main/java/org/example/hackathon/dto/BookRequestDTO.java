package org.example.hackathon.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.hackathon.entity.BookStatus;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookRequestDTO {

    @NotBlank(message = "không được để trống")
    private String title;

    @NotBlank(message = "Không được để trống")
    private String author;

    @NotNull(message = "Không được để trống")
    @Positive(message = "phải là dương")
    private Double price;

    private BookStatus status;
}

