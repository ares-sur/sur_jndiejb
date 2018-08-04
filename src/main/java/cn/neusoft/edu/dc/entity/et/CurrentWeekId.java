package cn.neusoft.edu.dc.entity.et;

import javax.persistence.Column;

@SuppressWarnings("serial")
public class CurrentWeekId implements java.io.Serializable {

	private String academicyearno;
	private String termno;

	public CurrentWeekId() {
	}

	@Column(name = "ACADEMICYEARNO", nullable = false, length = 5)
	public String getAcademicyearno() {
		return this.academicyearno;
	}

	public void setAcademicyearno(String academicyearno) {
		this.academicyearno = academicyearno;
	}

	@Column(name = "TERMNO", nullable = false, length = 1)
	public String getTermno() {
		return this.termno;
	}

	public void setTermno(String termno) {
		this.termno = termno;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CurrentWeekId))
			return false;
		CurrentWeekId castOther = (CurrentWeekId) other;

		return ((this.getAcademicyearno() == castOther.getAcademicyearno()) || (this
				.getAcademicyearno() != null
				&& castOther.getAcademicyearno() != null && this
				.getAcademicyearno().equals(castOther.getAcademicyearno())))
				&& ((this.getTermno() == castOther.getTermno()) || (this
						.getTermno() != null && castOther.getTermno() != null && this
						.getTermno().equals(castOther.getTermno())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getAcademicyearno() == null ? 0 : this.getAcademicyearno()
						.hashCode());
		result = 37 * result
				+ (getTermno() == null ? 0 : this.getTermno().hashCode());
		return result;
	}

}