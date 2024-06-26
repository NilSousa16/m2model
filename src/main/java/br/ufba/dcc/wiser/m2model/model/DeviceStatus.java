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
public class DeviceStatus implements Serializable {

	private static final long serialVersionUID = -4100869947067797492L;

	@Id
	@ManyToOne
	private Device device;

	@Id
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar date;

	/**
	 * Currently operating: operational / test / disabled
	 */
	private String situation;

	public DeviceStatus() {

	}

	public DeviceStatus(String deviceId, String situation, Calendar date) {
		device = new Device();

		device.setId(deviceId);
		this.situation = situation;
		this.date = date;
	}

	public Device getDevice() {
		return device;
	}

	public void setDevice(Device device) {
		this.device = device;
	}

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	public String getSituation() {
		return situation;
	}

	public void setSituation(String situation) {
		this.situation = situation;
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, device, situation);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DeviceStatus other = (DeviceStatus) obj;
		return Objects.equals(date, other.date) && Objects.equals(device, other.device)
				&& Objects.equals(situation, other.situation);
	}

}
