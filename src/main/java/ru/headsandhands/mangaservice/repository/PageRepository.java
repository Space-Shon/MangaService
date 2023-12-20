package ru.headsandhands.mangaservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.headsandhands.mangaservice.model.Page;


public interface PageRepository extends JpaRepository<Page, Long> {

    Page findByName(String name);

}
