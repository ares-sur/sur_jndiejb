package cn.neusoft.edu.dc.entity.et;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "K_DEPART", schema = "ETDC")
public class Depart implements java.io.Serializable {

	// Fields

	private String dm;
	private String userDm;
	private String zwmc;
	private String ywmc;
	private String mentFlag;

	// Constructors

	/** default constructor */
	public Depart() {
	}

	/** minimal constructor */
	public Depart(String dm) {
		this.dm = dm;
	}

	/** full constructor */
	public Depart(String dm, String userDm, String zwmc, String ywmc,
			String mentFlag) {
		this.dm = dm;
		this.userDm = userDm;
		this.zwmc = zwmc;
		this.ywmc = ywmc;
		this.mentFlag = mentFlag;
	}

	// Property accessors
	@Id
	@Column(name = "DM", unique = true, nullable = false, length = 5)
	public String getDm() {
		return this.dm;
	}

	public void setDm(String dm) {
		this.dm = dm;
	}

	@Column(name = "USER_DM", length = 10)
	public String getUserDm() {
		return this.userDm;
	}

	public void setUserDm(String userDm) {
		this.userDm = userDm;
	}

	@Column(name = "ZWMC", length = 32)
	public String getZwmc() {
		return this.zwmc;
	}

	public void setZwmc(String zwmc) {
		this.zwmc = zwmc;
	}

	@Column(name = "YWMC", length = 50)
	public String getYwmc() {
		return this.ywmc;
	}

	public void setYwmc(String ywmc) {
		this.ywmc = ywmc;
	}

	@Column(name = "MENT_FLAG", length = 1)
	public String getMentFlag() {
		return this.mentFlag;
	}

	public void setMentFlag(String mentFlag) {
		this.mentFlag = mentFlag;
	}

}