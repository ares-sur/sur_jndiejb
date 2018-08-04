package cn.neusoft.edu.dc.common;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Singleton
@LocalBean
@SuppressWarnings("rawtypes")
public class QuerySingleBean {
	
	public List getAUTHData(String entity) {
		return getAUTHData(entity,null,null);
	}
	
	public List getQESData(String entity) {
		return getQESData(entity,null,null);
	}
	
	public List getTQMData(String entity) {
		return getTQMData(entity,null,null);
	}
	
	public List getKingoData(String entity) {
		return getKingoData(entity,null,null);
	}
	
	public List getEtData(String entity) {
		return getEtData(entity,null,null);
	}
	
	public <T> T getQESSingleEntityById(String entity,String property,Object value){
		return getSingleEntityById(entity,property,value,qes_em);
	}
	
	public <T> T getTQMSingleEntityById(String entity,String property,Object value){
		return getSingleEntityById(entity,property,value,tqm_em);
	}
	
	public <T> T getAuthSingleEntityById(String entity,String property,Object value){
		return getSingleEntityById(entity,property,value,auth_em);
	}
	
	public <T> T getKingoSingleEntityById(String entity,String property,Object value){
		return getSingleEntityById(entity,property,value,kingo_em);
	}
	
	public <T> T getEtSingleEntityById(String entity,String property,Object value){
		return getSingleEntityById(entity,property,value,et_em);
	}
	
	/*---------------------------------------------------------------------------------------*/
	
	public List getAUTHData(String entity,String[] props,Object[] values) {
		return getAUTHData(entity,props,values,null);
	}
	
	public List getQESData(String entity,String[] props,Object[] values) {
		return getQESData(entity,props,values,null);
	}
	
	public List getTQMData(String entity,String[] props,Object[] values) {
		return getTQMData(entity,props,values,null);
	}
	
	public List getKingoData(String entity,String[] props,Object[] values) {
		return getKingoData(entity,props,values,null);
	}
	
	public List getEtData(String entity,String[] props,Object[] values) {
		return getEtData(entity,props,values,null);
	}
	
	/*---------------------------------------------------------------------------------------*/
	
	public List getAUTHData(String entity,String[] props,Object[] values,String[] orders) {
		return getResultOfSingleEntity(entity,props,values,null,auth_em);
	}
	
	public List getQESData(String entity,String[] props,Object[] values,String[] orders) {
		return getResultOfSingleEntity(entity,props,values,null,qes_em);
	}
	
	public List getTQMData(String entity,String[] props,Object[] values,String[] orders) {
		return getResultOfSingleEntity(entity,props,values,null,tqm_em);
	}
	
	public List getKingoData(String entity,String[] props,Object[] values,String[] orders) {
		return getResultOfSingleEntity(entity,props,values,null,kingo_em);
	}
	
	public List getEtData(String entity,String[] props,Object[] values,String[] orders) {
		return getResultOfSingleEntity(entity,props,values,null,et_em);
	}
	
	@SuppressWarnings("unchecked")
	public <T> T getSingleEntityById(String entity,String property,Object value,EntityManager em){
		if(entity==null)
			return null;
		String hql=" select c from "+entity+" c where c."+property+" = :"+property;
		return (T)em.createQuery(hql).setParameter(property, value).getSingleResult();
	}
	/**
	 * 
	 * @param entity 实体名称
	 * @param props 属性名称
	 * @param values 值对象列表ֵ
	 * @return
	 *
	 */
	public List getResultOfSingleEntity(String entity,String[] props,Object[] values,String[] orders,EntityManager em) {
		
		if(entity==null)
			return null;
		String alias=" c";
		String firstCond=" where 1=1 ";
		StringBuilder hql=new StringBuilder(256);
		hql.append("select ").append(alias).append(" from ").append(entity).append(alias).append(firstCond);

		if(values!=null&&values.length>0)
			for(int i=0,ind=1;i<values.length;i++){
				if(Util.isNotEmpty(values[i]))
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
		System.out.println(hql);
		if(values!=null&&values.length>0)
			for(int i=0,p=1;i<values.length;i++){
				if(Util.isNotEmpty(values[i]))
					q.setParameter(p++, values[i]);
			}
		List list=q.getResultList();
		return list;
	}
	
	@PersistenceContext(unitName="ETDC")
	private EntityManager et_em;
	
	@PersistenceContext(unitName="ETDC")
	private EntityManager kingo_em;
	
	@PersistenceContext(unitName="TQM")
	private EntityManager tqm_em;
	
	@PersistenceContext(unitName="QES")
	private EntityManager qes_em;
	
	@PersistenceContext(unitName="AUTH")
	private EntityManager auth_em;
}
