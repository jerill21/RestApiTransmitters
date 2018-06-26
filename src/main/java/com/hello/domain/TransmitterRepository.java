package com.hello.domain;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface TransmitterRepository extends MongoRepository<Transmitter, Integer> {
}