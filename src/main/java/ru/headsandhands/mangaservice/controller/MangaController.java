package ru.headsandhands.mangaservice.controller;


import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.headsandhands.mangaservice.Service.Impl.MangaServiceImpl;
import ru.headsandhands.mangaservice.model.Manga;
import ru.headsandhands.mangaservice.request.MangaRequest;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/manga/api/")
public class MangaController {

    private final MangaServiceImpl mangaService;

    public MangaController(MangaServiceImpl mangaService) {
        this.mangaService = mangaService;
    }

    @PostMapping("/manga")
    public ResponseEntity<Manga> createManga(@RequestBody @Valid MangaRequest mangaRequest){
        Manga manga = mangaService.createManga(mangaRequest);
        return ResponseEntity.ok(manga);
    }

    @GetMapping("/manga")
    public ResponseEntity<List<Manga>> getManga(){
        return new ResponseEntity<>(mangaService.getManga(), HttpStatus.OK);
    }

    @GetMapping("/manga/{id}")
    public Optional<Manga> getMangaId(@PathVariable Long id){
        return mangaService.getMangaId(id);
    }

}
