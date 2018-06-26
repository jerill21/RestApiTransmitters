package com.hello;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hello.domain.Hub;
import com.hello.domain.HubRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AppTest {

    private HubRepository repository;

    @Autowired
    public void setRepository(HubRepository repository) {
        this.repository = repository;
    }

    @Test
    public void createHub() {
    	Hub hub = new Hub(3, "1222", "Hub3");
    	Hub savedHub = repository.save(hub);
    	Hub newHub = repository.findOne(savedHub.getId());
        assertEquals("1222", newHub.getSerialNumber());
        assertEquals("Hub3", newHub.getDescription());
    }

    @Test
    public void findAllHubs() {
    	Hub hub = new Hub(2, "1222", "Hub3");
    	repository.save(hub);
        List<Hub> hubs = repository.findAll();
        assertNotNull(hubs);
        assertTrue(!hubs.isEmpty());
    }

    @Test
    public void findHubById() {
    	Hub hub = new Hub(1, "1222", "Hub3");
    	repository.save(hub);
    	Hub hub1 = repository.findOne(1);
        assertNotNull(hub1);
    }

    @Test
    public void deleteHubWithId() {
    	Hub hub1 = new Hub(1, "1222", "Hub3");
    	repository.save(hub1);
    	Hub hub = repository.findOne(1);
        repository.delete(hub);
        assertNotNull(hub);
    }
}