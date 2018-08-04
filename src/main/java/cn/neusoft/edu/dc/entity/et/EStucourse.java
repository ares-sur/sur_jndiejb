package cn.neusoft.edu.dc.entity.et;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "E_STUCOURSE", schema = "ETDC")
@IdClass(EStucourseId.class)
public class EStucourse implements java.io.Serializable {

	
	@Id private String academicyearno;
	@Id private String termno;
	@Id private String tweek;
	@Id private String jc;
	@Id private String stuid;
	@Id private String weekday;
	
	private String clazz;
	private String courseid;
	private String coursename;
	private String teacherid;
	private String stuname;
	private String roomid;
	private String roomname;

	public EStucourse() {
	}
	
	@Column(name = "ACADEMICYEARNO", length = 4)
	public String getAcademicyearno() {
		return this.academicyearno;
	}

	public void setAcademicyearno(String academicyearno) {
		this.academicyearno = academicyearno;
	}

	@Column(name = "TERMNO", length = 2)
	public String getTermno() {
		return this.termno;
	}

	public void setTermno(String termno) {
		this.termno = termno;
	}

	@Column(name = "TWEEK", length = 200)
	public String getTweek() {
		return this.tweek;
	}

	public void setTweek(String tweek) {
		this.tweek = tweek;
	}

	@Column(name = "JC", length = 50)
	public String getJc() {
		return this.jc;
	}

	public void setJc(String jc) {
		this.jc = jc;
	}

	@Column(name = "STUID", nullable = false, length = 50)
	public String getStuid() {
		return this.stuid;
	}

	public void setStuid(String stuid) {
		this.stuid = stuid;
	}
	
	@Column(name = "WEEKDAY", length = 2)
	public String getWeekday() {
		return this.weekday;
	}

	public void setWeekday(String weekday) {
		this.weekday = weekday;
	}

	@Column(name = "CLAZZ", length = 12)
	public String getClazz() {
		return this.clazz;
	}

	public void setClazz(String clazz) {
		this.clazz = clazz;
	}

	@Column(name = "COURSEID", length = 10)
	public String getCourseid() {
		return this.courseid;
	}

	public void setCourseid(String courseid) {
		this.courseid = courseid;
	}

	@Column(name = "COURSENAME")
	public String getCoursename() {
		return this.coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	@Column(name = "TEACHERID", length = 50)
	public String getTeacherid() {
		return this.teacherid;
	}

	public void setTeacherid(String teacherid) {
		this.teacherid = teacherid;
	}

	@Column(name = "STUNAME", length = 50)
	public String getStuname() {
		return this.stuname;
	}

	public void setStuname(String stuname) {
		this.stuname = stuname;
	}

	public String getRoomid() {
		return roomid;
	}

	public void setRoomid(String roomid) {
		this.roomid = roomid;
	}

	public String getRoomname() {
		return roomname;
	}

	public void setRoomname(String roomname) {
		this.roomname = roomname;
	}

	@Override
	public String toString() {
		return "EStucourse [academicyearno=" + academicyearno + ", termno="
				+ termno + ", tweek=" + tweek + ", jc=" + jc + ", stuid="
				+ stuid + ", weekday=" + weekday + ", clazz=" + clazz
				+ ", courseid=" + courseid + ", coursename=" + coursename
				+ ", teacherid=" + teacherid + ", stuname=" + stuname
				+ ", roomid=" + roomid + ", roomname=" + roomname + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((academicyearno == null) ? 0 : academicyearno.hashCode());
		result = prime * result
				+ ((courseid == null) ? 0 : courseid.hashCode());
		result = prime * result + ((jc == null) ? 0 : jc.hashCode());
		result = prime * result + ((stuid == null) ? 0 : stuid.hashCode());
		result = prime * result
				+ ((teacherid == null) ? 0 : teacherid.hashCode());
		result = prime * result + ((termno == null) ? 0 : termno.hashCode());
		result = prime * result + ((tweek == null) ? 0 : tweek.hashCode());
		result = prime * result + ((weekday == null) ? 0 : weekday.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EStucourse other = (EStucourse) obj;
		if (academicyearno == null) {
			if (other.academicyearno != null)
				return false;
		} else if (!academicyearno.equals(other.academicyearno))
			return false;
		if (courseid == null) {
			if (other.courseid != null)
				return false;
		} else if (!courseid.equals(other.courseid))
			return false;
		if (jc == null) {
			if (other.jc != null)
				return false;
		} else if (!jc.equals(other.jc))
			return false;
		if (stuid == null) {
			if (other.stuid != null)
				return false;
		} else if (!stuid.equals(other.stuid))
			return false;
		if (teacherid == null) {
			if (other.teacherid != null)
				return false;
		} else if (!teacherid.equals(other.teacherid))
			return false;
		if (termno == null) {
			if (other.termno != null)
				return false;
		} else if (!termno.equals(other.termno))
			return false;
		if (tweek == null) {
			if (other.tweek != null)
				return false;
		} else if (!tweek.equals(other.tweek))
			return false;
		if (weekday == null) {
			if (other.weekday != null)
				return false;
		} else if (!weekday.equals(other.weekday))
			return false;
		return true;
	}
	
}