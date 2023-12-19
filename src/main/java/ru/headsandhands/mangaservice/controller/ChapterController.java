package ru.headsandhands.mangaservice.controller;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.headsandhands.mangaservice.Service.Impl.ChapterServiceImpl;
import ru.headsandhands.mangaservice.model.Chapter;
import ru.headsandhands.mangaservice.request.ChapterRequest;

@RestController
@RequestMapping("/manga/api/chapter")
public class ChapterController {

    private final ChapterServiceImpl chapterService;

    public ChapterController(ChapterServiceImpl chapterService) {
        this.chapterService = chapterService;
    }

    @PostMapping("/chapter")
    public ResponseEntity<Chapter> createChapter(@RequestParam Long mangaId, @Valid @RequestBody ChapterRequest chapterRequest){
        Chapter chapter = chapterService.createChapter(mangaId, chapterRequest);
        return ResponseEntity.ok(chapter);
    }

}
