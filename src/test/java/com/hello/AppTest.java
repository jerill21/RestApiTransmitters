package com.hello;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hello.domain.Modem;
import com.hello.domain.ModemRepository;
import com.hello.domain.Sim;
import com.hello.domain.SimRepository;
import com.hello.domain.Transmitter;
import com.hello.domain.TransmitterRepository;
import com.utils.Constantes;

@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@SpringBootTest
public class AppTest {

    private TransmitterRepository repository;
    private ModemRepository modemRepository;
    private SimRepository simRepository;
    
    @Autowired
    public void setRepository(TransmitterRepository repository) {
        this.repository = repository;
    }
    
    @Autowired
    public void setRepository(ModemRepository repository) {
        this.modemRepository = repository;
    }
    
    @Autowired
    public void setRepository(SimRepository repository) {
        this.simRepository = repository;
    }

    @Test
    public void test00_createTransmitterSimple() {
    	Transmitter transmitter = new Transmitter(new Long(666), "Transmitter100", 10);
    	Transmitter savedTransmitter = repository.save(transmitter);
    	assertNotNull(savedTransmitter);
    }
    
    @Test
    public void test01_deleteCreatedTansmitter() {
    	repository.deleteByTransmitterId(new Long(666));
    	assertNull(repository.findByTransmitterId(new Long(666)));
    }
    
    @Test
    public void test1_createTransmitter() {
    	Sim sim = new Sim(new Long(101), 5);
    	Sim savedSim = simRepository.save(sim);
    	Modem savedModem = modemRepository.save(new Modem(new Long(102), 4));
    	
    	Transmitter transmitter = new Transmitter(new Long(100), "Transmitter100", 10, savedSim, savedModem);
    	repository.save(transmitter);
    	Transmitter foundTransmitter = repository.findByTransmitterId(new Long(100));
        assertEquals("Transmitter100", foundTransmitter.getAlias());
        assertEquals(new Integer(10), foundTransmitter.getStatus());
    }

    @Test
    public void test2_findAllTransmitters() {
    	Transmitter transmitter1 = new Transmitter();
    	repository.save(transmitter1);
    	repository.save(new Transmitter());
        List<Transmitter> transmitters = repository.findBy_class(Constantes.CLASS_TRANSMITTER);
        assertNotNull(transmitters);
        assertTrue(!transmitters.isEmpty());
    }


    @Test
    public void test4_deleteAll() {
    	repository.deleteAll();
    	assertTrue(repository.findAll().isEmpty());
    }
    
}