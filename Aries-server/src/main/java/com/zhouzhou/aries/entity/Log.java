package com.zhouzhou.aries.entity;

// Generated 2016-9-7 23:21:18 by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Log generated by hbm2java
 */
@Entity
@Table(name = "log", catalog = "aries")
public class Log implements java.io.Serializable {

	private Integer id;
	private String version;
	private String userid;
	private String request;
	private String ip;
	private String reponse;
	private String model;
	private String system;
	private String business;
	private Integer businesscode;
	private Date createtime;
	private Date updatetime;

	public Log() {
	}

	public Log(String userid, String request, String ip, String reponse,
			String model, String system, String business, Integer businesscode,
			Date createtime, Date updatetime) {
		this.userid = userid;
		this.request = request;
		this.ip = ip;
		this.reponse = reponse;
		this.model = model;
		this.system = system;
		this.business = business;
		this.businesscode = businesscode;
		this.createtime = createtime;
		this.updatetime = updatetime;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "version", length = 45)
	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Column(name = "userid", length = 12)
	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	@Column(name = "request", length = 1000)
	public String getRequest() {
		return this.request;
	}

	public void setRequest(String request) {
		this.request = request;
	}

	@Column(name = "ip", length = 45)
	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	@Column(name = "reponse", length = 1000)
	public String getReponse() {
		return this.reponse;
	}

	public void setReponse(String reponse) {
		this.reponse = reponse;
	}

	@Column(name = "model", length = 100)
	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Column(name = "system", length = 45)
	public String getSystem() {
		return this.system;
	}

	public void setSystem(String system) {
		this.system = system;
	}

	@Column(name = "business", length = 45)
	public String getBusiness() {
		return this.business;
	}

	public void setBusiness(String business) {
		this.business = business;
	}

	@Column(name = "businesscode")
	public Integer getBusinesscode() {
		return this.businesscode;
	}

	public void setBusinesscode(Integer businesscode) {
		this.businesscode = businesscode;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "createtime", length = 19)
	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updatetime", length = 19)
	public Date getUpdatetime() {
		return this.updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

}
