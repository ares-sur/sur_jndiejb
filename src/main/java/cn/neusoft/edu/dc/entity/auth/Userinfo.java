package cn.neusoft.edu.dc.entity.auth;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "USERINFO", schema = "AUTH")
public class Userinfo implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private String userid;
	private String username;
	private String userpwd;
	private String beadmin;
	private String bevalid;
	private String email;

	@Id
	@Column(name = "USERID", unique = true, nullable = false, length = 20)
	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	@Column(name = "USERNAME", length = 20)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "USERPWD", length = 50)
	public String getUserpwd() {
		return this.userpwd;
	}

	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}

	@Column(name = "BEADMIN", length = 3)
	public String getBeadmin() {
		return this.beadmin;
	}

	public void setBeadmin(String beadmin) {
		this.beadmin = beadmin;
	}

	@Column(name = "BEVALID", length = 3)
	public String getBevalid() {
		return this.bevalid;
	}

	public void setBevalid(String bevalid) {
		this.bevalid = bevalid;
	}
	
	@Column(name = "EMAIL", length = 50)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}