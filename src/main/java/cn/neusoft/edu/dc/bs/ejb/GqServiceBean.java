package cn.neusoft.edu.dc.bs.ejb;

import static cn.neusoft.edu.dc.common.EntityManagerBean.ETDC_EM;
import static cn.neusoft.edu.dc.common.EntityManagerBean.QES_EM;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import cn.neusoft.edu.dc.bs.face.GqService;
import cn.neusoft.edu.dc.common.ParamQueryBean;
import cn.neusoft.edu.dc.entity.et.ElgGradscore;
import cn.neusoft.edu.dc.entity.et.ElgGradstulist;
import cn.neusoft.edu.dc.entity.et.ElgStucrdtobtn;
import cn.neusoft.edu.dc.entity.kingo.KStuchange;
import cn.neusoft.edu.dc.entity.kingo.KStuinfo;
import cn.neusoft.edu.dc.entity.qes.Teacherclass;

@Stateless(mappedName = "GqService")
public class GqServiceBean implements GqService {

	@Override
	public List<KStuinfo> getStuinfo(String sid, String sname) {
		String entity = "KStuinfo";
		String[] props = { "userXh","xm"};
		String[] vals = { sid,sname};
		return query.getList(entity, props, vals,ETDC_EM);
	}

	@Override
	public List<ElgGradstulist> getGradQualStuinfo(Integer gradyear,String sid) {
		String entity = "ElgGradstulist";
		String[] props = { "gradyear","stuno"};
		Object[] vals = { gradyear,sid};
		return query.getList(entity, props, vals,ETDC_EM);
	}

	@Override
	public List<ElgStucrdtobtn> getStuCurrentScore(String sid, String sname) {
		String entity = "ElgStucrdtobtn";
		String[] props = { "stuno","stuname"};
		String[] vals = { sid,sname};
		return query.getList(entity, props, vals,ETDC_EM);
	}

	@Override
	public List<KStuchange> getStuChange(String sid, String sname) {
		String entity = "KStuchange";
		String[] props = { "userXh","xm"};
		String[] vals = { sid,sname};
		return query.getList(entity, props, vals,ETDC_EM);
	}

	@Override
	public List<Teacherclass> getTeaClazz(String tid) {
		String entity = "Teacherclass";
		String[] props = { "teacherno"};
		String[] vals = { tid};
		return query.getList(entity, props, vals,QES_EM);
	}
	
	@Override
	public List<ElgGradscore> getGradScore(String stuno, String year,String term) {
		String entity = "ElgGradscore";
		String[] props = { "stuno","year","term"};
		Object[] vals = { stuno,year,term};
		return query.getList(entity, props, vals,ETDC_EM);
	}
	
	@EJB ParamQueryBean query;
	
}
