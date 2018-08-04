package cn.neusoft.edu.dc.entity.master;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "MO_COURSEREMARK", schema = "MOEDU")
@IdClass(CourseremarkId.class)
public class Courseremark implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id private String academicyearno;
	@Id private String termno;
	@Id private String teachingclassno;
	private String teacherno;
	private String courseno;
	private String coursename;
	private String courseprognote;

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

	public String getTeachingclassno() {
		return teachingclassno;
	}

	public void setTeachingclassno(String teachingclassno) {
		this.teachingclassno = teachingclassno;
	}

	@Column(name = "TEACHERNO", nullable = false, length = 20)
	public String getTeacherno() {
		return this.teacherno;
	}

	public void setTeacherno(String teacherno) {
		this.teacherno = teacherno;
	}

	@Column(name = "COURSENO", nullable = false, length = 15)
	public String getCourseno() {
		return this.courseno;
	}

	public void setCourseno(String courseno) {
		this.courseno = courseno;
	}

	@Column(name = "COURSENAME", nullable = false, length = 100)
	public String getCoursename() {
		return this.coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	@Column(name = "COURSEPROGNOTE", length = 1000)
	public String getCourseprognote() {
		return this.courseprognote;
	}

	public void setCourseprognote(String courseprognote) {
		this.courseprognote = courseprognote;
	}

}