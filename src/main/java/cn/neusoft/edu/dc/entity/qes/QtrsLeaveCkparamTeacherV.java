package cn.neusoft.edu.dc.entity.qes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "QTRSLEAVECKPARAMTEACHER_VIEW", schema = "UFS")
@IdClass(QtrsLeaveCkparamTeacherVId.class)
public class QtrsLeaveCkparamTeacherV implements java.io.Serializable {

	// Fields
	private static final long serialVersionUID = 1L;
	@Id private String teacherno;
	@Id private String afltype;
	private Integer mindate;
	private Integer maxdate;
	private String departmentno;
	private Integer checkrole;

	// Constructors

	/** default constructor */
	public QtrsLeaveCkparamTeacherV() {
	}

	/** minimal constructor */
	public QtrsLeaveCkparamTeacherV(String teacherno) {
		this.teacherno = teacherno;
	}

	public String getAfltype() {
		return afltype;
	}

	public void setAfltype(String afltype) {
		this.afltype = afltype;
	}

	@Column(name = "TEACHERNO", nullable = false, length = 20)
	public String getTeacherno() {
		return this.teacherno;
	}

	public void setTeacherno(String teacherno) {
		this.teacherno = teacherno;
	}

	@Column(name = "MINDATE", precision = 22, scale = 0)
	public Integer getMindate() {
		return this.mindate;
	}

	public void setMindate(Integer mindate) {
		this.mindate = mindate;
	}

	@Column(name = "MAXDATE", precision = 22, scale = 0)
	public Integer getMaxdate() {
		return this.maxdate;
	}

	public void setMaxdate(Integer maxdate) {
		this.maxdate = maxdate;
	}

	@Column(name = "DEPARTMENTNO", length = 3)
	public String getDepartmentno() {
		return this.departmentno;
	}

	public void setDepartmentno(String departmentno) {
		this.departmentno = departmentno;
	}

	@Column(name = "CHECKROLE", precision = 22, scale = 0)
	public Integer getCheckrole() {
		return this.checkrole;
	}

	public void setCheckrole(Integer checkrole) {
		this.checkrole = checkrole;
	}

}