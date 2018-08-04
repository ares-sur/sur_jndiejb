package cn.neusoft.edu.dc.bs.ejb;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import cn.neusoft.edu.dc.bs.face.EtService;
import cn.neusoft.edu.dc.common.QuerySingleBean;

@Stateless(mappedName = "EtService")
@SuppressWarnings("rawtypes")
public class EtServiceBean implements EtService {
	
	@Override
	public List getDepart() {
		String entity = "Depart";
		return querySingle.getEtData(entity);
	}

	@Override
	public List getMajor() {
		String entity = "Major";
		return querySingle.getEtData(entity);
	}

	@Override
	public List getExecutiveClazz(String grade, String dept) {
		String entity = "Clazz";
		String[] props = { "nj","userYxid"};
		String[] vals = { grade,dept};
		return querySingle.getEtData(entity, props, vals);
	}
	
	@Override
	public List getSchedule(String year, String term) {
		String entity = "ESchedule";
		String[] props = { "academicyearno","termno"};
		String[] vals = { year,term};
		return querySingle.getEtData(entity, props, vals);
	}
	
	@Override
	public List getStuSelectCourse(String year, String term,String teachingclassno) {
		String entity = "EStuselectcourse";
		String[] props = { "academicyearno","termno","teachingclassno"};
		String[] vals = { year,term,teachingclassno};
		return querySingle.getEtData(entity, props, vals);
	}
	
	@Override
	public List getTeaTask(String year, String term,String teachingclassno,String teacherno) {
		String entity = "ETeatask";
		String[] props = { "academicyearno","termno","teachingclassno","teacherno"};
		String[] vals = { year,term,teachingclassno,teacherno};
		return querySingle.getEtData(entity, props, vals);
	}

	@EJB QuerySingleBean querySingle;
	
}
