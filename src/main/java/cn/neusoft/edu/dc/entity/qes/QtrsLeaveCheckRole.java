package cn.neusoft.edu.dc.entity.qes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "QTRSLEAVECHECKROLE", schema = "UFS")
public class QtrsLeaveCheckRole implements java.io.Serializable {

	// Fields
	private static final long serialVersionUID = 1L;
	private String teacherno;
	private String departmentno;
	private Integer checkrole;

	// Constructors

	/** default constructor */
	public QtrsLeaveCheckRole() {
	}

	/** minimal constructor */
	public QtrsLeaveCheckRole(String teacherno) {
		this.teacherno = teacherno;
	}

	/** full constructor */
	public QtrsLeaveCheckRole(String teacherno, String departmentno,
			Integer checkrole) {
		this.teacherno = teacherno;
		this.departmentno = departmentno;
		this.checkrole = checkrole;
	}

	// Property accessors
	@Id
	@Column(name = "TEACHERNO", unique = true, nullable = false, length = 20)
	public String getTeacherno() {
		return this.teacherno;
	}

	public void setTeacherno(String teacherno) {
		this.teacherno = teacherno;
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