package cn.neusoft.edu.dc.bs.face;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Remote;

import cn.neusoft.edu.dc.entity.et.EStucourse;

@Remote
@Local
public interface StuService {

	/**
	 * 读取指定节次有课程的学生名单
	 * @param academicyearno 学年度
	 * @param termno 学期 2012
	 * @param tweek 教学周 02
	 * @param weekday 星期 1-7
	 * @param jc 节次  如：01,02
	 * @return 读取指定节次有课程的学生名单
	 */
	List<EStucourse> getHavingCourseStuList(String academicyearno,String termno,String tweek,String weekday,String[] jc);
	
	List<EStucourse> getHavingCourseStuList(String academicyearno,String termno,String tweek,String weekday,String jc);

}
