package cn.neusoft.edu.dc.entity.et;

import javax.persistence.Column;

@SuppressWarnings("serial")
public class ETeataskId implements java.io.Serializable {

	private String academicyearno;
	private String termno;
	private String courseno;
	private String teachingclassno;
	private String courseweekord;

	// Constructors

	/** default constructor */
	public ETeataskId() {
	}

	/** full constructor */
	public ETeataskId(String academicyearno, String termno, String courseno,
			String teachingclassno, String courseweekord) {
		this.academicyearno = academicyearno;
		this.termno = termno;
		this.courseno = courseno;
		this.teachingclassno = teachingclassno;
		this.courseweekord = courseweekord;
	}

	// Property accessors

	@Column(name = "ACADEMICYEARNO", nullable = false, length = 20)
	public String getAcademicyearno() {
		return this.academicyearno;
	}

	public void setAcademicyearno(String academicyearno) {
		this.academicyearno = academicyearno;
	}

	@Column(name = "TERMNO", nullable = false, length = 2)
	public String getTermno() {
		return this.termno;
	}

	public void setTermno(String termno) {
		this.termno = termno;
	}

	@Column(name = "COURSENO", nullable = false, length = 20)
	public String getCourseno() {
		return this.courseno;
	}

	public void setCourseno(String courseno) {
		this.courseno = courseno;
	}

	@Column(name = "TEACHINGCLASSNO", nullable = false, length = 20)
	public String getTeachingclassno() {
		return this.teachingclassno;
	}

	public void setTeachingclassno(String teachingclassno) {
		this.teachingclassno = teachingclassno;
	}

	@Column(name = "COURSEWEEKORD", nullable = false, length = 112)
	public String getCourseweekord() {
		return this.courseweekord;
	}

	public void setCourseweekord(String courseweekord) {
		this.courseweekord = courseweekord;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ETeataskId))
			return false;
		ETeataskId castOther = (ETeataskId) other;

		return ((this.getAcademicyearno() == castOther.getAcademicyearno()) || (this
				.getAcademicyearno() != null
				&& castOther.getAcademicyearno() != null && this
				.getAcademicyearno().equals(castOther.getAcademicyearno())))
				&& ((this.getTermno() == castOther.getTermno()) || (this
						.getTermno() != null && castOther.getTermno() != null && this
						.getTermno().equals(castOther.getTermno())))
				&& ((this.getCourseno() == castOther.getCourseno()) || (this
						.getCourseno() != null
						&& castOther.getCourseno() != null && this
						.getCourseno().equals(castOther.getCourseno())))
				&& ((this.getTeachingclassno() == castOther
						.getTeachingclassno()) || (this.getTeachingclassno() != null
						&& castOther.getTeachingclassno() != null && this
						.getTeachingclassno().equals(
								castOther.getTeachingclassno())))
				&& ((this.getCourseweekord() == castOther.getCourseweekord()) || (this
						.getCourseweekord() != null
						&& castOther.getCourseweekord() != null && this
						.getCourseweekord()
						.equals(castOther.getCourseweekord())));
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
				+ (getCourseno() == null ? 0 : this.getCourseno().hashCode());
		result = 37
				* result
				+ (getTeachingclassno() == null ? 0 : this.getTeachingclassno()
						.hashCode());
		result = 37
				* result
				+ (getCourseweekord() == null ? 0 : this.getCourseweekord()
						.hashCode());
		return result;
	}

}