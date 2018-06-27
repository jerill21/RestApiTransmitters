package com.hello.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;

@Data
@Document(collection = "transmitters")
@TypeAlias("transmitter")
public class Transmitter {

    @Id
    @Field("id")
    private String id;
    
    @Field("_class")
    private String _class;
    
    @Field("transmitterId")
    private Long transmitterId;

    @Field("alias")
    private String alias;
    
    @Field("status")
    private Integer status;
    
    @DBRef
    @Field("sim")
    private Sim sim;
    
    @DBRef
    @Field("modem")
    private Modem modem;
    
	public Transmitter(Long transmitterId, String alias, Integer status, Sim sim, Modem modem) {
		super();
		this.transmitterId = transmitterId;
		this.alias = alias;
		this.status = status;
		this.sim = sim;
		this.modem = modem;
	}
	
	public Transmitter(Long transmitterId, String alias, Integer status) {
		super();
		this.transmitterId = transmitterId;
		this.alias = alias;
		this.status = status;
	}
	
	public Transmitter() {
	}
	
	public Long getTransmitterId() {
		return transmitterId;
	}

	public void setTransmitterId(Long transmitterId) {
		this.transmitterId = transmitterId;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Sim getSim() {
		return sim;
	}

	public void setSim(Sim sim) {
		this.sim = sim;
	}

	public Modem getModem() {
		return modem;
	}

	public void setModem(Modem modem) {
		this.modem = modem;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String get_class() {
		return _class;
	}

	public void set_class(String _class) {
		this._class = _class;
	}
}