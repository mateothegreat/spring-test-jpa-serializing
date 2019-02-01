package com.example.demo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface ParentsRepository extends PagingAndSortingRepository<Parent, UUID> {

    Optional<Parent> getByUuid(UUID uuid);

}
