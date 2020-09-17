package br.ufba.dcc.wiser.m2model.model;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Gateway implements Serializable {

	private static final long serialVersionUID = 1214664557729441403L;

	@Id
	private String mac;
	private String ip;
	private String manufacturer;
	private String hostName;
	private boolean status;
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar date;
	
//	@OneToMany(mappedBy = "gateway", fetch = FetchType.LAZY)
//	private List<GatewayStatus> gatewayStatus;

	public Gateway() {
	}

	public Gateway(String mac, String ip, String manufacturer, String hostName, boolean status, Calendar date) {
		super();
		this.mac = mac;
		this.ip = ip;
		this.manufacturer = manufacturer;
		this.hostName = hostName;
		this.status = status;
		this.date = date;
	}

	public String getMac() {
		return mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

//	public List<GatewayStatus> getGatewayStatus() {
//		return gatewayStatus;
//	}
//
//	public void setGatewayStatus(List<GatewayStatus> gatewayStatus) {
//		this.gatewayStatus = gatewayStatus;
//	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((hostName == null) ? 0 : hostName.hashCode());
		result = prime * result + ((ip == null) ? 0 : ip.hashCode());
		result = prime * result + ((mac == null) ? 0 : mac.hashCode());
		result = prime * result + ((manufacturer == null) ? 0 : manufacturer.hashCode());
		result = prime * result + (status ? 1231 : 1237);
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
		Gateway other = (Gateway) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (hostName == null) {
			if (other.hostName != null)
				return false;
		} else if (!hostName.equals(other.hostName))
			return false;
		if (ip == null) {
			if (other.ip != null)
				return false;
		} else if (!ip.equals(other.ip))
			return false;
		if (mac == null) {
			if (other.mac != null)
				return false;
		} else if (!mac.equals(other.mac))
			return false;
		if (manufacturer == null) {
			if (other.manufacturer != null)
				return false;
		} else if (!manufacturer.equals(other.manufacturer))
			return false;
		if (status != other.status)
			return false;
		return true;
	}

}
