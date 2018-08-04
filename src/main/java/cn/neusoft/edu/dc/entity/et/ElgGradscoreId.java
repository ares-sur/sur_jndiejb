package cn.neusoft.edu.dc.entity.et;

import javax.persistence.Column;

@SuppressWarnings("serial")
public class ElgGradscoreId implements java.io.Serializable {

	private String stuno;
	private String year;
	private String term;

	public ElgGradscoreId() {
	}

	/** full constructor */
	public ElgGradscoreId(String stuno, String year, String term) {
		this.stuno = stuno;
		this.year = year;
		this.term = term;
	}

	// Property accessors

	@Column(name = "STUNO", length = 50)
	public String getStuno() {
		return this.stuno;
	}

	public void setStuno(String stuno) {
		this.stuno = stuno;
	}

	@Column(name = "YEAR", length = 4)
	public String getYear() {
		return this.year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	@Column(name = "TERM", length = 10)
	public String getTerm() {
		return this.term;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ElgGradscoreId))
			return false;
		ElgGradscoreId castOther = (ElgGradscoreId) other;

		return ((this.getStuno() == castOther.getStuno()) || (this.getStuno() != null
				&& castOther.getStuno() != null && this.getStuno().equals(
				castOther.getStuno())))
				&& ((this.getYear() == castOther.getYear()) || (this.getYear() != null
						&& castOther.getYear() != null && this.getYear()
						.equals(castOther.getYear())))
				&& ((this.getTerm() == castOther.getTerm()) || (this.getTerm() != null
						&& castOther.getTerm() != null && this.getTerm()
						.equals(castOther.getTerm())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getStuno() == null ? 0 : this.getStuno().hashCode());
		result = 37 * result
				+ (getYear() == null ? 0 : this.getYear().hashCode());
		result = 37 * result
				+ (getTerm() == null ? 0 : this.getTerm().hashCode());
		return result;
	}

}