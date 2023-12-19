package ru.headsandhands.mangaservice.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class MangaRequest {

    @NotBlank
    private String name;

    @NotBlank
    private String genre;

    @NotBlank
    private String description;

    @NotBlank
    private String rating;
}
