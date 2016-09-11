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
 * User generated by hbm2java
 */
@Entity
@Table(name = "user")
public class User implements java.io.Serializable {

	@Id
    @GeneratedValue
	private Integer id;
	private String userid;
	private String username;
	private String nickname;
	private String sex;
	private String district;
	private String signature;
	private String head;
	private String twodbarcode;
	private Date createtime;
	private Date updatetime;

	public User() {
	}

	public User(String userid, String username, String nickname, String sex,
			String district, String signature, String head, String twodbarcode,
			Date createtime, Date updatetime) {
		this.userid = userid;
		this.username = username;
		this.nickname = nickname;
		this.sex = sex;
		this.district = district;
		this.signature = signature;
		this.head = head;
		this.twodbarcode = twodbarcode;
		this.createtime = createtime;
		this.updatetime = updatetime;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public String getHead() {
		return head;
	}

	public void setHead(String head) {
		this.head = head;
	}

	public String getTwodbarcode() {
		return twodbarcode;
	}

	public void setTwodbarcode(String twodbarcode) {
		this.twodbarcode = twodbarcode;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public Date getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}
	
}