package ru.headsandhands.mangaservice.Service;

import org.springframework.web.multipart.MultipartFile;
import ru.headsandhands.mangaservice.model.Chapter;
import ru.headsandhands.mangaservice.model.Page;

import java.io.IOException;

public interface PageService {
    Page addPage(MultipartFile file, Long chapterId) throws IOException;
}
