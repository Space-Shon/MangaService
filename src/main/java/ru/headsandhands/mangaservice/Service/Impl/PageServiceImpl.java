package ru.headsandhands.mangaservice.Service.Impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import ru.headsandhands.mangaservice.Service.PageService;
import ru.headsandhands.mangaservice.model.Chapter;
import ru.headsandhands.mangaservice.model.Page;
import ru.headsandhands.mangaservice.repository.PageRepository;

import java.io.IOException;
@Service
public class PageServiceImpl implements PageService {

    @PersistenceContext
    private EntityManager entityManager;

    private final PageRepository pageRepository;

    public PageServiceImpl(PageRepository pageRepository) {
        this.pageRepository = pageRepository;
    }


    @Override
    public Page addPage(MultipartFile file, Long chapterId) throws IOException {
        Chapter chapter = entityManager.getReference(Chapter.class, chapterId);
        return pageRepository.save(
                Page
                        .builder()
                        .chapter(chapter)
                        .name(file.getOriginalFilename())
                        .extension(file.getContentType())
                        .imageData(file.getBytes())
                        .build()
        );

    }
}
