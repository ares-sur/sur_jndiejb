package cn.neusoft.edu.dc.entity.kingo;

import java.sql.Date;

import javax.persistence.Column;

public class KStuchangeId implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private String userXh;
	private Date ydrq;

	// Constructors

	/** default constructor */
	public KStuchangeId() {
	}

	/** full constructor */
	public KStuchangeId(String userXh, Date ydrq) {
		this.userXh = userXh;
		this.ydrq = ydrq;
	}

	// Property accessors

	@Column(name = "USER_XH", length = 50)
	public String getUserXh() {
		return this.userXh;
	}

	public void setUserXh(String userXh) {
		this.userXh = userXh;
	}

	@Column(name = "YDRQ", length = 7)
	public Date getYdrq() {
		return this.ydrq;
	}

	public void setYdrq(Date ydrq) {
		this.ydrq = ydrq;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof KStuchangeId))
			return false;
		KStuchangeId castOther = (KStuchangeId) other;

		return ((this.getUserXh() == castOther.getUserXh()) || (this
				.getUserXh() != null && castOther.getUserXh() != null && this
				.getUserXh().equals(castOther.getUserXh())))
				&& ((this.getYdrq() == castOther.getYdrq()) || (this.getYdrq() != null
						&& castOther.getYdrq() != null && this.getYdrq()
						.equals(castOther.getYdrq())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getUserXh() == null ? 0 : this.getUserXh().hashCode());
		result = 37 * result
				+ (getYdrq() == null ? 0 : this.getYdrq().hashCode());
		return result;
	}

}