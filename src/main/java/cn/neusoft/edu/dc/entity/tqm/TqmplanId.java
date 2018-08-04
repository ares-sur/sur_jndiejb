package cn.neusoft.edu.dc.entity.tqm;

import javax.persistence.Column;

public class TqmplanId implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private String academicyearno;
	private String termno;
	private String cmsrno;
	private String teacherno;

	// Constructors

	/** default constructor */
	public TqmplanId() {
	}

	/** full constructor */
	public TqmplanId(String academicyearno, String termno, String cmsrno,
			String teacherno) {
		this.academicyearno = academicyearno;
		this.termno = termno;
		this.cmsrno = cmsrno;
		this.teacherno = teacherno;
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

	@Column(name = "CMSRNO", nullable = false, length = 20)
	public String getCmsrno() {
		return this.cmsrno;
	}

	public void setCmsrno(String cmsrno) {
		this.cmsrno = cmsrno;
	}

	@Column(name = "TEACHERNO", nullable = false, length = 20)
	public String getTeacherno() {
		return this.teacherno;
	}

	public void setTeacherno(String teacherno) {
		this.teacherno = teacherno;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TqmplanId))
			return false;
		TqmplanId castOther = (TqmplanId) other;

		return ((this.getAcademicyearno() == castOther.getAcademicyearno()) || (this
				.getAcademicyearno() != null
				&& castOther.getAcademicyearno() != null && this
				.getAcademicyearno().equals(castOther.getAcademicyearno())))
				&& ((this.getTermno() == castOther.getTermno()) || (this
						.getTermno() != null && castOther.getTermno() != null && this
						.getTermno().equals(castOther.getTermno())))
				&& ((this.getCmsrno() == castOther.getCmsrno()) || (this
						.getCmsrno() != null && castOther.getCmsrno() != null && this
						.getCmsrno().equals(castOther.getCmsrno())))
				&& ((this.getTeacherno() == castOther.getTeacherno()) || (this
						.getTeacherno() != null
						&& castOther.getTeacherno() != null && this
						.getTeacherno().equals(castOther.getTeacherno())));
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
				+ (getCmsrno() == null ? 0 : this.getCmsrno().hashCode());
		result = 37 * result
				+ (getTeacherno() == null ? 0 : this.getTeacherno().hashCode());
		return result;
	}

}