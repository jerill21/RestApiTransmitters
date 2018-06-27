package com.hello.domain;


import com.hello.domain.Transmitter;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface TransmitterRepository extends MongoRepository<Transmitter, Integer> {
	
	public List<Transmitter> findBy_class(String _class);
}