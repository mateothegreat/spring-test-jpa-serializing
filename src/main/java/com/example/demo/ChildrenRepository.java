package com.example.demo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface ChildrenRepository extends PagingAndSortingRepository<Child, UUID> {

    Optional<Child> getByUuid(UUID uuid);

}
