package cn.neusoft.edu.dc.entity.qes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "QTRSLEAVECHECKROLETEACHER_VIEW", schema = "UFS")
public class QtrsLeaveCheckRoleTeacherV implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private String teacherno;
	private String teachername;
	private String departmentno;
	private String departmentname;
	private Integer checkrole;
	private String checkrolename;
	private String teacheremail;

	// Constructors

	/** default constructor */
	public QtrsLeaveCheckRoleTeacherV() {
	}

	/** minimal constructor */
	public QtrsLeaveCheckRoleTeacherV(String teacherno) {
		this.teacherno = teacherno;
	}


	// Property accessors
	@Id
	@Column(name = "TEACHERNO", nullable = false, length = 20)
	public String getTeacherno() {
		return this.teacherno;
	}

	public void setTeacherno(String teacherno) {
		this.teacherno = teacherno;
	}

	@Column(name = "TEACHERNAME", length = 50)
	public String getTeachername() {
		return this.teachername;
	}

	public void setTeachername(String teachername) {
		this.teachername = teachername;
	}

	@Column(name = "DEPARTMENTNO", length = 3)
	public String getDepartmentno() {
		return this.departmentno;
	}

	public void setDepartmentno(String departmentno) {
		this.departmentno = departmentno;
	}

	@Column(name = "DEPARTMENTNAME", length = 100)
	public String getDepartmentname() {
		return this.departmentname;
	}

	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}

	@Column(name = "CHECKROLE", precision = 22, scale = 0)
	public Integer getCheckrole() {
		return this.checkrole;
	}

	public void setCheckrole(Integer checkrole) {
		this.checkrole = checkrole;
	}

	@Column(name = "CHECKROLENAME", length = 12)
	public String getCheckrolename() {
		return this.checkrolename;
	}

	public void setCheckrolename(String checkrolename) {
		this.checkrolename = checkrolename;
	}

	@Column(name = "TEACHEREMAIL", length = 100)
	public String getTeacheremail() {
		return this.teacheremail;
	}

	public void setTeacheremail(String teacheremail) {
		this.teacheremail = teacheremail;
	}

}