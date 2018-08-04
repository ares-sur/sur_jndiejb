package cn.neusoft.edu.dc.entity.et;

import javax.persistence.Column;


@SuppressWarnings("serial")
//@Embeddable
public class EScheduleId implements java.io.Serializable {

	// Fields

	private String academicyearno;
	private String termno;
	private String teachingclassno;
	private String courseno;
	private String teacherno;
	private Byte beginweek;
	private Byte endweek;

	// Constructors

	/** default constructor */
	public EScheduleId() {
	}

	/** full constructor */
	public EScheduleId(String academicyearno, String termno,
			String teachingclassno, String courseno, String teacherno,
			Byte beginweek, Byte endweek) {
		this.academicyearno = academicyearno;
		this.termno = termno;
		this.teachingclassno = teachingclassno;
		this.courseno = courseno;
		this.teacherno = teacherno;
		this.beginweek = beginweek;
		this.endweek = endweek;
	}

	// Property accessors

	@Column(name = "ACADEMICYEARNO", nullable = false, length = 10)
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

	@Column(name = "TEACHINGCLASSNO", nullable = false, length = 13)
	public String getTeachingclassno() {
		return this.teachingclassno;
	}

	public void setTeachingclassno(String teachingclassno) {
		this.teachingclassno = teachingclassno;
	}

	@Column(name = "COURSENO", nullable = false, length = 15)
	public String getCourseno() {
		return this.courseno;
	}

	public void setCourseno(String courseno) {
		this.courseno = courseno;
	}

	@Column(name = "TEACHERNO", nullable = false, length = 20)
	public String getTeacherno() {
		return this.teacherno;
	}

	public void setTeacherno(String teacherno) {
		this.teacherno = teacherno;
	}

	@Column(name = "BEGINWEEK", nullable = false, precision = 2, scale = 0)
	public Byte getBeginweek() {
		return this.beginweek;
	}

	public void setBeginweek(Byte beginweek) {
		this.beginweek = beginweek;
	}

	@Column(name = "ENDWEEK", nullable = false, precision = 2, scale = 0)
	public Byte getEndweek() {
		return this.endweek;
	}

	public void setEndweek(Byte endweek) {
		this.endweek = endweek;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EScheduleId))
			return false;
		EScheduleId castOther = (EScheduleId) other;

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
								castOther.getTeachingclassno())))
				&& ((this.getCourseno() == castOther.getCourseno()) || (this
						.getCourseno() != null
						&& castOther.getCourseno() != null && this
						.getCourseno().equals(castOther.getCourseno())))
				&& ((this.getTeacherno() == castOther.getTeacherno()) || (this
						.getTeacherno() != null
						&& castOther.getTeacherno() != null && this
						.getTeacherno().equals(castOther.getTeacherno())))
				&& ((this.getBeginweek() == castOther.getBeginweek()) || (this
						.getBeginweek() != null
						&& castOther.getBeginweek() != null && this
						.getBeginweek().equals(castOther.getBeginweek())))
				&& ((this.getEndweek() == castOther.getEndweek()) || (this
						.getEndweek() != null && castOther.getEndweek() != null && this
						.getEndweek().equals(castOther.getEndweek())));
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
		result = 37 * result
				+ (getCourseno() == null ? 0 : this.getCourseno().hashCode());
		result = 37 * result
				+ (getTeacherno() == null ? 0 : this.getTeacherno().hashCode());
		result = 37 * result
				+ (getBeginweek() == null ? 0 : this.getBeginweek().hashCode());
		result = 37 * result
				+ (getEndweek() == null ? 0 : this.getEndweek().hashCode());
		return result;
	}

}