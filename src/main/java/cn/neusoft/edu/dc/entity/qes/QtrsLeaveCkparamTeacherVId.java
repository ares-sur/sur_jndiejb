package cn.neusoft.edu.dc.entity.qes;


public class QtrsLeaveCkparamTeacherVId implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 1L;
	private String teacherno;
	private String afltype;

	// Constructors

	/** default constructor */
	public QtrsLeaveCkparamTeacherVId() {
	}

	/** full constructor */
	public QtrsLeaveCkparamTeacherVId(String teacherno, String afltype) {
		this.teacherno = teacherno;
		this.afltype = afltype;
	}

	public String getTeacherno() {
		return this.teacherno;
	}

	public void setTeacherno(String teacherno) {
		this.teacherno = teacherno;
	}

	public String getAfltype() {
		return this.afltype;
	}

	public void setAfltype(String afltype) {
		this.afltype = afltype;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof QtrsLeaveCkparamTeacherVId))
			return false;
		QtrsLeaveCkparamTeacherVId castOther = (QtrsLeaveCkparamTeacherVId) other;

		return ((this.getTeacherno() == castOther.getTeacherno()) || (this
				.getTeacherno() != null && castOther.getTeacherno() != null && this
				.getTeacherno().equals(castOther.getTeacherno())))
				&& ((this.getAfltype() == castOther.getAfltype()) || (this
						.getAfltype() != null && castOther.getAfltype() != null && this
						.getAfltype().equals(castOther.getAfltype())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getTeacherno() == null ? 0 : this.getTeacherno().hashCode());
		result = 37 * result
				+ (getAfltype() == null ? 0 : this.getAfltype().hashCode());
		return result;
	}

}