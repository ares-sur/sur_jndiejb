package cn.neusoft.edu.dc.bs.ejb;

import static cn.neusoft.edu.dc.common.EntityManagerBean.ETDC_EM;
import static cn.neusoft.edu.dc.common.Params.EQ;
import static cn.neusoft.edu.dc.common.Params.LIKE;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import cn.neusoft.edu.dc.bs.face.StuService;
import cn.neusoft.edu.dc.common.ParamQueryBean;
import cn.neusoft.edu.dc.entity.et.EStucourse;

@Stateless(mappedName = "StuService")
public class StuServiceBean implements StuService {

	@Override
	public List<EStucourse> getHavingCourseStuList(String academicyearno,String termno, String tweek, String weekday, String[] jcs) {
		List<EStucourse> list=new ArrayList<EStucourse>();
		List<EStucourse> r=new ArrayList<EStucourse>();
		
		for(String jc:jcs){
			list.addAll(getHavingCourseStuList(academicyearno,termno,tweek,weekday,jc));
		}
		for(EStucourse c:list)
			if(r.indexOf(c)<0)
				r.add(c);
		return r;
	}

	@Override
	public List<EStucourse> getHavingCourseStuList(String academicyearno,String termno, String tweek, String weekday, String jc) {
		String entity = "EStucourse";
		String[] props = { "academicyearno","termno","tweek","weekday","jc"};
		String[] vals = { academicyearno,termno,tweek,weekday,jc};
		String[] syms={EQ,EQ,LIKE,EQ,LIKE};
		return query.getList(entity, props, vals,syms,ETDC_EM);
	}

	@EJB ParamQueryBean query;
}
