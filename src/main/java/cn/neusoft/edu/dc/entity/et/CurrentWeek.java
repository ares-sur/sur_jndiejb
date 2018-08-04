package cn.neusoft.edu.dc.entity.et;

import javax.persistence.Column;
import javax.persistence.Id;

/*@Entity
@Table(name = "M_CURRENTWEEK", schema = "ETDC")
@IdClass(CurrentWeekId.class)*/
@SuppressWarnings("serial")
public class CurrentWeek implements java.io.Serializable {

	// Fields

	@Id private String academicyearno;
	@Id private String termno;
	private Integer tweek;
	private Integer weekday;
	private String yearname;
	private String termname;

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

	@Column(name = "TWEEK", nullable = false, precision = 22, scale = 0)
	public Integer getTweek() {
		return this.tweek;
	}

	public void setTweek(Integer tweek) {
		this.tweek = tweek;
	}

	@Column(name = "WEEKDAY", nullable = false, precision = 22, scale = 0)
	public Integer getWeekday() {
		return this.weekday;
	}

	public void setWeekday(Integer weekday) {
		this.weekday = weekday;
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