package ru.headsandhands.mangaservice.Service;

import org.springframework.web.multipart.MultipartFile;
import ru.headsandhands.mangaservice.model.Chapter;
import ru.headsandhands.mangaservice.model.Manga;
import ru.headsandhands.mangaservice.request.ChapterRequest;
import ru.headsandhands.mangaservice.request.MangaRequest;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface ChapterService {
    Chapter createChapter(Long mangaId, ChapterRequest chapterRequest);
}
