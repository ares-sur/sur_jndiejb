package cn.neusoft.edu.dc.entity.et;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "E_GRADQUAL", schema = "ETDC")
public class EGradqual implements java.io.Serializable {

	// Fields

	private String userXh;
	private String rxnj;
	private String xh;
	private String xm;
	private String xmpy;
	private String cym;
	private String xb;
	private Date csrq;
	private String sfzh;
	private String gkksh;
	private String zkzh;
	private String mz;
	private String jg;
	private String sysf;
	private String sydq;
	private String lxdz;
	private String yzbm;
	private String lxr;
	private String lxdh;
	private String mobile;
	private String email;
	private String zzmm;
	private Date rxrq;
	private Double rxcj;
	private String gatqM;
	private String bxxs;
	private String jkzk;
	private String bz;
	private String nj;
	private String yxmc;
	private String zymc;
	private String bjmc;
	private Integer xz;
	private String sfzx;
	private String pyccmc;
	private String bjid;
	private String bjdmUser;
	private String zyid;
	private String zydmUser;
	private String yxid;
	private String yxdmUser;
	private String scharea;
	private String xjzt;
	private String ssMc;
	private String passwd;
	private String photopath;

	// Constructors

	/** default constructor */
	public EGradqual() {
	}

	/** minimal constructor */
	public EGradqual(String userXh, String xh) {
		this.userXh = userXh;
		this.xh = xh;
	}

	
	// Property accessors
	@Id
	@Column(name = "USER_XH", length = 50)
	public String getUserXh() {
		return this.userXh;
	}

	public void setUserXh(String userXh) {
		this.userXh = userXh;
	}

	@Column(name = "RXNJ", length = 4)
	public String getRxnj() {
		return this.rxnj;
	}

	public void setRxnj(String rxnj) {
		this.rxnj = rxnj;
	}

	@Column(name = "XH", nullable = false, length = 12)
	public String getXh() {
		return this.xh;
	}

	public void setXh(String xh) {
		this.xh = xh;
	}

	@Column(name = "XM", length = 50)
	public String getXm() {
		return this.xm;
	}

	public void setXm(String xm) {
		this.xm = xm;
	}

	@Column(name = "XMPY", length = 50)
	public String getXmpy() {
		return this.xmpy;
	}

	public void setXmpy(String xmpy) {
		this.xmpy = xmpy;
	}

	@Column(name = "CYM", length = 50)
	public String getCym() {
		return this.cym;
	}

	public void setCym(String cym) {
		this.cym = cym;
	}

	@Column(name = "XB", length = 1)
	public String getXb() {
		return this.xb;
	}

	public void setXb(String xb) {
		this.xb = xb;
	}

	@Column(name = "CSRQ", length = 7)
	public Date getCsrq() {
		return this.csrq;
	}

	public void setCsrq(Date csrq) {
		this.csrq = csrq;
	}

	@Column(name = "SFZH", length = 18)
	public String getSfzh() {
		return this.sfzh;
	}

	public void setSfzh(String sfzh) {
		this.sfzh = sfzh;
	}

	@Column(name = "GKKSH", length = 50)
	public String getGkksh() {
		return this.gkksh;
	}

	public void setGkksh(String gkksh) {
		this.gkksh = gkksh;
	}

	@Column(name = "ZKZH", length = 50)
	public String getZkzh() {
		return this.zkzh;
	}

	public void setZkzh(String zkzh) {
		this.zkzh = zkzh;
	}

	@Column(name = "MZ", length = 30)
	public String getMz() {
		return this.mz;
	}

	public void setMz(String mz) {
		this.mz = mz;
	}

	@Column(name = "JG", length = 30)
	public String getJg() {
		return this.jg;
	}

	public void setJg(String jg) {
		this.jg = jg;
	}

	@Column(name = "SYSF", length = 30)
	public String getSysf() {
		return this.sysf;
	}

	public void setSysf(String sysf) {
		this.sysf = sysf;
	}

	@Column(name = "SYDQ", length = 64)
	public String getSydq() {
		return this.sydq;
	}

	public void setSydq(String sydq) {
		this.sydq = sydq;
	}

	@Column(name = "LXDZ", length = 500)
	public String getLxdz() {
		return this.lxdz;
	}

	public void setLxdz(String lxdz) {
		this.lxdz = lxdz;
	}

	@Column(name = "YZBM", length = 6)
	public String getYzbm() {
		return this.yzbm;
	}

	public void setYzbm(String yzbm) {
		this.yzbm = yzbm;
	}

	@Column(name = "LXR", length = 50)
	public String getLxr() {
		return this.lxr;
	}

	public void setLxr(String lxr) {
		this.lxr = lxr;
	}

	@Column(name = "LXDH", length = 50)
	public String getLxdh() {
		return this.lxdh;
	}

	public void setLxdh(String lxdh) {
		this.lxdh = lxdh;
	}

	@Column(name = "MOBILE", length = 25)
	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Column(name = "EMAIL", length = 50)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "ZZMM", length = 50)
	public String getZzmm() {
		return this.zzmm;
	}

	public void setZzmm(String zzmm) {
		this.zzmm = zzmm;
	}

	@Column(name = "RXRQ", length = 7)
	public Date getRxrq() {
		return this.rxrq;
	}

	public void setRxrq(Date rxrq) {
		this.rxrq = rxrq;
	}

	@Column(name = "RXCJ", precision = 23, scale = 0)
	public Double getRxcj() {
		return this.rxcj;
	}

	public void setRxcj(Double rxcj) {
		this.rxcj = rxcj;
	}

	@Column(name = "GATQ_M", length = 30)
	public String getGatqM() {
		return this.gatqM;
	}

	public void setGatqM(String gatqM) {
		this.gatqM = gatqM;
	}

	@Column(name = "BXXS", length = 50)
	public String getBxxs() {
		return this.bxxs;
	}

	public void setBxxs(String bxxs) {
		this.bxxs = bxxs;
	}

	@Column(name = "JKZK", length = 30)
	public String getJkzk() {
		return this.jkzk;
	}

	public void setJkzk(String jkzk) {
		this.jkzk = jkzk;
	}

	@Column(name = "BZ", length = 1000)
	public String getBz() {
		return this.bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

	@Column(name = "NJ", length = 4)
	public String getNj() {
		return this.nj;
	}

	public void setNj(String nj) {
		this.nj = nj;
	}

	@Column(name = "YXMC", length = 32)
	public String getYxmc() {
		return this.yxmc;
	}

	public void setYxmc(String yxmc) {
		this.yxmc = yxmc;
	}

	@Column(name = "ZYMC", length = 50)
	public String getZymc() {
		return this.zymc;
	}

	public void setZymc(String zymc) {
		this.zymc = zymc;
	}

	@Column(name = "BJMC", length = 50)
	public String getBjmc() {
		return this.bjmc;
	}

	public void setBjmc(String bjmc) {
		this.bjmc = bjmc;
	}

	@Column(name = "XZ", precision = 22, scale = 0)
	public Integer getXz() {
		return this.xz;
	}

	public void setXz(Integer xz) {
		this.xz = xz;
	}

	@Column(name = "SFZX", length = 1)
	public String getSfzx() {
		return this.sfzx;
	}

	public void setSfzx(String sfzx) {
		this.sfzx = sfzx;
	}

	@Column(name = "PYCCMC", length = 20)
	public String getPyccmc() {
		return this.pyccmc;
	}

	public void setPyccmc(String pyccmc) {
		this.pyccmc = pyccmc;
	}

	@Column(name = "BJID", length = 10)
	public String getBjid() {
		return this.bjid;
	}

	public void setBjid(String bjid) {
		this.bjid = bjid;
	}

	@Column(name = "BJDM_USER", length = 50)
	public String getBjdmUser() {
		return this.bjdmUser;
	}

	public void setBjdmUser(String bjdmUser) {
		this.bjdmUser = bjdmUser;
	}

	@Column(name = "ZYID", length = 4)
	public String getZyid() {
		return this.zyid;
	}

	public void setZyid(String zyid) {
		this.zyid = zyid;
	}

	@Column(name = "ZYDM_USER", length = 10)
	public String getZydmUser() {
		return this.zydmUser;
	}

	public void setZydmUser(String zydmUser) {
		this.zydmUser = zydmUser;
	}

	@Column(name = "YXID", length = 5)
	public String getYxid() {
		return this.yxid;
	}

	public void setYxid(String yxid) {
		this.yxid = yxid;
	}

	@Column(name = "YXDM_USER", length = 10)
	public String getYxdmUser() {
		return this.yxdmUser;
	}

	public void setYxdmUser(String yxdmUser) {
		this.yxdmUser = yxdmUser;
	}

	@Column(name = "SCHAREA", length = 50)
	public String getScharea() {
		return this.scharea;
	}

	public void setScharea(String scharea) {
		this.scharea = scharea;
	}

	@Column(name = "XJZT", length = 30)
	public String getXjzt() {
		return this.xjzt;
	}

	public void setXjzt(String xjzt) {
		this.xjzt = xjzt;
	}

	@Column(name = "SS_MC", length = 30)
	public String getSsMc() {
		return this.ssMc;
	}

	public void setSsMc(String ssMc) {
		this.ssMc = ssMc;
	}

	@Column(name = "PASSWD", length = 50)
	public String getPasswd() {
		return this.passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	@Column(name = "PHOTOPATH", length = 4000)
	public String getPhotopath() {
		return this.photopath;
	}

	public void setPhotopath(String photopath) {
		this.photopath = photopath;
	}

}