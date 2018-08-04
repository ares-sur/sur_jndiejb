package cn.neusoft.edu.dc.entity.et;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

//@SuppressWarnings("serial")
@Entity
@IdClass(ETeataskId.class)
@Table(name = "E_TEACTASK", schema = "ETDC")
public class ETeatask implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1262876027158674653L;
	//private static final long serialVersionUID = -4759831179954226024L;
	@Id private String academicyearno;
	@Id private String termno;
	@Id private String courseno;
	@Id private String teachingclassno;
	@Id private String courseweekord;

	private String coursename;
	private String teacherno;
	private String teachername;
	private String jcinfo;
	private String jcz;
	private String dweeks;
	private String sweeks;
	private String room;

	// Constructors

	/** default constructor */
	public ETeatask() {
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

	public String getCourseno() {
		return courseno;
	}

	public void setCourseno(String courseno) {
		this.courseno = courseno;
	}

	public String getTeachingclassno() {
		return teachingclassno;
	}

	public void setTeachingclassno(String teachingclassno) {
		this.teachingclassno = teachingclassno;
	}

	public String getCourseweekord() {
		return courseweekord;
	}

	public void setCourseweekord(String courseweekord) {
		this.courseweekord = courseweekord;
	}

	@Column(name = "COURSENAME")
	public String getCoursename() {
		return this.coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	@Column(name = "TEACHERNO", length = 50)
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

	public String getJcinfo() {
		return jcinfo;
	}

	public void setJcinfo(String jcinfo) {
		this.jcinfo = jcinfo;
	}

	public String getJcz() {
		return jcz;
	}

	public void setJcz(String jcz) {
		this.jcz = jcz;
	}

	public String getDweeks() {
		return dweeks;
	}

	public void setDweeks(String dweeks) {
		this.dweeks = dweeks;
	}

	public String getSweeks() {
		return sweeks;
	}

	public void setSweeks(String sweeks) {
		this.sweeks = sweeks;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}
	
}