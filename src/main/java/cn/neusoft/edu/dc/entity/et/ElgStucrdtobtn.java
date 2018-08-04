package cn.neusoft.edu.dc.entity.et;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 学生毕业资格
 * 成绩信息
 * @author Administrator
 *
 */
//@SuppressWarnings("serial")
@Entity
@Table(name = "ELG_STUCRDTOBTN", schema = "ETDC")
public class ElgStucrdtobtn implements java.io.Serializable {

	private static final long serialVersionUID = 7191003208712777362L;
	private String stuno;
	private String stuname;
	private String nj;
	private String spclno;
	private String spclname;
	private String clano;
	private String claname;
	private String depno;
	private String depname;
	private Double crdtseldreqed;
	private Double crdtseldlmtd;
	private Double crdtseldoptl;
	private Double crdtobtn;
	private Double crdtgpa;
	private Double crdtreqed;
	private Double crdtlmtd;
	private Double crdtoptl;
	private Double crdtseld;

	// Constructors

	/** default constructor */
	public ElgStucrdtobtn() {
	}

	/** minimal constructor */
	public ElgStucrdtobtn(String stuno) {
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

	@Column(name = "STUNAME", length = 50)
	public String getStuname() {
		return this.stuname;
	}

	public void setStuname(String stuname) {
		this.stuname = stuname;
	}

	@Column(name = "NJ", length = 4)
	public String getNj() {
		return this.nj;
	}

	public void setNj(String nj) {
		this.nj = nj;
	}

	@Column(name = "SPCLNO", length = 10)
	public String getSpclno() {
		return this.spclno;
	}

	public void setSpclno(String spclno) {
		this.spclno = spclno;
	}

	@Column(name = "SPCLNAME", length = 50)
	public String getSpclname() {
		return this.spclname;
	}

	public void setSpclname(String spclname) {
		this.spclname = spclname;
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

	@Column(name = "CRDTSELDREQED", precision = 22, scale = 0)
	public Double getCrdtseldreqed() {
		return this.crdtseldreqed;
	}

	public void setCrdtseldreqed(Double crdtseldreqed) {
		this.crdtseldreqed = crdtseldreqed;
	}

	@Column(name = "CRDTSELDLMTD", precision = 22, scale = 0)
	public Double getCrdtseldlmtd() {
		return this.crdtseldlmtd;
	}

	public void setCrdtseldlmtd(Double crdtseldlmtd) {
		this.crdtseldlmtd = crdtseldlmtd;
	}

	@Column(name = "CRDTSELDOPTL", precision = 22, scale = 0)
	public Double getCrdtseldoptl() {
		return this.crdtseldoptl;
	}

	public void setCrdtseldoptl(Double crdtseldoptl) {
		this.crdtseldoptl = crdtseldoptl;
	}

	@Column(name = "CRDTOBTN", precision = 22, scale = 0)
	public Double getCrdtobtn() {
		return this.crdtobtn;
	}

	public void setCrdtobtn(Double crdtobtn) {
		this.crdtobtn = crdtobtn;
	}

	@Column(name = "CRDTGPA", precision = 22, scale = 0)
	public Double getCrdtgpa() {
		return this.crdtgpa;
	}

	public void setCrdtgpa(Double crdtgpa) {
		this.crdtgpa = crdtgpa;
	}

	@Column(name = "CRDTREQED", precision = 22, scale = 0)
	public Double getCrdtreqed() {
		return this.crdtreqed;
	}

	public void setCrdtreqed(Double crdtreqed) {
		this.crdtreqed = crdtreqed;
	}

	@Column(name = "CRDTLMTD", precision = 22, scale = 0)
	public Double getCrdtlmtd() {
		return this.crdtlmtd;
	}

	public void setCrdtlmtd(Double crdtlmtd) {
		this.crdtlmtd = crdtlmtd;
	}

	@Column(name = "CRDTOPTL", precision = 22, scale = 0)
	public Double getCrdtoptl() {
		return this.crdtoptl;
	}

	public void setCrdtoptl(Double crdtoptl) {
		this.crdtoptl = crdtoptl;
	}

	@Column(name = "CRDTSELD", precision = 22, scale = 0)
	public Double getCrdtseld() {
		return this.crdtseld;
	}

	public void setCrdtseld(Double crdtseld) {
		this.crdtseld = crdtseld;
	}

	@Override
	public String toString() {
		return "ElgStucrdtobtn [stuno=" + stuno + ", stuname=" + stuname
				+ ", nj=" + nj + ", spclno=" + spclno + ", spclname="
				+ spclname + ", clano=" + clano + ", claname=" + claname
				+ ", depno=" + depno + ", depname=" + depname
				+ ", crdtseldreqed=" + crdtseldreqed + ", crdtseldlmtd="
				+ crdtseldlmtd + ", crdtseldoptl=" + crdtseldoptl
				+ ", crdtobtn=" + crdtobtn + ", crdtgpa=" + crdtgpa
				+ ", crdtreqed=" + crdtreqed + ", crdtlmtd=" + crdtlmtd
				+ ", crdtoptl=" + crdtoptl + ", crdtseld=" + crdtseld + "]";
	}

	
}