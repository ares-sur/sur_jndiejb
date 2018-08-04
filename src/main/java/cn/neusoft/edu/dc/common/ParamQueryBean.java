package cn.neusoft.edu.dc.common;

import static cn.neusoft.edu.dc.common.Util.isNotEmpty;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.Query;

@Singleton
@LocalBean
@SuppressWarnings({"unchecked"})
public class ParamQueryBean {
	
	public <T> List<T> getList(String entity,String emName) {
		return getList(entity,null,null,emName);
	}

	public <T> List<T> getList(String entity,String[] props,Object[] values,String emName) {
		return getList(entity,props,values,null,null,emName);
	}

	public <T> List<T> getList(String entity,String[] props,Object[] values,String[] syms,String emName) {
		return getResultOfSingleEntity(entity,props,values,syms,null,emb.getEntityManager(emName));
	}

	public <T> List<T> getList(String entity,String[] props,Object[] values,String[] syms,String[] orders,String emName) {
		return getResultOfSingleEntity(entity,props,values,syms,orders,emb.getEntityManager(emName));
	}

	/***************************************************************************************************************/
	
	public <T> T getSingleEntityById(String entity,String property,Object value,String emName){
		EntityManager em=emb.getEntityManager(emName);
		if(entity==null)
			return null;
		String hql=" select c from "+entity+" c where c."+property+" = :"+property;
		return (T)em.createQuery(hql).setParameter(property, value).getSingleResult();
	}
	
	public <T> T getSingleEntity(String entity,String[] props,Object[] values,String emName){
		T r=null;
		EntityManager em=emb.getEntityManager(emName);
		List<T> list=getResultOfSingleEntity(entity,props,values,null,em);
		if(list!=null&&list.size()>0)
			r=list.get(0);
		return r;
	}
	/*-------------------------------------------------------------------------------------------------*/
	
	/*public <T> List<T> getResultOfSingleEntity(String entity,String[] props,Object[] values,String[] orders,EntityManager em) {
		
		if(entity==null)
			return null;
		String alias=" c";
		String firstCond=" where 1=1 ";
		StringBuilder hql=new StringBuilder(256);
		hql.append("select ").append(alias).append(" from ").append(entity).append(alias).append(firstCond);

		if(values!=null&&values.length>0)
			for(int i=0,ind=1;i<values.length;i++){
				if(isNotEmpty(values[i]))
					hql.append(" and ").append(alias).append(".").
					append(props[i]).append("=?"+(ind++));
			}
		if(orders!=null&&orders.length>0){
			hql.append(" order by ");
			for(int i=0;i<orders.length;i++)
				hql.append(alias).append(".").append(orders[i]).append(",");
			hql.deleteCharAt(hql.length()-1);
		}
		
		Query q=em.createQuery(hql+"");
		
		if(values!=null&&values.length>0)
			for(int i=0,p=1;i<values.length;i++){
				if(isNotEmpty(values[i]))
					q.setParameter(p++, values[i]);
			}
		List<T> list=q.getResultList();
		return list;
	}*/
	
	public <T> List<T> getResultOfSingleEntity(String entity,String[] props,Object[] values,String[] orders,EntityManager em) {
		return getResultOfSingleEntity(entity,props,values,null,orders,em);
	}
	
	public <T> List<T> getResultOfSingleEntity(String entity,String[] props,Object[] values,String[] syms,String[] orders,EntityManager em) {
		
		String sym=null;
		Object value=null;
		
		if(entity==null)
			return null;
		String alias=" c";
		String firstCond=" where 1=1 ";
		
		long c=System.currentTimeMillis() % 100;
		firstCond=" where 1=1 and "+c+"="+c+" ";
		
		StringBuilder hql=new StringBuilder(256);
		
		hql.append("select ").append(alias).append(" from ").append(entity).append(alias).append(firstCond);

		if(values!=null&&values.length>0)
			for(int i=0,ind=1;i<values.length;i++){
				value=values[i];
				if(isNotEmpty(value)){
					sym="=";
					if(syms!=null && syms.length>0 && isNotEmpty(syms[i]))
						sym=syms[i];
					hql.append(" and ").append(alias).append(".").append(props[i]).append(sym).append("?"+(ind++));
				}
			}
		if(orders!=null&&orders.length>0){
			hql.append(" order by ");
			for(int i=0;i<orders.length;i++)
				hql.append(alias).append(".").append(orders[i]).append(",");
			hql.deleteCharAt(hql.length()-1);
		}
		
		//em.clear();
		Query q=em.createQuery(hql+"");
		
		if(values!=null&&values.length>0)
			for(int i=0,p=1;i<values.length;i++){
				value=values[i];
				if(isNotEmpty(value)){
					if(syms!=null && syms.length>0 && isNotEmpty(syms[i])){
						sym=syms[i];
						if("like".equalsIgnoreCase(sym.trim())&&!(value+"").matches("^%.+||.+%$"))
							value="%"+value+"%";
					}
					q.setParameter(p++, value);
				}
			}
		List<T> list=q.getResultList();
		return list;
	}
	
	@EJB private EntityManagerBean emb;
	
}
