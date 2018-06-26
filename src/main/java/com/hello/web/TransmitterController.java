package com.hello.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hello.domain.Transmitter;
import com.hello.domain.TransmitterRepository;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/api/transmitters")
public class TransmitterController {

    private TransmitterRepository repository;

    @Autowired
    public void setRepository(TransmitterRepository repository) {
        this.repository = repository;
    }

    @RequestMapping(method = RequestMethod.POST)
    public void createTransmitter(@RequestBody Transmitter transmitter) {
        repository.save(transmitter);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Transmitter> findAllTransmitters() {
        return repository.findAll();
    }

    @RequestMapping(
            method = RequestMethod.GET,
            value = "/{id}")
    public Transmitter findTransmitterById(@PathVariable Integer id) {

        return repository.findOne(id);
    }

    @RequestMapping(
            method = RequestMethod.DELETE,
            value = "/{id}")
    public void deleteTransmitterWithId(@PathVariable int id) {
        repository.delete(id);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteAllTransmitters() {
        repository.deleteAll();
    }
}