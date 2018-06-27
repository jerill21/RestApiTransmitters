package com.hello.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document(collection = "transmitters")
@TypeAlias("transmitter")
public class Transmitter {

    @Id
    @Field("id")
    private String id;
    
    @Field("transmitterId")
    private Long transmitterId;

    @Field("entityType")
    private String entityType;

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

	public Transmitter(Long transmitterId, String entityType, String alias, Integer status, Sim sim, Modem modem) {
		super();
		this.transmitterId = transmitterId;
		this.entityType = entityType;
		this.alias = alias;
		this.status = status;
		this.sim = sim;
		this.modem = modem;
	}
	
	public Long getTransmitterId() {
		return transmitterId;
	}

	public void setTransmitterId(Long transmitterId) {
		this.transmitterId = transmitterId;
	}

	public String getEntityType() {
		return entityType;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
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

}