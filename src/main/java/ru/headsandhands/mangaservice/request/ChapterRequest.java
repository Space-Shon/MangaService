package ru.headsandhands.mangaservice.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ChapterRequest {

    @NotBlank
    private String name;

}
