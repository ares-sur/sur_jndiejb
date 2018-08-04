package cn.neusoft.edu.dc.common;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Singleton
@LocalBean
public class EntityManagerBean {
	
	@PostConstruct
	void init(){
		ems.put(AUTH_EM, auth_em);
		ems.put(ETDC_EM, et_em);
		ems.put(KINGO_EM, kingo_em);
		ems.put(QES_EM, qes_em);
		ems.put(TQM_EM, tqm_em);
	}

	public EntityManager getEntityManager(String name){
		return ems.get(name);
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
	
	private final Map<String,EntityManager> ems=new HashMap<String,EntityManager>();
	
	public static final String ETDC_EM="ETDC_EM";
	public static final String TQM_EM="TQM_EM";
	public static final String KINGO_EM="KINGO_EM";
	public static final String QES_EM="QES_EM";
	public static final String AUTH_EM="AUTH_EM";
}
