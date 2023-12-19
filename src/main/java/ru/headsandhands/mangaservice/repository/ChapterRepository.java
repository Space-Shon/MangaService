package ru.headsandhands.mangaservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.headsandhands.mangaservice.model.Chapter;

public interface ChapterRepository extends JpaRepository<Chapter, Long> {
}
