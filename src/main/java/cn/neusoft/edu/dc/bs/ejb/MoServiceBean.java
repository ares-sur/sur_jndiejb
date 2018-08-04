package cn.neusoft.edu.dc.bs.ejb;

import static cn.neusoft.edu.dc.common.EntityManagerBean.AUTH_EM;
import static cn.neusoft.edu.dc.common.EntityManagerBean.ETDC_EM;
import static cn.neusoft.edu.dc.common.EntityManagerBean.QES_EM;
import static cn.neusoft.edu.dc.common.EntityManagerBean.TQM_EM;

import java.util.Calendar;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import cn.neusoft.edu.dc.bs.face.MoService;
import cn.neusoft.edu.dc.common.ParamQueryBean;
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

@Stateless(mappedName = "MoService")
@SuppressWarnings("rawtypes")
public class MoServiceBean implements MoService {

	@Override
	public Acadyearterm getCurrYearTerm() {
		String entity = "Acadyearterm";
		String[] props = { "iscurr"};
		String[] vals = { "1"};
		String[] orders={"academicyearno desc ","termno desc "};
		List list= query.getList(entity, props, vals,orders,ETDC_EM);
		Acadyearterm r=list.isEmpty()?null:(Acadyearterm)list.get(0);
		return r;
	}

	@Override
	public CurrentWeek getCurrTweek() {
		return getCurrTweek(new java.util.Date());
	}
	
	public CurrentWeek getCurrTweek(java.util.Date date) {
		int week=0;
		Acadyearterm a=null;
		Calendar last=Calendar.getInstance();
		last.setTime(date);
		last.setFirstDayOfWeek(Calendar.MONDAY);
		Calendar first=Calendar.getInstance();
		first.setTime((a=getCurrYearTerm()).getStartdate());
		CurrentWeek r=new CurrentWeek();
		r.setAcademicyearno(a.getAcademicyearno());
		r.setTermno(a.getTermno());
		r.setYearname(a.getYearname());
		r.setTermname(a.getTermname());
		week=last.get(Calendar.WEEK_OF_YEAR)-first.get(Calendar.WEEK_OF_YEAR)+1;
		week=week<1?week+52:week;
		r.setTweek(week);
		int weekday=last.get(Calendar.DAY_OF_WEEK);
		weekday--;
		if(weekday<1)
			weekday=weekday+7;
		r.setWeekday(weekday);
		return r;
	}
	
	@Override
	public List<ETeatask> getTeaCurrentSchedule(String teacherno) {
		Acadyearterm yt= getCurrYearTerm();
		return getTeaSchedule(yt.getAcademicyearno(),yt.getTermno(),teacherno);
	}
	
	@Override
	public List<ETeatask> getTeaSchedule(String year, String term,String teacherno) {
		String entity = "ETeatask";
		String[] props = { "academicyearno","termno","teacherno"};
		String[] vals = { year,term,teacherno};
		return query.getList(entity, props, vals,ETDC_EM);
	}

	@Override
	public List<Tqmplan> getTeaMonitorPlan(String year, String term,Integer week, Integer day, String teacherno) {
		String entity = "Tqmplan";
		String[] props = { "academicyearno","termno","planweek","planday","cmsrno"};
		Object[] vals = { year,term,week,day,teacherno};
		return query.getList(entity, props, vals,TQM_EM);
	}

	@Override
	public List<Tqmplan> getTeaCurrentMonitorPlan(Integer week, Integer day, String teacherno) {
		Acadyearterm yt= getCurrYearTerm();
		return getTeaMonitorPlan(yt.getAcademicyearno(),yt.getTermno(),week,day,teacherno);
	}
	
	@Override
	public boolean isValid(String userid, String password) {
		boolean r=false;
		Userinfo u=getUserinfo(userid);
		if(u!=null)
			r=u.getUserpwd().equals(password);
		return r;
	}

	@Override
	public Userinfo getUserinfo(String userid) {
		return query.getSingleEntityById("Userinfo", "userid", userid,AUTH_EM);
	}
	
	@Override
	public List<QtrsLeave> getQtrsLeaveInfo(String teacherno, String studentno) {
		String entity = "QtrsLeave";
		String[] props = {"teacherno","studentno"};
		Object[] vals = { teacherno,studentno};
		return query.getList(entity, props, vals,QES_EM);
	}
	
	public List<EStuselectcourse> getEStuselectcourse(String year, String term, String studentno) {
		String entity = "EStuselectcourse";
		String[] props = { "academicyearno","termno","studentno"};
		String[] vals = { year,term,studentno};
		return query.getList(entity, props, vals,ETDC_EM);
	}

	@Override
	public QtrsLeaveCkparamTeacherV queryCKRole(String teacherno, String afltype) {
		String entity = "QtrsLeaveCkparamTeacherV";
		String[] props = {"teacherno","afltype"};
		Object[] vals = { teacherno,afltype};
		return query.getSingleEntity(entity, props, vals, QES_EM);
	}

	@Override
	public QtrsLeaveCheckRole queryACT(String teacherno) {
		String entity = "QtrsLeaveCheckRole";
		String[] props = {"teacherno",};
		Object[] vals = { teacherno};
		query.getSingleEntity(entity, props, vals, QES_EM);
		return query.getSingleEntityById("QtrsLeaveCheckRole", "teacherno", teacherno,QES_EM);
	}

	@Override
	public List<QtrsLeaveCheckRoleTeacherV> getAskcheckTeacherlist(String departmentno, Integer checkrole) {
		String entity = "QtrsLeaveCheckRoleTeacherV";
		String[] props = {"departmentno","checkrole"};
		Object[] vals = { departmentno,checkrole};
		return query.getList(entity, props, vals,QES_EM);
	}

	@EJB ParamQueryBean query;
	
}
