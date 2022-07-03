package br.ufba.dcc.wiser.m2model.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Device implements Serializable {

	private static final long serialVersionUID = -2042913458886286579L;

	@Id
	private String id;
	/**
	 * String with latitude and longitude
	 */
	private String location;
	private String description;
	/**
	 * Indicates whether the sensor is for temperature, humidity, etc.
	 */
	private String typeSensor;
	/**
	 * Indicates whether the device is working 
	 */
	private Boolean status;
	/**
	 * Device registration date
	 */
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar date;

	/**
	 * Gateway connected to device
	 */
	@ManyToOne
	private Gateway gateway;

	public Device() {
	}

	public Device(String location, String description, String typeSensor, Boolean status, Calendar date,
			String macGateway) {
		super();
		this.location = location;
		this.description = description;
		this.typeSensor = typeSensor;
		this.status = status;
		this.date = date;
		gateway = new Gateway();
		gateway.setMac(macGateway);
	}
	
	public Device(String id) {
		super();
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTypeSensor() {
		return typeSensor;
	}

	public void setTypeSensor(String typeSensor) {
		this.typeSensor = typeSensor;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	public Gateway getGateway() {
		return gateway;
	}

	public void setGateway(Gateway gateway) {
		this.gateway = gateway;
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, description, gateway, id, location, status, typeSensor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Device other = (Device) obj;
		return Objects.equals(date, other.date) && Objects.equals(description, other.description)
				&& Objects.equals(gateway, other.gateway) && Objects.equals(id, other.id)
				&& Objects.equals(location, other.location) && Objects.equals(status, other.status)
				&& Objects.equals(typeSensor, other.typeSensor);
	}

}
