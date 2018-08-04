package cn.neusoft.edu.dc.entity.et;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@SuppressWarnings("serial")
@IdClass(EScheduleId.class)
@Entity
@Table(name = "E_SCHEDULE", schema = "ETDC")
public class ESchedule implements java.io.Serializable {

	//private EScheduleId id;
	
	@Id private String academicyearno;
	@Id private String termno;
	@Id private String teachingclassno;
	@Id private String courseno;
	@Id private String teacherno;
	@Id private Byte beginweek;
	@Id private Byte endweek;
	
	private String coursename;
	private String coursedepartment;
	private Double creditpoints;
	private Short allhour;
	private Short weekhour;
	private Boolean span;
	private Byte mon;
	private Byte tues;
	private Byte wed;
	private Byte thur;
	private Byte fri;
	private Byte sat;
	private Byte sun;
	private String monsingledual;
	private String tuessingledual;
	private String wedsingledual;
	private String thursingledual;
	private String frisingledual;
	private String satsingledual;
	private String sunsingledual;
	private String grade;
	private String classname;
	private String classroom;
	private Short studentscount;
	private Short standardcount;
	private String remarks;
	private String curtype;
	private Date createdate;
	private String creatorid;
	private Date modifydate;
	private String modifierid;
	private String operationtype;
	
	
	// Constructors

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

	public String getCourseno() {
		return courseno;
	}

	public void setCourseno(String courseno) {
		this.courseno = courseno;
	}

	public String getTeacherno() {
		return teacherno;
	}

	public void setTeacherno(String teacherno) {
		this.teacherno = teacherno;
	}

	public Byte getBeginweek() {
		return beginweek;
	}

	public void setBeginweek(Byte beginweek) {
		this.beginweek = beginweek;
	}

	public Byte getEndweek() {
		return endweek;
	}

	public void setEndweek(Byte endweek) {
		this.endweek = endweek;
	}

	/** default constructor */
	public ESchedule() {
	}

	@Column(name = "COURSENAME", nullable = false, length = 100)
	public String getCoursename() {
		return this.coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	@Column(name = "COURSEDEPARTMENT", nullable = false, length = 100)
	public String getCoursedepartment() {
		return this.coursedepartment;
	}

	public void setCoursedepartment(String coursedepartment) {
		this.coursedepartment = coursedepartment;
	}

	@Column(name = "CREDITPOINTS", precision = 3, scale = 1)
	public Double getCreditpoints() {
		return this.creditpoints;
	}

	public void setCreditpoints(Double creditpoints) {
		this.creditpoints = creditpoints;
	}

	@Column(name = "ALLHOUR", precision = 3, scale = 0)
	public Short getAllhour() {
		return this.allhour;
	}

	public void setAllhour(Short allhour) {
		this.allhour = allhour;
	}

	@Column(name = "WEEKHOUR", precision = 3, scale = 0)
	public Short getWeekhour() {
		return this.weekhour;
	}

	public void setWeekhour(Short weekhour) {
		this.weekhour = weekhour;
	}

	@Column(name = "SPAN", nullable = false, precision = 1, scale = 0)
	public Boolean getSpan() {
		return this.span;
	}

	public void setSpan(Boolean span) {
		this.span = span;
	}

	@Column(name = "MON", precision = 2, scale = 0)
	public Byte getMon() {
		return this.mon;
	}

	public void setMon(Byte mon) {
		this.mon = mon;
	}

	@Column(name = "TUES", precision = 2, scale = 0)
	public Byte getTues() {
		return this.tues;
	}

	public void setTues(Byte tues) {
		this.tues = tues;
	}

	@Column(name = "WED", precision = 2, scale = 0)
	public Byte getWed() {
		return this.wed;
	}

	public void setWed(Byte wed) {
		this.wed = wed;
	}

	@Column(name = "THUR", precision = 2, scale = 0)
	public Byte getThur() {
		return this.thur;
	}

	public void setThur(Byte thur) {
		this.thur = thur;
	}

	@Column(name = "FRI", precision = 2, scale = 0)
	public Byte getFri() {
		return this.fri;
	}

	public void setFri(Byte fri) {
		this.fri = fri;
	}

	@Column(name = "SAT", precision = 2, scale = 0)
	public Byte getSat() {
		return this.sat;
	}

	public void setSat(Byte sat) {
		this.sat = sat;
	}

	@Column(name = "SUN", precision = 2, scale = 0)
	public Byte getSun() {
		return this.sun;
	}

	public void setSun(Byte sun) {
		this.sun = sun;
	}

	@Column(name = "MONSINGLEDUAL", length = 1)
	public String getMonsingledual() {
		return this.monsingledual;
	}

	public void setMonsingledual(String monsingledual) {
		this.monsingledual = monsingledual;
	}

	@Column(name = "TUESSINGLEDUAL", length = 1)
	public String getTuessingledual() {
		return this.tuessingledual;
	}

	public void setTuessingledual(String tuessingledual) {
		this.tuessingledual = tuessingledual;
	}

	@Column(name = "WEDSINGLEDUAL", length = 1)
	public String getWedsingledual() {
		return this.wedsingledual;
	}

	public void setWedsingledual(String wedsingledual) {
		this.wedsingledual = wedsingledual;
	}

	@Column(name = "THURSINGLEDUAL", length = 1)
	public String getThursingledual() {
		return this.thursingledual;
	}

	public void setThursingledual(String thursingledual) {
		this.thursingledual = thursingledual;
	}

	@Column(name = "FRISINGLEDUAL", length = 1)
	public String getFrisingledual() {
		return this.frisingledual;
	}

	public void setFrisingledual(String frisingledual) {
		this.frisingledual = frisingledual;
	}

	@Column(name = "SATSINGLEDUAL", length = 1)
	public String getSatsingledual() {
		return this.satsingledual;
	}

	public void setSatsingledual(String satsingledual) {
		this.satsingledual = satsingledual;
	}

	@Column(name = "SUNSINGLEDUAL", length = 1)
	public String getSunsingledual() {
		return this.sunsingledual;
	}

	public void setSunsingledual(String sunsingledual) {
		this.sunsingledual = sunsingledual;
	}

	@Column(name = "GRADE", length = 10)
	public String getGrade() {
		return this.grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Column(name = "CLASSNAME", nullable = false, length = 200)
	public String getClassname() {
		return this.classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	@Column(name = "CLASSROOM", nullable = false, length = 1000)
	public String getClassroom() {
		return this.classroom;
	}

	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}

	@Column(name = "STUDENTSCOUNT", nullable = false, precision = 3, scale = 0)
	public Short getStudentscount() {
		return this.studentscount;
	}

	public void setStudentscount(Short studentscount) {
		this.studentscount = studentscount;
	}

	@Column(name = "STANDARDCOUNT", precision = 3, scale = 0)
	public Short getStandardcount() {
		return this.standardcount;
	}

	public void setStandardcount(Short standardcount) {
		this.standardcount = standardcount;
	}

	@Column(name = "REMARKS", length = 100)
	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Column(name = "CURTYPE", length = 1)
	public String getCurtype() {
		return this.curtype;
	}

	public void setCurtype(String curtype) {
		this.curtype = curtype;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CREATEDATE", length = 7)
	public Date getCreatedate() {
		return this.createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

	@Column(name = "CREATORID", length = 20)
	public String getCreatorid() {
		return this.creatorid;
	}

	public void setCreatorid(String creatorid) {
		this.creatorid = creatorid;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "MODIFYDATE", length = 7)
	public Date getModifydate() {
		return this.modifydate;
	}

	public void setModifydate(Date modifydate) {
		this.modifydate = modifydate;
	}

	@Column(name = "MODIFIERID", length = 20)
	public String getModifierid() {
		return this.modifierid;
	}

	public void setModifierid(String modifierid) {
		this.modifierid = modifierid;
	}

	@Column(name = "OPERATIONTYPE", length = 1)
	public String getOperationtype() {
		return this.operationtype;
	}

	public void setOperationtype(String operationtype) {
		this.operationtype = operationtype;
	}

}