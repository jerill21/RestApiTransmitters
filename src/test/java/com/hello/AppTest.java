package com.hello;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hello.domain.Transmitter;
import com.hello.domain.TransmitterRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AppTest {

    private TransmitterRepository repository;

    @Autowired
    public void setRepository(TransmitterRepository repository) {
        this.repository = repository;
    }

    @Test
    public void createHub() {
//    	Transmitter transmitter = new Transmitter(3, "1222", "Hub3");
//    	Transmitter savedHub = repository.save(transmitter);
//    	Transmitter newHub = repository.findOne(savedHub.getId());
//        assertEquals("1222", newHub.getSerialNumber());
//        assertEquals("Hub3", newHub.getDescription());
    }

    @Test
    public void findAllHubs() {
//    	Transmitter transmitter = new Transmitter(2, "1222", "Hub3");
//    	repository.save(transmitter);
//        List<Transmitter> transmitters = repository.findAll();
//        assertNotNull(transmitters);
//        assertTrue(!transmitters.isEmpty());
    }

    @Test
    public void findHubById() {
//    	Transmitter transmitter = new Transmitter(1, "1222", "Hub3");
//    	repository.save(transmitter);
//    	Transmitter hub1 = repository.findOne(1);
//        assertNotNull(hub1);
    }

    @Test
    public void deleteHubWithId() {
//    	Transmitter hub1 = new Transmitter(1, "1222", "Hub3");
//    	repository.save(hub1);
//    	Transmitter transmitter = repository.findOne(1);
//        repository.delete(transmitter);
//        assertNotNull(transmitter);
    }
}