package cn.neusoft.edu.dc.entity.et;

import javax.persistence.Column;

@SuppressWarnings("serial")
public class AcadyeartermId implements java.io.Serializable {

	private String academicyearno;
	private String termno;

	// Constructors

	/** default constructor */
	public AcadyeartermId() {
	}

	/** full constructor */
	public AcadyeartermId(String academicyearno, String termno) {
		this.academicyearno = academicyearno;
		this.termno = termno;
	}

	// Property accessors

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
		if (!(other instanceof AcadyeartermId))
			return false;
		AcadyeartermId castOther = (AcadyeartermId) other;

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