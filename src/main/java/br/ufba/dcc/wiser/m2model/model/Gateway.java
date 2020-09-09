package br.ufba.dcc.wiser.m2model.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Gateway {

	@Id
	private String mac;
	private String ip;
	private String manufacturer;
	private String hostName;
	private boolean status;

	public Gateway() {
	}

	public Gateway(String mac, String ip, String manufacturer, String hostName, boolean status) {
		super();
		this.mac = mac;
		this.ip = ip;
		this.manufacturer = manufacturer;
		this.hostName = hostName;
		this.status = status;
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

}
