package cn.neusoft.edu.dc.entity.et;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@SuppressWarnings("serial")
@Entity
@Table(name = "K_MAJOR", schema = "ETDC")
public class Major implements java.io.Serializable {

	// Fields

	private String dm;
	private String userDm;
	private String zwmc;
	private String ywmc;
	private String gbzydm;
	private String ssyxbUserdm;
	private String ssyxbMc;
	private String ssxkdl;
	private String ssxk;
	private String xz;
	private String pycc;
	private String syxw;
	private String sznf;

	// Constructors

	/** default constructor */
	public Major() {
	}

	/** minimal constructor */
	public Major(String dm) {
		this.dm = dm;
	}

	
	// Property accessors
	@Id
	@Column(name = "DM", unique = true, nullable = false, length = 4)
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

	@Column(name = "ZWMC", length = 50)
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

	@Column(name = "GBZYDM", length = 8)
	public String getGbzydm() {
		return this.gbzydm;
	}

	public void setGbzydm(String gbzydm) {
		this.gbzydm = gbzydm;
	}

	@Column(name = "SSYXB_USERDM", length = 10)
	public String getSsyxbUserdm() {
		return this.ssyxbUserdm;
	}

	public void setSsyxbUserdm(String ssyxbUserdm) {
		this.ssyxbUserdm = ssyxbUserdm;
	}

	@Column(name = "SSYXB_MC", length = 32)
	public String getSsyxbMc() {
		return this.ssyxbMc;
	}

	public void setSsyxbMc(String ssyxbMc) {
		this.ssyxbMc = ssyxbMc;
	}

	@Column(name = "SSXKDL", length = 50)
	public String getSsxkdl() {
		return this.ssxkdl;
	}

	public void setSsxkdl(String ssxkdl) {
		this.ssxkdl = ssxkdl;
	}

	@Column(name = "SSXK", length = 32)
	public String getSsxk() {
		return this.ssxk;
	}

	public void setSsxk(String ssxk) {
		this.ssxk = ssxk;
	}

	@Column(name = "XZ", length = 3)
	public String getXz() {
		return this.xz;
	}

	public void setXz(String xz) {
		this.xz = xz;
	}

	@Column(name = "PYCC", length = 20)
	public String getPycc() {
		return this.pycc;
	}

	public void setPycc(String pycc) {
		this.pycc = pycc;
	}

	@Column(name = "SYXW", length = 32)
	public String getSyxw() {
		return this.syxw;
	}

	public void setSyxw(String syxw) {
		this.syxw = syxw;
	}

	@Column(name = "SZNF", length = 4)
	public String getSznf() {
		return this.sznf;
	}

	public void setSznf(String sznf) {
		this.sznf = sznf;
	}

}