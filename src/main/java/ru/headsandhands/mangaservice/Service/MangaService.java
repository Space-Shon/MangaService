package ru.headsandhands.mangaservice.Service;

import ru.headsandhands.mangaservice.model.Manga;
import ru.headsandhands.mangaservice.request.MangaRequest;

import java.util.List;
import java.util.Optional;

public interface MangaService {

    Manga createManga(MangaRequest mangaRequest);
    List<Manga> getManga();
    Optional<Manga> getMangaId(Long id);



}
