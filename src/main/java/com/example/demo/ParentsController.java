package com.example.demo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/parents")
public class ParentsController {

    private final ParentsService parentsService;

    public ParentsController(final ParentsService parentsService) {

        this.parentsService = parentsService;

    }

    @GetMapping
    ResponseEntity<Page<Parent>> findAll(Pageable pageable) {

        return new ResponseEntity<>(parentsService.findAll(pageable), HttpStatus.OK);

    }

}
