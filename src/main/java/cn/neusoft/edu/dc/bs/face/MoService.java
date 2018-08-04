package cn.neusoft.edu.dc.bs.face;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Remote;

import cn.neusoft.edu.dc.entity.auth.Userinfo;
import cn.neusoft.edu.dc.entity.et.Acadyearterm;
import cn.neusoft.edu.dc.entity.et.CurrentWeek;
import cn.neusoft.edu.dc.entity.et.EStuselectcourse;
import cn.neusoft.edu.dc.entity.et.ETeatask;
import cn.neusoft.edu.dc.entity.qes.QtrsLeave;
import cn.neusoft.edu.dc.entity.qes.QtrsLeaveCheckRole;
import cn.neusoft.edu.dc.entity.qes.QtrsLeaveCheckRoleTeacherV;
import cn.neusoft.edu.dc.entity.qes.QtrsLeaveCkparamTeacherV;
import cn.neusoft.edu.dc.entity.tqm.Tqmplan;

@Remote
@Local
public interface MoService {

	/**
	 * 
	 * @param userid
	 * @param password
	 * @return
	 */
	boolean isValid(String userid,String password);
	
	/**
	 * 
	 * @param userid
	 * @return
	 */
	Userinfo getUserinfo(String userid);
	
	/**
	 * 
	 * @return 当前学年度学期
	 */
	Acadyearterm getCurrYearTerm();
	
	/**
	 * 
	 * @return 当前学年度学期教学周(含周次)
	 */
	CurrentWeek getCurrTweek();
	
	/**
	 * 
	 * @param academicyearno
	 * @param termno
	 * @param teacherno 教师号
	 * @return 获取教师学期课表（教学任务）
	 */
	List<ETeatask> getTeaSchedule(String academicyearno,String termno,String teacherno);
	
	/**
	 * 
	 * @param teacherno 教师号
	 * @return //获取教师学期课表（教学任务）
	 */
	List<ETeatask> getTeaCurrentSchedule(String teacherno);
	
	/**
	 * 
	 * @param week 教学周
	 * @param day 周几
	 * @param teacherno 教师号
	 * @return 获取教师听课计划
	 */
	List<Tqmplan> getTeaCurrentMonitorPlan(Integer week,Integer day,String teacherno);
	
	
	/**
	 * 
	 * @param year
	 * @param term
	 * @param week
	 * @param day
	 * @param teacherno 教师号
	 * @return 获取教师听课计划
	 */
	List<Tqmplan> getTeaMonitorPlan(String year, String term,Integer week,Integer day,String teacherno);
	
	/**
	 * 
	 * @param teacherno 教师号 不应为空
	 * @param studentno
	 * @return 获取学生请假信息
	 */
	List<QtrsLeave> getQtrsLeaveInfo(String teacherno,String studentno);
	
	/**
	 * 获取学生选课信息(学生课表)
	 * @param year
	 * @param term
	 * @param studentno
	 * @return
	 */
	List<EStuselectcourse> getEStuselectcourse(String year ,String term,String studentno);
	
	/**
	 * 获取审批权限数据(素质教育)
	 * @param teacherno
	 * @param afltype
	 * @return
	 */
	QtrsLeaveCkparamTeacherV queryCKRole(String teacherno,String afltype);
	
	/**
	 * 获取审核教师系部和角色(素质教育)
	 * @param teacherno
	 * @return
	 */
	QtrsLeaveCheckRole queryACT(String teacherno);
	
	/**
	 * 获取审批教师信息(素质教育)
	 * @param departmentno
	 * @param checkrole
	 * @return
	 */
	List<QtrsLeaveCheckRoleTeacherV> getAskcheckTeacherlist(String departmentno,Integer checkrole);
}
