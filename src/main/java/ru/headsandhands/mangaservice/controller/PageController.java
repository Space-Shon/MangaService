package ru.headsandhands.mangaservice.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import ru.headsandhands.mangaservice.Service.Impl.PageServiceImpl;
import ru.headsandhands.mangaservice.model.Page;

import java.io.IOException;

@RestController
@RequestMapping("/manga/api")
public class PageController {


    private final PageServiceImpl pageService;

    public PageController(PageServiceImpl pageService) {
        this.pageService = pageService;
    }

    @PostMapping("/uploadFilesIntoDB")
    public ResponseEntity<Page> storeChapterIntoDB(@RequestParam("file") MultipartFile file, @RequestParam Long chapterId) throws IOException {
        Page page = pageService.addPage(file, chapterId);
        return  ResponseEntity.ok(page);
    }

    @GetMapping("/getFileByName/{fileName}")
    public ResponseEntity<byte[]> getImage(@PathVariable String fileName){

        byte[] imageData = pageService.getPage(fileName);

        return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.valueOf("image/png")).body(imageData);
    }

}
