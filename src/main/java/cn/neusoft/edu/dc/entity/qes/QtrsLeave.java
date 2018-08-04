package cn.neusoft.edu.dc.entity.qes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "QTRSLEAVE_VIEW", schema = "UFS")
public class QtrsLeave implements java.io.Serializable {

	// Fields

	private Integer aflid;
	private String studentno;
	private String studentname;
	private String departmentname;
	private String classname;
	private String startdate;
	private String startsection;
	private String enddate;
	private String endsection;
	private Integer checkid;
	private String telephone;
	private String reason;
	private String teacherno;
	private String afltype;
	private String submittime;

	// Property accessors
	@Id
	@Column(name = "AFLID", nullable = false, precision = 22, scale = 0)
	public Integer getAflid() {
		return this.aflid;
	}

	public void setAflid(Integer aflid) {
		this.aflid = aflid;
	}

	@Column(name = "STUDENTNO", nullable = false, length = 20)
	public String getStudentno() {
		return this.studentno;
	}

	public void setStudentno(String studentno) {
		this.studentno = studentno;
	}

	@Column(name = "STUDENTNAME", length = 50)
	public String getStudentname() {
		return this.studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	@Column(name = "DEPARTMENTNAME", length = 100)
	public String getDepartmentname() {
		return this.departmentname;
	}

	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}

	@Column(name = "CLASSNAME", length = 100)
	public String getClassname() {
		return this.classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	@Column(name = "STARTDATE", length = 10)
	public String getStartdate() {
		return this.startdate;
	}

	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}

	@Column(name = "STARTSECTION", length = 2)
	public String getStartsection() {
		return this.startsection;
	}

	public void setStartsection(String startsection) {
		this.startsection = startsection;
	}

	@Column(name = "ENDDATE", length = 10)
	public String getEnddate() {
		return this.enddate;
	}

	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}

	@Column(name = "ENDSECTION", length = 2)
	public String getEndsection() {
		return this.endsection;
	}

	public void setEndsection(String endsection) {
		this.endsection = endsection;
	}

	@Column(name = "CHECKID", precision = 22, scale = 0)
	public Integer getCheckid() {
		return this.checkid;
	}

	public void setCheckid(Integer checkid) {
		this.checkid = checkid;
	}

	@Column(name = "TELEPHONE", length = 20)
	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Column(name = "REASON", length = 1000)
	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	@Column(name = "TEACHERNO", nullable = false, length = 20)
	public String getTeacherno() {
		return this.teacherno;
	}

	public void setTeacherno(String teacherno) {
		this.teacherno = teacherno;
	}

	@Column(name = "AFLTYPE", nullable = false, length = 1)
	public String getAfltype() {
		return this.afltype;
	}

	public void setAfltype(String afltype) {
		this.afltype = afltype;
	}

	public String getSubmittime() {
		return submittime;
	}

	public void setSubmittime(String submittime) {
		this.submittime = submittime;
	}
	
}