package cn.neusoft.edu.dc.entity.kingo;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "K_STUCHANGE", schema = "ETDC")
@IdClass(KStuchangeId.class)
public class KStuchange implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id private String userXh;
	@Id private Date ydrq;
	private String xn;
	private String xqId;
	private String xh;
	private String xm;
	private String ydlb;
	private String YNj;
	private String YYxbmc;
	private String YZymc;
	private String YBjmc;
	private String YUserbjdm;
	private String YXjzt;
	private String YSfzx;
	private String nj;
	private String yxbmc;
	private String zymc;
	private String bjmc;
	private String userbjdm;
	private String xjzt;
	private String sfzx;
	private String ydyy;
	private String ydwh;
	private String yssm;

	// Constructors

	/** default constructor */
	public KStuchange() {
	}

	public String getUserXh() {
		return userXh;
	}

	public void setUserXh(String userXh) {
		this.userXh = userXh;
	}

	public Date getYdrq() {
		return ydrq;
	}

	public void setYdrq(Date ydrq) {
		this.ydrq = ydrq;
	}

	@Column(name = "XN", nullable = false, length = 4)
	public String getXn() {
		return this.xn;
	}

	public void setXn(String xn) {
		this.xn = xn;
	}

	@Column(name = "XQ_ID", length = 4)
	public String getXqId() {
		return this.xqId;
	}

	public void setXqId(String xqId) {
		this.xqId = xqId;
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

	@Column(name = "YDLB", length = 30)
	public String getYdlb() {
		return this.ydlb;
	}

	public void setYdlb(String ydlb) {
		this.ydlb = ydlb;
	}

	@Column(name = "Y_NJ", length = 4)
	public String getYNj() {
		return this.YNj;
	}

	public void setYNj(String YNj) {
		this.YNj = YNj;
	}

	@Column(name = "Y_YXBMC", length = 32)
	public String getYYxbmc() {
		return this.YYxbmc;
	}

	public void setYYxbmc(String YYxbmc) {
		this.YYxbmc = YYxbmc;
	}

	@Column(name = "Y_ZYMC", length = 50)
	public String getYZymc() {
		return this.YZymc;
	}

	public void setYZymc(String YZymc) {
		this.YZymc = YZymc;
	}

	@Column(name = "Y_BJMC", length = 50)
	public String getYBjmc() {
		return this.YBjmc;
	}

	public void setYBjmc(String YBjmc) {
		this.YBjmc = YBjmc;
	}

	@Column(name = "Y_USERBJDM", length = 50)
	public String getYUserbjdm() {
		return this.YUserbjdm;
	}

	public void setYUserbjdm(String YUserbjdm) {
		this.YUserbjdm = YUserbjdm;
	}

	@Column(name = "Y_XJZT", length = 2)
	public String getYXjzt() {
		return this.YXjzt;
	}

	public void setYXjzt(String YXjzt) {
		this.YXjzt = YXjzt;
	}

	@Column(name = "Y_SFZX", length = 2)
	public String getYSfzx() {
		return this.YSfzx;
	}

	public void setYSfzx(String YSfzx) {
		this.YSfzx = YSfzx;
	}

	@Column(name = "NJ", length = 4)
	public String getNj() {
		return this.nj;
	}

	public void setNj(String nj) {
		this.nj = nj;
	}

	@Column(name = "YXBMC", length = 32)
	public String getYxbmc() {
		return this.yxbmc;
	}

	public void setYxbmc(String yxbmc) {
		this.yxbmc = yxbmc;
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

	@Column(name = "USERBJDM", length = 50)
	public String getUserbjdm() {
		return this.userbjdm;
	}

	public void setUserbjdm(String userbjdm) {
		this.userbjdm = userbjdm;
	}

	@Column(name = "XJZT", length = 2)
	public String getXjzt() {
		return this.xjzt;
	}

	public void setXjzt(String xjzt) {
		this.xjzt = xjzt;
	}

	@Column(name = "SFZX", length = 2)
	public String getSfzx() {
		return this.sfzx;
	}

	public void setSfzx(String sfzx) {
		this.sfzx = sfzx;
	}

	@Column(name = "YDYY", length = 30)
	public String getYdyy() {
		return this.ydyy;
	}

	public void setYdyy(String ydyy) {
		this.ydyy = ydyy;
	}

	@Column(name = "YDWH", nullable = false, length = 50)
	public String getYdwh() {
		return this.ydwh;
	}

	public void setYdwh(String ydwh) {
		this.ydwh = ydwh;
	}

	@Column(name = "YSSM", length = 100)
	public String getYssm() {
		return this.yssm;
	}

	public void setYssm(String yssm) {
		this.yssm = yssm;
	}

}