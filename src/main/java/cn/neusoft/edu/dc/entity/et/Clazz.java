package cn.neusoft.edu.dc.entity.et;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "K_CLAZZ", schema = "ETDC")
public class Clazz implements java.io.Serializable {

	// Fields

	private String bjdm;
	private String nj;
	private String userDm;
	private String bjmc;
	private String userYxid;
	private String yxmc;
	private String userZydm;
	private String zymc;
	private String xqMc;
	private String xqDm;
	private String xz;
	private Short bjrs;
	private String fdyxm;
	private String fdygh;
	private String pycc;
	private String pyccmc;

	// Constructors

	/** default constructor */
	public Clazz() {
	}

	/** minimal constructor */
	public Clazz(String bjdm) {
		this.bjdm = bjdm;
	}

	// Property accessors
	@Id
	@Column(name = "BJDM", unique = true, nullable = false, length = 10)
	public String getBjdm() {
		return this.bjdm;
	}

	public void setBjdm(String bjdm) {
		this.bjdm = bjdm;
	}

	@Column(name = "NJ", length = 4)
	public String getNj() {
		return this.nj;
	}

	public void setNj(String nj) {
		this.nj = nj;
	}

	@Column(name = "USER_DM", length = 50)
	public String getUserDm() {
		return this.userDm;
	}

	public void setUserDm(String userDm) {
		this.userDm = userDm;
	}

	@Column(name = "BJMC", length = 50)
	public String getBjmc() {
		return this.bjmc;
	}

	public void setBjmc(String bjmc) {
		this.bjmc = bjmc;
	}

	@Column(name = "USER_YXID", length = 10)
	public String getUserYxid() {
		return this.userYxid;
	}

	public void setUserYxid(String userYxid) {
		this.userYxid = userYxid;
	}

	@Column(name = "YXMC", length = 32)
	public String getYxmc() {
		return this.yxmc;
	}

	public void setYxmc(String yxmc) {
		this.yxmc = yxmc;
	}

	@Column(name = "USER_ZYDM", length = 10)
	public String getUserZydm() {
		return this.userZydm;
	}

	public void setUserZydm(String userZydm) {
		this.userZydm = userZydm;
	}

	@Column(name = "ZYMC", length = 50)
	public String getZymc() {
		return this.zymc;
	}

	public void setZymc(String zymc) {
		this.zymc = zymc;
	}

	@Column(name = "XQ_MC", length = 50)
	public String getXqMc() {
		return this.xqMc;
	}

	public void setXqMc(String xqMc) {
		this.xqMc = xqMc;
	}

	@Column(name = "XQ_DM", length = 10)
	public String getXqDm() {
		return this.xqDm;
	}

	public void setXqDm(String xqDm) {
		this.xqDm = xqDm;
	}

	@Column(name = "XZ", length = 10)
	public String getXz() {
		return this.xz;
	}

	public void setXz(String xz) {
		this.xz = xz;
	}

	@Column(name = "BJRS", precision = 3, scale = 0)
	public Short getBjrs() {
		return this.bjrs;
	}

	public void setBjrs(Short bjrs) {
		this.bjrs = bjrs;
	}

	@Column(name = "FDYXM", length = 50)
	public String getFdyxm() {
		return this.fdyxm;
	}

	public void setFdyxm(String fdyxm) {
		this.fdyxm = fdyxm;
	}

	@Column(name = "FDYGH", length = 50)
	public String getFdygh() {
		return this.fdygh;
	}

	public void setFdygh(String fdygh) {
		this.fdygh = fdygh;
	}

	@Column(name = "PYCC", length = 6)
	public String getPycc() {
		return this.pycc;
	}

	public void setPycc(String pycc) {
		this.pycc = pycc;
	}

	@Column(name = "PYCCMC", length = 20)
	public String getPyccmc() {
		return this.pyccmc;
	}

	public void setPyccmc(String pyccmc) {
		this.pyccmc = pyccmc;
	}

}