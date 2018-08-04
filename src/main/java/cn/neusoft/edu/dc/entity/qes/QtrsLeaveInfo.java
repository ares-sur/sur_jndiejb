package cn.neusoft.edu.dc.entity.qes;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "QTRSLEAVEINFO", schema = "UFS")
public class QtrsLeaveInfo implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer aflid;
	private String studentno;
	private String afltype;
	private String academicyearno;
	private String termno;
	private Date startdate;
	private String startsection;
	private Date enddate;
	private String endsection;
	private String teacherno;
	private String attachment;
	private String telephone;
	private String reason;
	private String ischeck;
	private String isregain;
	private Date actstartdate;
	private Date actenddate;
	private String isvaild;
	private Date kqrecodedate;
	private Integer kqcnt;

	public QtrsLeaveInfo() {
	}
	
	@Id
	@Column(name = "AFLID", unique = true, nullable = false, precision = 22, scale = 0)
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

	@Column(name = "AFLTYPE", nullable = false, length = 1)
	public String getAfltype() {
		return this.afltype;
	}

	public void setAfltype(String afltype) {
		this.afltype = afltype;
	}

	@Column(name = "ACADEMICYEARNO", nullable = false, length = 5)
	public String getAcademicyearno() {
		return this.academicyearno;
	}

	public void setAcademicyearno(String academicyearno) {
		this.academicyearno = academicyearno;
	}

	@Column(name = "TERMNO", nullable = false, length = 2)
	public String getTermno() {
		return this.termno;
	}

	public void setTermno(String termno) {
		this.termno = termno;
	}

	
	@Column(name = "STARTDATE", nullable = false, length = 7)
	public Date getStartdate() {
		return this.startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	@Column(name = "STARTSECTION", nullable = false, length = 2)
	public String getStartsection() {
		return this.startsection;
	}

	public void setStartsection(String startsection) {
		this.startsection = startsection;
	}

	
	@Column(name = "ENDDATE", nullable = false, length = 7)
	public Date getEnddate() {
		return this.enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	@Column(name = "ENDSECTION", nullable = false, length = 2)
	public String getEndsection() {
		return this.endsection;
	}

	public void setEndsection(String endsection) {
		this.endsection = endsection;
	}

	@Column(name = "TEACHERNO", nullable = false, length = 20)
	public String getTeacherno() {
		return this.teacherno;
	}

	public void setTeacherno(String teacherno) {
		this.teacherno = teacherno;
	}

	@Column(name = "ATTACHMENT", length = 200)
	public String getAttachment() {
		return this.attachment;
	}

	public void setAttachment(String attachment) {
		this.attachment = attachment;
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

	@Column(name = "ISCHECK", nullable = false, length = 1)
	public String getIscheck() {
		return this.ischeck;
	}

	public void setIscheck(String ischeck) {
		this.ischeck = ischeck;
	}

	@Column(name = "ISREGAIN", nullable = false, length = 1)
	public String getIsregain() {
		return this.isregain;
	}

	public void setIsregain(String isregain) {
		this.isregain = isregain;
	}

	
	@Column(name = "ACTSTARTDATE", length = 7)
	public Date getActstartdate() {
		return this.actstartdate;
	}

	public void setActstartdate(Date actstartdate) {
		this.actstartdate = actstartdate;
	}

	
	@Column(name = "ACTENDDATE", length = 7)
	public Date getActenddate() {
		return this.actenddate;
	}

	public void setActenddate(Date actenddate) {
		this.actenddate = actenddate;
	}

	@Column(name = "ISVAILD", nullable = false, length = 1)
	public String getIsvaild() {
		return this.isvaild;
	}

	public void setIsvaild(String isvaild) {
		this.isvaild = isvaild;
	}

	
	@Column(name = "KQRECODEDATE", length = 7)
	public Date getKqrecodedate() {
		return this.kqrecodedate;
	}

	public void setKqrecodedate(Date kqrecodedate) {
		this.kqrecodedate = kqrecodedate;
	}

	@Column(name = "KQCNT", precision = 22, scale = 0)
	public Integer getKqcnt() {
		return this.kqcnt;
	}

	public void setKqcnt(Integer kqcnt) {
		this.kqcnt = kqcnt;
	}

}