package br.ufba.dcc.wiser.m2model.model;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "gateway_status")
public class GatewayStatus implements Serializable {

	private static final long serialVersionUID = 952945930198580529L;

	@Id
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar date;

	@Id
	@ManyToOne
	private Gateway gateway;
	
	private double baterryLevel;
	private long usedMemory;
	private double usedProcessor;

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

	public double getBaterryLevel() {
		return baterryLevel;
	}

	public void setBaterryLevel(double baterryLevel) {
		this.baterryLevel = baterryLevel;
	}

	public long getUsedMemory() {
		return usedMemory;
	}

	public void setUsedMemory(long usedMemory) {
		this.usedMemory = usedMemory;
	}

	public double getUsedProcessor() {
		return usedProcessor;
	}

	public void setUsedProcessor(double usedProcessor) {
		this.usedProcessor = usedProcessor;
	}

}
