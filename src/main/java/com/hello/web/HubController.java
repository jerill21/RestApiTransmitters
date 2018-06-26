package com.hello.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hello.domain.Hub;
import com.hello.domain.HubRepository;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/api/hubs")
public class HubController {

    private HubRepository repository;

    @Autowired
    public void setRepository(HubRepository repository) {
        this.repository = repository;
    }

    @RequestMapping(method = RequestMethod.POST)
    public void createHub(@RequestBody Hub hub) {
        repository.save(hub);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Hub> findAllHubs() {
        return repository.findAll();
    }

    @RequestMapping(
            method = RequestMethod.GET,
            value = "/{id}")
    public Hub findHubById(@PathVariable Integer id) {

        return repository.findOne(id);
    }

    @RequestMapping(
            method = RequestMethod.DELETE,
            value = "/{id}")
    public void deleteHubWithId(@PathVariable int id) {
        repository.delete(id);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteAllHubs() {
        repository.deleteAll();
    }
}