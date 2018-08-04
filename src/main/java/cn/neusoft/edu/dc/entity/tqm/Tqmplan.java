package cn.neusoft.edu.dc.entity.tqm;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "V_TQMPLAN", schema = "TQM2")
@IdClass(TqmplanId.class)
public class Tqmplan implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id private String academicyearno;
	@Id private String termno;
	@Id private String cmsrno;
	@Id private String teacherno;
	private String teachingclassno;
	private String courseno;
	private Byte beginweek;
	private Byte endweek;
	private Byte span;
	private String classroom;
	private Date plandate;
	private Byte planweek;
	private Byte planday;
	private String plansection;
	private String status;
	private String plantype;
	private Date createdate;
	private String creatorid;
	private Date modifydate;
	private String modifierid;
	private String teachername; // 教师姓名
	private String departmentname; // 所属系部
	private String coursename; // 课程名称

	
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

	public String getCmsrno() {
		return cmsrno;
	}

	public void setCmsrno(String cmsrno) {
		this.cmsrno = cmsrno;
	}

	public String getTeacherno() {
		return teacherno;
	}

	public void setTeacherno(String teacherno) {
		this.teacherno = teacherno;
	}


	@Column(name = "TEACHINGCLASSNO", nullable = false, length = 13)
	public String getTeachingclassno() {
		return this.teachingclassno;
	}

	public void setTeachingclassno(String teachingclassno) {
		this.teachingclassno = teachingclassno;
	}

	@Column(name = "COURSENO", nullable = false, length = 15)
	public String getCourseno() {
		return this.courseno;
	}

	public void setCourseno(String courseno) {
		this.courseno = courseno;
	}

	@Column(name = "BEGINWEEK", nullable = false, precision = 2, scale = 0)
	public Byte getBeginweek() {
		return this.beginweek;
	}

	public void setBeginweek(Byte beginweek) {
		this.beginweek = beginweek;
	}

	@Column(name = "ENDWEEK", nullable = false, precision = 2, scale = 0)
	public Byte getEndweek() {
		return this.endweek;
	}

	public void setEndweek(Byte endweek) {
		this.endweek = endweek;
	}

	@Column(name = "SPAN", nullable = false, precision = 2, scale = 0)
	public Byte getSpan() {
		return this.span;
	}

	public void setSpan(Byte span) {
		this.span = span;
	}

	@Column(name = "CLASSROOM", nullable = false, length = 4000)
	public String getClassroom() {
		return this.classroom;
	}

	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "PLANDATE", nullable = false, length = 7)
	public Date getPlandate() {
		return this.plandate;
	}

	public void setPlandate(Date plandate) {
		this.plandate = plandate;
	}

	@Column(name = "PLANWEEK", nullable = false, precision = 2, scale = 0)
	public Byte getPlanweek() {
		return this.planweek;
	}

	public void setPlanweek(Byte planweek) {
		this.planweek = planweek;
	}

	@Column(name = "PLANDAY", nullable = false, precision = 1, scale = 0)
	public Byte getPlanday() {
		return this.planday;
	}

	public void setPlanday(Byte planday) {
		this.planday = planday;
	}

	@Column(name = "PLANSECTION", nullable = false, length = 5)
	public String getPlansection() {
		return this.plansection;
	}

	public void setPlansection(String plansection) {
		this.plansection = plansection;
	}

	@Column(name = "STATUS", nullable = false, length = 1)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "PLANTYPE", nullable = false, length = 1)
	public String getPlantype() {
		return this.plantype;
	}

	public void setPlantype(String plantype) {
		this.plantype = plantype;
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

	public String getTeachername() {
		return teachername;
	}

	public void setTeachername(String teachername) {
		this.teachername = teachername;
	}

	public String getDepartmentname() {
		return departmentname;
	}

	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	
}