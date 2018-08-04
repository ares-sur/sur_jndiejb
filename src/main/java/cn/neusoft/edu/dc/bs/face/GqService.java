package cn.neusoft.edu.dc.bs.face;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Remote;

import cn.neusoft.edu.dc.entity.et.ElgGradscore;
import cn.neusoft.edu.dc.entity.et.ElgGradstulist;
import cn.neusoft.edu.dc.entity.et.ElgStucrdtobtn;
import cn.neusoft.edu.dc.entity.kingo.KStuchange;
import cn.neusoft.edu.dc.entity.kingo.KStuinfo;
import cn.neusoft.edu.dc.entity.qes.Teacherclass;

@Remote
@Local
/**
 * 毕业生资格审查
 */
public interface GqService {

	/**
	 * 按学号和姓名查找学生信息
	 * @param sid
	 * @param sname
	 * @return List 考虑学生可能重名
	 */
	List<KStuinfo> getStuinfo(String sid,String sname);
	
	/**
	 * 按学号和姓名查找具有毕业资格学生信息
	 * @param gradyear 格式:2014
	 * @param sid 学号
	 */
	List<ElgGradstulist> getGradQualStuinfo(Integer gradyear,String sid);
	
	/**
	 * 获取在校生学生学业进展要求
	 * @param sid
	 * @param sname
	 * @return
	 */
	List<ElgStucrdtobtn> getStuCurrentScore(String sid,String sname);
	
	/**
	 * 获取学生异动情况
	 * @param sid
	 * @param sname
	 * @return
	 */
	List<KStuchange> getStuChange(String sid,String sname);
	
	/**
	 * 获取辅导员带班信息
	 * @param tid
	 * @return
	 */
	List<Teacherclass> getTeaClazz(String tid);
	
	
	/**
	 * 
	 * @param stuno 
	 * @param year length=4
	 * @param term 1-3
	 * @return
	 */
	List<ElgGradscore> getGradScore(String stuno,String year,String term);
	
}
