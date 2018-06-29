package com.hello.es.domain;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hello.es.domain.Transmitter;


@RepositoryRestResource
public interface TransmitterRepository extends MongoRepository<Transmitter, Integer> {
	
	public List<Transmitter> findBy_class(String _class);
	
	public Transmitter findByTransmitterId(Long transmitterId);
	
	public void deleteByTransmitterId(Long transmitterId);
}