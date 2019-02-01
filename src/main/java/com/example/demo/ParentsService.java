package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class ParentsService {

    private final ParentsRepository parentsRepository;

    @Autowired
    public ParentsService(final ParentsRepository parentsRepository) {

        this.parentsRepository = parentsRepository;

    }

    public Page<Parent> findAll(Pageable pageable) {

        return parentsRepository.findAll(pageable);

    }

    public Optional<Parent> getByUUID(UUID uuid) {

        return parentsRepository.getByUuid(uuid);

    }

    public Parent save(Parent parent) {

        parent.setUuid(UUID.randomUUID());

        return parentsRepository.save(parent);

    }

}
