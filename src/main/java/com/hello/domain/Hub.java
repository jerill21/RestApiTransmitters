package com.hello.domain;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.*;

@Data
@NoArgsConstructor
@Document(collection = "HUBS")
public class Hub {

    @Id
    @Field("id")
    private int id;

    @NotNull
    @Size(min = 1)
    @Field("serialNumber")
    private String serialNumber;

    @NotNull
    @Size(min = 1)
    @Field("description")
    private String description;

    public Hub(int id, String serialNumber, String description) {
        this.id = id;
        this.serialNumber = serialNumber;
        this.description = description;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
    
}