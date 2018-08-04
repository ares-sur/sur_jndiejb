package cn.neusoft.edu.dc.entity.et;

import javax.persistence.Column;

@SuppressWarnings("serial")
public class EStucourseId implements java.io.Serializable {

	private String academicyearno;
	private String termno;
	private String tweek;
	private String jc;
	private String stuid;
	private String weekday;

	public EStucourseId() {
	}

	@Column(name = "ACADEMICYEARNO", length = 4)
	public String getAcademicyearno() {
		return this.academicyearno;
	}

	public void setAcademicyearno(String academicyearno) {
		this.academicyearno = academicyearno;
	}

	@Column(name = "TERMNO", length = 2)
	public String getTermno() {
		return this.termno;
	}

	public void setTermno(String termno) {
		this.termno = termno;
	}

	@Column(name = "TWEEK", length = 200)
	public String getTweek() {
		return this.tweek;
	}

	public void setTweek(String tweek) {
		this.tweek = tweek;
	}

	@Column(name = "JC", length = 50)
	public String getJc() {
		return this.jc;
	}

	public void setJc(String jc) {
		this.jc = jc;
	}

	@Column(name = "STUID", nullable = false, length = 50)
	public String getStuid() {
		return this.stuid;
	}

	public void setStuid(String stuid) {
		this.stuid = stuid;
	}
	
	@Column(name = "WEEKDAY", length = 2)
	public String getWeekday() {
		return this.weekday;
	}

	public void setWeekday(String weekday) {
		this.weekday = weekday;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EStucourseId))
			return false;
		EStucourseId castOther = (EStucourseId) other;

		return ((this.getAcademicyearno() == castOther.getAcademicyearno()) || (this
				.getAcademicyearno() != null
				&& castOther.getAcademicyearno() != null && this
				.getAcademicyearno().equals(castOther.getAcademicyearno())))
				&& ((this.getTermno() == castOther.getTermno()) || (this
						.getTermno() != null && castOther.getTermno() != null && this
						.getTermno().equals(castOther.getTermno())))
				&& ((this.getTweek() == castOther.getTweek()) || (this
						.getTweek() != null && castOther.getTweek() != null && this
						.getTweek().equals(castOther.getTweek())))
				&& ((this.getJc() == castOther.getJc()) || (this.getJc() != null
						&& castOther.getJc() != null && this.getJc().equals(
						castOther.getJc())))
				&& ((this.getStuid() == castOther.getStuid()) || (this
						.getStuid() != null && castOther.getStuid() != null && this
						.getStuid().equals(castOther.getStuid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getAcademicyearno() == null ? 0 : this.getAcademicyearno()
						.hashCode());
		result = 37 * result
				+ (getTermno() == null ? 0 : this.getTermno().hashCode());
		result = 37 * result
				+ (getTweek() == null ? 0 : this.getTweek().hashCode());
		result = 37 * result + (getJc() == null ? 0 : this.getJc().hashCode());
		result = 37 * result
				+ (getStuid() == null ? 0 : this.getStuid().hashCode());
		return result;
	}

}