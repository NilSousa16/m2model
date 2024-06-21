package br.ufba.dcc.wiser.m2model.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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

	private String solution;

	private String coordinates;
//
	@OneToMany(mappedBy = "gateway", fetch = FetchType.LAZY)
	private List<GatewayStatus> gatewayStatus;

	public Gateway() {
	}

	public Gateway(String mac, String ip, String manufacturer, String hostName, boolean status, Calendar date,
			String solution, String coordinates) {
		super();
		this.mac = mac;
		this.ip = ip;
		this.manufacturer = manufacturer;
		this.hostName = hostName;
		this.status = status;
		this.date = date;
		this.solution = solution;
		this.coordinates = coordinates;
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

	public String getSolution() {
		return solution;
	}

	public void setSolution(String solution) {
		this.solution = solution;
	}

	public String getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(String coordinates) {
		this.coordinates = coordinates;
	}

	public List<GatewayStatus> getGatewayStatus() {
		return gatewayStatus;
	}

	public void setGatewayStatus(List<GatewayStatus> gatewayStatus) {
		this.gatewayStatus = gatewayStatus;
	}

	@Override
	public int hashCode() {
		return Objects.hash(coordinates, date, gatewayStatus, hostName, ip, mac, manufacturer, solution, status);
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
		return Objects.equals(coordinates, other.coordinates) && Objects.equals(date, other.date)
				&& Objects.equals(gatewayStatus, other.gatewayStatus) && Objects.equals(hostName, other.hostName)
				&& Objects.equals(ip, other.ip) && Objects.equals(mac, other.mac)
				&& Objects.equals(manufacturer, other.manufacturer) && Objects.equals(solution, other.solution)
				&& status == other.status;
	}

}
