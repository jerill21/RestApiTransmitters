package com.hello.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document(collection="transmitters")
@TypeAlias("sim")
public class Sim {

	@Id
    @Field("id")
    private String id;
	
    @Field("simId")
    private Long simId;
    
    @Field("simStatus")
    private Integer simStatus;
    
	public Sim(Long simId, Integer simStatus, String id) {
		super();
		this.id = id;
		this.simId = simId;
		this.simStatus = simStatus;
	}

	public Sim() {
		super();
	}

	public Long getSimId() {
		return simId;
	}

	public void setSimId(Long simId) {
		this.simId = simId;
	}
	
	public int getSimStatus() {
		return simStatus;
	}

	public void setSimStatus(int simStatus) {
		this.simStatus = simStatus;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setSimStatus(Integer simStatus) {
		this.simStatus = simStatus;
	}
	
}
