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
public class GatewayStatus implements Serializable {

	private static final long serialVersionUID = 952945930198580529L;

	@Id
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar date;

	@Id
	@ManyToOne
	private Gateway gateway;

	private double baterryLevel;
	private double usedMemory;
	private double usedProcessor;

	public GatewayStatus() {

	}

	public GatewayStatus(String mac, double baterryLevel, double usedMemory, double usedProcessor, Calendar date) {
		gateway = new Gateway();
		gateway.setMac(mac);
		this.baterryLevel = baterryLevel;
		this.usedMemory = usedMemory;
		this.usedProcessor = usedProcessor;
		this.date = date;
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

	public double getBaterryLevel() {
		return baterryLevel;
	}

	public void setBaterryLevel(double baterryLevel) {
		this.baterryLevel = baterryLevel;
	}

	public double getUsedMemory() {
		return usedMemory;
	}

	public void setUsedMemory(double usedMemory) {
		this.usedMemory = usedMemory;
	}

	public double getUsedProcessor() {
		return usedProcessor;
	}

	public void setUsedProcessor(double usedProcessor) {
		this.usedProcessor = usedProcessor;
	}

	@Override
	public int hashCode() {
		return Objects.hash(baterryLevel, date, gateway, usedMemory, usedProcessor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GatewayStatus other = (GatewayStatus) obj;
		return Double.doubleToLongBits(baterryLevel) == Double.doubleToLongBits(other.baterryLevel)
				&& Objects.equals(date, other.date) && Objects.equals(gateway, other.gateway)
				&& Double.doubleToLongBits(usedMemory) == Double.doubleToLongBits(other.usedMemory)
				&& Double.doubleToLongBits(usedProcessor) == Double.doubleToLongBits(other.usedProcessor);
	}

}
