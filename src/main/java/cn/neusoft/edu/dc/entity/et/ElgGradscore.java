package cn.neusoft.edu.dc.entity.et;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**
 * ElgGradscore entity. @author MyEclipse Persistence Tools
 */
//@SuppressWarnings("serial")
@Entity
@Table(name = "ELG_GRADSCORE", schema = "ETDC")
@IdClass(ElgGradscoreId.class)
public class ElgGradscore implements java.io.Serializable {

	private static final long serialVersionUID = 1;
	@Id private String stuno;
	@Id private String year;
	@Id private String term;
	private Double score;
	private String stuname;

	// Constructors

	/** default constructor */
	public ElgGradscore() {
	}

	public String getStuno() {
		return stuno;
	}

	public void setStuno(String stuno) {
		this.stuno = stuno;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	@Column(name = "SCORE", precision = 5)
	public Double getScore() {
		return this.score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	@Column(name = "STUNAME", length = 50)
	public String getStuname() {
		return this.stuname;
	}

	public void setStuname(String stuname) {
		this.stuname = stuname;
	}

}