package cn.neusoft.edu.dc.entity.et;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "ELG_GRADSTULIST", schema = "ETDC")
public class ElgGradstulist implements java.io.Serializable {

	private String stuno;
	private Integer gradyear;
	private String stuname;
	private Integer levlno;
	private String levlname;
	private String spclname;
	private String spclno;
	private String clano;
	private String claname;
	private String depno;
	private String depname;
	private Integer changeflag;
	private String updtflag;
	private String updtdate;

	// Constructors

	/** default constructor */
	public ElgGradstulist() {
	}

	/** minimal constructor */
	public ElgGradstulist(String stuno) {
		this.stuno = stuno;
	}

	// Property accessors
	@Id
	@Column(name = "STUNO", length = 50)
	public String getStuno() {
		return this.stuno;
	}

	public void setStuno(String stuno) {
		this.stuno = stuno;
	}

	@Column(name = "GRADYEAR", precision = 22, scale = 0)
	public Integer getGradyear() {
		return this.gradyear;
	}

	public void setGradyear(Integer gradyear) {
		this.gradyear = gradyear;
	}

	@Column(name = "STUNAME", length = 50)
	public String getStuname() {
		return this.stuname;
	}

	public void setStuname(String stuname) {
		this.stuname = stuname;
	}

	@Column(name = "LEVLNO", precision = 22, scale = 0)
	public Integer getLevlno() {
		return this.levlno;
	}

	public void setLevlno(Integer levlno) {
		this.levlno = levlno;
	}

	@Column(name = "LEVLNAME", length = 20)
	public String getLevlname() {
		return this.levlname;
	}

	public void setLevlname(String levlname) {
		this.levlname = levlname;
	}

	@Column(name = "SPCLNAME", length = 50)
	public String getSpclname() {
		return this.spclname;
	}

	public void setSpclname(String spclname) {
		this.spclname = spclname;
	}

	@Column(name = "SPCLNO", length = 10)
	public String getSpclno() {
		return this.spclno;
	}

	public void setSpclno(String spclno) {
		this.spclno = spclno;
	}

	@Column(name = "CLANO", length = 50)
	public String getClano() {
		return this.clano;
	}

	public void setClano(String clano) {
		this.clano = clano;
	}

	@Column(name = "CLANAME", length = 50)
	public String getClaname() {
		return this.claname;
	}

	public void setClaname(String claname) {
		this.claname = claname;
	}

	@Column(name = "DEPNO", length = 10)
	public String getDepno() {
		return this.depno;
	}

	public void setDepno(String depno) {
		this.depno = depno;
	}

	@Column(name = "DEPNAME", length = 32)
	public String getDepname() {
		return this.depname;
	}

	public void setDepname(String depname) {
		this.depname = depname;
	}

	@Column(name = "CHANGEFLAG", precision = 22, scale = 0)
	public Integer getChangeflag() {
		return this.changeflag;
	}

	public void setChangeflag(Integer changeflag) {
		this.changeflag = changeflag;
	}

	@Column(name = "UPDTFLAG", length = 0)
	public String getUpdtflag() {
		return this.updtflag;
	}

	public void setUpdtflag(String updtflag) {
		this.updtflag = updtflag;
	}

	@Column(name = "UPDTDATE", length = 0)
	public String getUpdtdate() {
		return this.updtdate;
	}

	public void setUpdtdate(String updtdate) {
		this.updtdate = updtdate;
	}

}