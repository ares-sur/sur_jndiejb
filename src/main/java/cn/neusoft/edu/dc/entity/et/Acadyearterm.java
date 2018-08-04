package cn.neusoft.edu.dc.entity.et;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "M_ACADYEARTERM", schema = "ETDC")
@IdClass(AcadyeartermId.class)
public class Acadyearterm implements java.io.Serializable {

	@Id private String academicyearno;
	@Id private String termno;
	private Date startdate;
	private Integer weeknum;
	private Integer startweek;
	private String iscurr;
	private String yearname;
	private String termname;

	public Acadyearterm() {
	}

	@Column(name = "STARTDATE", nullable = false, length = 7)
	public Date getStartdate() {
		return this.startdate;
	}

	public String getAcademicyearno() {
		return academicyearno;
	}

	public void setAcademicyearno(String academicyearno) {
		this.academicyearno = academicyearno;
	}

	public String getTermno() {
		return termno;
	}

	public void setTermno(String termno) {
		this.termno = termno;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	@Column(name = "WEEKNUM", nullable = false, precision = 22, scale = 0)
	public Integer getWeeknum() {
		return this.weeknum;
	}

	public void setWeeknum(Integer weeknum) {
		this.weeknum = weeknum;
	}

	@Column(name = "STARTWEEK", nullable = false, precision = 22, scale = 0)
	public Integer getStartweek() {
		return this.startweek;
	}

	public void setStartweek(Integer startweek) {
		this.startweek = startweek;
	}

	@Column(name = "ISCURR", nullable = false, length = 1)
	public String getIscurr() {
		return this.iscurr;
	}

	public void setIscurr(String iscurr) {
		this.iscurr = iscurr;
	}

	public String getYearname() {
		return yearname;
	}

	public void setYearname(String yearname) {
		this.yearname = yearname;
	}

	public String getTermname() {
		return termname;
	}

	public void setTermname(String termname) {
		this.termname = termname;
	}

}