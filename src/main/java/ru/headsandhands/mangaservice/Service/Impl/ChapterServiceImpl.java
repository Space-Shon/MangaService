package ru.headsandhands.mangaservice.Service.Impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Service;
import ru.headsandhands.mangaservice.Service.ChapterService;
import ru.headsandhands.mangaservice.model.Chapter;
import ru.headsandhands.mangaservice.model.Manga;
import ru.headsandhands.mangaservice.repository.ChapterRepository;
import ru.headsandhands.mangaservice.request.ChapterRequest;


@Service
public class ChapterServiceImpl implements ChapterService {


    @PersistenceContext
    private EntityManager entityManager;
    private final ChapterRepository chapterRepository;

    public ChapterServiceImpl(ChapterRepository chapterRepository) {
        this.chapterRepository = chapterRepository;
    }

    @Override
    public Chapter createChapter(Long mangaId, ChapterRequest chapterRequest) {
        Manga manga = entityManager.getReference(Manga.class, mangaId);
        return chapterRepository.save(Chapter.builder()
                        .manga(manga)
                        .name(chapterRequest.getName())
                .build());
    }

}
