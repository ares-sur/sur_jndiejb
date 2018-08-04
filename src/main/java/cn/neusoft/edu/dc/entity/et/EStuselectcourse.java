package cn.neusoft.edu.dc.entity.et;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@IdClass(EStuselectcourseId.class)
@Table(name = "E_VSTUSELECTCOURSE", schema = "ETDC")
public class EStuselectcourse implements java.io.Serializable {

	@Id private String academicyearno;
	@Id private String termno;
	@Id private String studentno;
	@Id private String courseno;
	@Id private String teachingclassno;
	
	//private EStuselectcourseId id;
	private String studentname;
	private String coursename;
	private Double credit;
	private Short classhour;
	private String coursetype1name;
	private String coursetype2name;
	
	private String termname;
	private String classno;
	private String classname;
	private String departmentno;
	private String departmentname;
	private String coursetype;
	private String photopath;
	private String cxflag;

	// Constructors

	/** default constructor */
	public EStuselectcourse() {
	}

	public String getAcademicyearno() {
		return academicyearno;
	}

	public void setAcademicyearno(String academicyearno) {
		this.academicyearno = academicyearno;
	}

	public String getTermno() {
		return termno;
	}

	public void setTermno(String termno) {
		this.termno = termno;
	}

	public String getStudentno() {
		return studentno;
	}

	public void setStudentno(String studentno) {
		this.studentno = studentno;
	}

	public String getCourseno() {
		return courseno;
	}

	public void setCourseno(String courseno) {
		this.courseno = courseno;
	}

	@Column(name = "STUDENTNAME", length = 50)
	public String getStudentname() {
		return this.studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	@Column(name = "COURSENAME")
	public String getCoursename() {
		return this.coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	@Column(name = "CREDIT", precision = 3, scale = 1)
	public Double getCredit() {
		return this.credit;
	}

	public void setCredit(Double credit) {
		this.credit = credit;
	}

	@Column(name = "CLASSHOUR", precision = 3, scale = 0)
	public Short getClasshour() {
		return this.classhour;
	}

	public void setClasshour(Short classhour) {
		this.classhour = classhour;
	}

	@Column(name = "COURSETYPE1NAME", length = 40)
	public String getCoursetype1name() {
		return this.coursetype1name;
	}

	public void setCoursetype1name(String coursetype1name) {
		this.coursetype1name = coursetype1name;
	}

	@Column(name = "COURSETYPE2NAME", length = 40)
	public String getCoursetype2name() {
		return this.coursetype2name;
	}

	public void setCoursetype2name(String coursetype2name) {
		this.coursetype2name = coursetype2name;
	}

	@Column(name = "TEACHINGCLASSNO", length = 20)
	public String getTeachingclassno() {
		return this.teachingclassno;
	}

	public void setTeachingclassno(String teachingclassno) {
		this.teachingclassno = teachingclassno;
	}

	@Column(name = "TERMNAME", length = 20)
	public String getTermname() {
		return this.termname;
	}

	public void setTermname(String termname) {
		this.termname = termname;
	}

	@Column(name = "CLASSNO", nullable = false, length = 20)
	public String getClassno() {
		return this.classno;
	}

	public void setClassno(String classno) {
		this.classno = classno;
	}

	@Column(name = "CLASSNAME", nullable = false, length = 100)
	public String getClassname() {
		return this.classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
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

	@Column(name = "COURSETYPE", length = 1)
	public String getCoursetype() {
		return this.coursetype;
	}

	public void setCoursetype(String coursetype) {
		this.coursetype = coursetype;
	}

	@Column(name = "PHOTOPATH", length = 500)
	public String getPhotopath() {
		return photopath;
	}

	public void setPhotopath(String photopath) {
		this.photopath = photopath;
	}
	
	@Column(name = "CXFLAG")
	public String getCxflag() {
		return cxflag;
	}

	public void setCxflag(String cxflag) {
		this.cxflag = cxflag;
	}

}