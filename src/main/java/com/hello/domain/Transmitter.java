package com.hello.domain;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.*;

@Data
@NoArgsConstructor
@Document(collection = "transmitters")
public class Transmitter {

//    @Id
    @Field("transmitterId")
    private int transmitterId;

    @Field("entityType")
    private String entityType;

    @Field("alias")
    private String alias;
    
    @Field("status")
    private int status;
    
    @Field("simId")
    private int simId;
    
    @Field("modemId")
    private int modemId;
    
    @Field("simStatus")
    private int simStatus;
    
    @Field("modemStatus")
    private int modemStatus;

    
	public Transmitter(int transmitterId, String entityType, String alias, int status, int simId, int modemId,
			int simStatus, int modemStatus) {
		super();
		this.transmitterId = transmitterId;
		this.entityType = entityType;
		this.alias = alias;
		this.status = status;
		this.simId = simId;
		this.modemId = modemId;
		this.simStatus = simStatus;
		this.modemStatus = modemStatus;
	}



	public Transmitter(int transmitterId, String entityType, String alias, int status, int simId, int modemId) {
		super();
		this.transmitterId = transmitterId;
		this.entityType = entityType;
		this.alias = alias;
		this.status = status;
		this.simId = simId;
		this.modemId = modemId;
	}

	public int getTransmitterId() {
		return transmitterId;
	}

	public void setTransmitterId(int transmitterId) {
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

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getSimId() {
		return simId;
	}

	public void setSimId(int simId) {
		this.simId = simId;
	}

	public int getModemId() {
		return modemId;
	}

	public void setModemId(int modemId) {
		this.modemId = modemId;
	}

	public int getSimStatus() {
		return simStatus;
	}

	public void setSimStatus(int simStatus) {
		this.simStatus = simStatus;
	}

	public int getModemStatus() {
		return modemStatus;
	}

	public void setModemStatus(int modemStatus) {
		this.modemStatus = modemStatus;
	}


}