package cn.neusoft.edu.dc.entity.master;

import javax.persistence.Column;

public class CourseremarkId implements java.io.Serializable {


	private static final long serialVersionUID = 1L;

	private String academicyearno;
	private String termno;
	private String teachingclassno;

	public CourseremarkId() {
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

	@Column(name = "TEACHINGCLASSNO", nullable = false, length = 13)
	public String getTeachingclassno() {
		return this.teachingclassno;
	}

	public void setTeachingclassno(String teachingclassno) {
		this.teachingclassno = teachingclassno;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CourseremarkId))
			return false;
		CourseremarkId castOther = (CourseremarkId) other;

		return ((this.getAcademicyearno() == castOther.getAcademicyearno()) || (this
				.getAcademicyearno() != null
				&& castOther.getAcademicyearno() != null && this
				.getAcademicyearno().equals(castOther.getAcademicyearno())))
				&& ((this.getTermno() == castOther.getTermno()) || (this
						.getTermno() != null && castOther.getTermno() != null && this
						.getTermno().equals(castOther.getTermno())))
				&& ((this.getTeachingclassno() == castOther
						.getTeachingclassno()) || (this.getTeachingclassno() != null
						&& castOther.getTeachingclassno() != null && this
						.getTeachingclassno().equals(
								castOther.getTeachingclassno())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getAcademicyearno() == null ? 0 : this.getAcademicyearno()
						.hashCode());
		result = 37 * result
				+ (getTermno() == null ? 0 : this.getTermno().hashCode());
		result = 37
				* result
				+ (getTeachingclassno() == null ? 0 : this.getTeachingclassno()
						.hashCode());
		return result;
	}

}