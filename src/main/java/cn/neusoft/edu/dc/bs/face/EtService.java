package cn.neusoft.edu.dc.bs.face;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Remote;

@Remote
@Local
@SuppressWarnings("rawtypes")
/**
 	getDepart()
	getMajor()
	getExecutiveClazz(grade,dept)
	getEscheduleFormat1(academicyearno , termno)
	getEstuselectcourse(academicyearno , termno,teachingclassno)
	getEteatask(academicyearno,termno,teachingclassno,teacherno)
*/
public interface EtService {

	/**
	 * 取得部门
	 * @return
	 */
	List getDepart();
	
	/**
	 * 取得专业
	 * @return
	 */
	List getMajor();
	
	/**
	 * 取得行政班级
	 * @param grade
	 * @param dept
	 * @return
	 */
	List getExecutiveClazz(String grade,String dept);
	/**
	 * TQM学期课表
	 * @param year 学年
	 * @param term 学期
	 * @return
	 */
	
	List getSchedule(String year,String term);
	
	/**
	 * TQE学期正选课结果
	 * @param year 学年
	 * @param term 学期
	 * @return
	 */
	List getStuSelectCourse(String year,String term,String teachingclassno);
	
	/**
	 * TQE学期教学任务
	 * @param year 学年
	 * @param term 学期
	 * @return
	 */
	List getTeaTask(String year,String term,String teachingclassno,String teacherno);
	
}