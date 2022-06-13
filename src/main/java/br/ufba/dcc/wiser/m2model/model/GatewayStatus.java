package br.ufba.dcc.wiser.m2model.model;

import java.io.Serializable;
import java.util.Calendar;

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
	private long usedMemory;
	private double usedProcessor;

	public GatewayStatus() {

	}

	public GatewayStatus(String mac, double baterryLevel, long usedMemory, double usedProcessor, Calendar date) {
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(baterryLevel);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((gateway == null) ? 0 : gateway.hashCode());
		result = prime * result + (int) (usedMemory ^ (usedMemory >>> 32));
		temp = Double.doubleToLongBits(usedProcessor);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
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
		if (Double.doubleToLongBits(baterryLevel) != Double.doubleToLongBits(other.baterryLevel))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (gateway == null) {
			if (other.gateway != null)
				return false;
		} else if (!gateway.equals(other.gateway))
			return false;
		if (usedMemory != other.usedMemory)
			return false;
		if (Double.doubleToLongBits(usedProcessor) != Double.doubleToLongBits(other.usedProcessor))
			return false;
		return true;
	}

}
