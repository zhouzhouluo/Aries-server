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
 * GroupMessage generated by hbm2java
 */
@Entity
@Table(name = "group_message", catalog = "aries")
public class GroupMessage implements java.io.Serializable {

	private Integer id;
	private String userid;
	private String username;
	private String usernick;
	private String groupid;
	private String groupname;
	private String message;
	private String file;
	private Date createtime;

	public GroupMessage() {
	}

	public GroupMessage(String userid, String username, String usernick,
			String groupid, String groupname, String message, String file,
			Date createtime) {
		this.userid = userid;
		this.username = username;
		this.usernick = usernick;
		this.groupid = groupid;
		this.groupname = groupname;
		this.message = message;
		this.file = file;
		this.createtime = createtime;
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

	@Column(name = "userid", length = 45)
	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	@Column(name = "username", length = 45)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "usernick", length = 45)
	public String getUsernick() {
		return this.usernick;
	}

	public void setUsernick(String usernick) {
		this.usernick = usernick;
	}

	@Column(name = "groupid", length = 45)
	public String getGroupid() {
		return this.groupid;
	}

	public void setGroupid(String groupid) {
		this.groupid = groupid;
	}

	@Column(name = "groupname", length = 45)
	public String getGroupname() {
		return this.groupname;
	}

	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}

	@Column(name = "message", length = 45)
	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Column(name = "file", length = 45)
	public String getFile() {
		return this.file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "createtime", length = 19)
	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

}
