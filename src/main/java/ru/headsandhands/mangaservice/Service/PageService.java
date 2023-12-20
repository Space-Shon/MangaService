package ru.headsandhands.mangaservice.Service;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.core.io.Resource;
import ru.headsandhands.mangaservice.model.Page;

import java.io.IOException;
import java.util.List;

public interface PageService {
    Page addPage(MultipartFile file, Long chapterId) throws IOException;
    byte[] getPage(String fileName);
}
