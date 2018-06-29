package com.hello.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hello.es.domain.Modem;
import com.hello.es.domain.ModemRepository;
import com.hello.es.domain.Sim;
import com.hello.es.domain.SimRepository;
import com.hello.es.domain.Transmitter;
import com.hello.es.domain.TransmitterRepository;
import com.utils.Constantes;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@CrossOrigin
@RequestMapping("/api/transmitters")
@Api(tags = {"transmitters"})
public class TransmitterController {

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

    @RequestMapping(method = RequestMethod.POST)
    @ApiOperation(value = "Create a transmitter resource.", notes = "Also creates the associated Sim and Modem. Transmitter, Sim and Modem are different entities.")
    public void createTransmitter(@RequestBody Transmitter transmitter) {
    	
    	Modem m = modemRepository.save(transmitter.getModem());
    	Sim s = simRepository.save(transmitter.getSim());
    	transmitter.setSim(s);
    	transmitter.setModem(m);
        repository.save(transmitter);
    }

    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value = "Get a list of all transmitters.", notes = "Each transmitter of the list contains its Modem and Sim associated")
    public List<Transmitter> findAllTransmitters() {
        return repository.findBy_class(Constantes.CLASS_TRANSMITTER);
    }

    @RequestMapping(
            method = RequestMethod.GET,
            value = "/{id}")
    @ApiOperation(value = "Get a single transmitter.", notes = "You have to provide a valid transmitter ID.")
    public Transmitter findTransmitterById(@PathVariable Integer id) {

        return repository.findOne(id);
    }

    @RequestMapping(
            method = RequestMethod.DELETE,
            value = "/{id}")
    @ApiOperation(value = "Delete a transmitter resource.", notes = "You have to provide a valid transmitter ID in the URL. Once deleted the resource can not be recovered.")
    public void deleteTransmitterWithId(@PathVariable int id) {
        repository.delete(id);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    @ApiOperation(value = "Delete all transmitter resources.")
    public void deleteAllTransmitters() {
        repository.deleteAll();
    }
    
    
    @RequestMapping(method = RequestMethod.POST,
    		value = "/{excelFile}")
    public void processExcel(@RequestBody byte[] excelFile) {
    	
    	
    	
    }
    
}