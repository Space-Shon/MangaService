package ru.headsandhands.mangaservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.headsandhands.mangaservice.model.Manga;

public interface MangaRepository extends JpaRepository<Manga, Long> {
}
