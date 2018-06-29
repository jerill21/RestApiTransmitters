package com.hello.es.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Document(collection="transmitters")
@TypeAlias("modem")
public class Modem {

	@Id
	@Field("id")
	private String id;
	
    @Field("modemId")
    private Long modemId;
    
    @Field("modemStatus")
    private Integer modemStatus;
    
    @Field("_class")
    private String _class;
    
	public Modem(String id, Long modemId, Integer modemStatus) {
		super();
		this.id = id;
		this.modemId = modemId;
		this.modemStatus = modemStatus;
	}
	
	public Modem(Long modemId, Integer modemStatus) {
		super();
		this.modemId = modemId;
		this.modemStatus = modemStatus;
	}

	public Modem() {}
	
	public Long getModemId() {
		return modemId;
	}
	
	public void setModemId(Long modemId) {
		this.modemId = modemId;
	}

	public Integer getModemStatus() {
		return modemStatus;
	}

	public void setModemStatus(Integer modemStatus) {
		this.modemStatus = modemStatus;
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
