package cn.neusoft.edu.dc.entity.qes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@SuppressWarnings("serial")
@Entity
@Table(name = "V_TUTEACHERCLASSKG", schema = "UFS")
public class Teacherclass implements java.io.Serializable {

	// Fields

	private Long teacherclassid;
	private String teacherno;
	private String classno;
	private String classname;

	// Constructors

	/** default constructor */
	public Teacherclass() {
	}

	// Property accessors
	@Id
	@Column(name = "TEACHERCLASSID", unique = true, nullable = false, precision = 10, scale = 0)
	public Long getTeacherclassid() {
		return this.teacherclassid;
	}

	public void setTeacherclassid(Long teacherclassid) {
		this.teacherclassid = teacherclassid;
	}

	@Column(name = "TEACHERNO", nullable = false, length = 20)
	public String getTeacherno() {
		return this.teacherno;
	}

	public void setTeacherno(String teacherno) {
		this.teacherno = teacherno;
	}

	@Column(name = "CLASSNO", nullable = false, length = 10)
	public String getClassno() {
		return this.classno;
	}

	public void setClassno(String classno) {
		this.classno = classno;
	}

	@Column(name = "classname", nullable = false, length = 200)
	public String getClassname() {
		return this.classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

}