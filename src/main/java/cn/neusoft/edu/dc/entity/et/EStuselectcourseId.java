package cn.neusoft.edu.dc.entity.et;

import javax.persistence.Column;

@SuppressWarnings("serial")
public class EStuselectcourseId implements java.io.Serializable {

	// Fields

	private String academicyearno;
	private String termno;
	private String studentno;
	private String courseno;
	private String teachingclassno;
	
	// Constructors

	/** default constructor */
	public EStuselectcourseId() {
	}

	/** full constructor */
	public EStuselectcourseId(String academicyearno, String termno,
			String studentno, String courseno) {
		this.academicyearno = academicyearno;
		this.termno = termno;
		this.studentno = studentno;
		this.courseno = courseno;
	}

	// Property accessors

	@Column(name = "ACADEMICYEARNO", nullable = false, length = 5)
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

	@Column(name = "STUDENTNO", nullable = false, length = 20)
	public String getStudentno() {
		return this.studentno;
	}

	public void setStudentno(String studentno) {
		this.studentno = studentno;
	}

	@Column(name = "COURSENO", nullable = false, length = 20)
	public String getCourseno() {
		return this.courseno;
	}

	public void setCourseno(String courseno) {
		this.courseno = courseno;
	}

	@Column(name = "TEACHINGCLASSNO", nullable = false, length = 12)
	public String getTeachingclassno() {
		return teachingclassno;
	}

	public void setTeachingclassno(String teachingclassno) {
		this.teachingclassno = teachingclassno;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EStuselectcourseId))
			return false;
		EStuselectcourseId castOther = (EStuselectcourseId) other;

		return ((this.getAcademicyearno() == castOther.getAcademicyearno()) || (this
				.getAcademicyearno() != null
				&& castOther.getAcademicyearno() != null && this
				.getAcademicyearno().equals(castOther.getAcademicyearno())))
				&& ((this.getTermno() == castOther.getTermno()) || (this
						.getTermno() != null && castOther.getTermno() != null && this
						.getTermno().equals(castOther.getTermno())))
				&& ((this.getStudentno() == castOther.getStudentno()) || (this
						.getStudentno() != null
						&& castOther.getStudentno() != null && this
						.getStudentno().equals(castOther.getStudentno())))
				&& ((this.getCourseno() == castOther.getCourseno()) || (this
						.getCourseno() != null
						&& castOther.getCourseno() != null && this
						.getCourseno().equals(castOther.getCourseno())));
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
				+ (getStudentno() == null ? 0 : this.getStudentno().hashCode());
		result = 37 * result
				+ (getCourseno() == null ? 0 : this.getCourseno().hashCode());
		return result;
	}

}