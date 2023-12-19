package ru.headsandhands.mangaservice.Service.Impl;

import org.springframework.stereotype.Service;
import ru.headsandhands.mangaservice.Service.MangaService;
import ru.headsandhands.mangaservice.model.Manga;
import ru.headsandhands.mangaservice.repository.MangaRepository;
import ru.headsandhands.mangaservice.request.MangaRequest;

import java.util.List;
import java.util.Optional;

@Service
public class MangaServiceImpl implements MangaService {

    private final MangaRepository mangaRepository;

    public MangaServiceImpl(MangaRepository mangaRepository) {
        this.mangaRepository = mangaRepository;
    }

    @Override
    public Manga createManga(MangaRequest mangaRequest) {
        return mangaRepository.save(Manga.builder()
                        .name(mangaRequest.getName())
                        .genre(mangaRequest.getGenre())
                        .description(mangaRequest.getDescription())
                        .rating(mangaRequest.getRating())
                .build());
    }

    @Override
    public List<Manga> getManga() {
        return mangaRepository.findAll();
    }

    @Override
    public Optional<Manga> getMangaId(Long id) {
        return mangaRepository.findById(id);
    }
}
