package org.ares.app.cfg;

import java.util.Properties;

import javax.annotation.Resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBean;
import org.springframework.jndi.JndiTemplate;

import cn.neusoft.edu.dc.bs.face.EtService;
import cn.neusoft.edu.dc.bs.face.GqService;
import cn.neusoft.edu.dc.bs.face.StuService;

@Configuration
public class BeanCfg {

	@Bean()
	public JndiTemplate jt_48() {
		Properties env=new Properties();
		env.put("java.naming.provider.url",wls_url_48);
		env.put("java.naming.factory.initial","weblogic.jndi.WLInitialContextFactory");
		JndiTemplate jt=new JndiTemplate(env);
		return jt;
	}
	
	@Bean()
	public JndiTemplate jt_04() {
		Properties env=new Properties();
		env.put("java.naming.provider.url",wls_url_04);
		env.put("java.naming.factory.initial","weblogic.jndi.WLInitialContextFactory");
		JndiTemplate jt=new JndiTemplate(env);
		return jt;
	}
	
	
	public SimpleRemoteStatelessSessionProxyFactoryBean rejb_stu_srv() {
		SimpleRemoteStatelessSessionProxyFactoryBean rejb=new SimpleRemoteStatelessSessionProxyFactoryBean();
		rejb.setJndiTemplate(jt_48);
		String jndiName="StuService#"+StuService.class.getName();
		Class<?> businessInterface=StuService.class;
		rejb.setJndiName(jndiName);
		rejb.setBusinessInterface(businessInterface);
		return rejb;
	}
	
	/**
	 * 毕业资格 Graduation requirements
	 */
	@Bean
	public SimpleRemoteStatelessSessionProxyFactoryBean rejb_gq_srv() {
		SimpleRemoteStatelessSessionProxyFactoryBean rejb=new SimpleRemoteStatelessSessionProxyFactoryBean();
		rejb.setJndiTemplate(jt_48);
		String jndiName="GqService#"+GqService.class.getName();
		Class<?> businessInterface=GqService.class;
		rejb.setJndiName(jndiName);
		rejb.setBusinessInterface(businessInterface);
		return rejb;
	}
	
	/**
	 * 学生考勤 Student attendance
	 */
	@Bean
	public SimpleRemoteStatelessSessionProxyFactoryBean rejb_attendance() {
		SimpleRemoteStatelessSessionProxyFactoryBean rejb=new SimpleRemoteStatelessSessionProxyFactoryBean();
		rejb.setJndiTemplate(jt_04);
		String jndiName="EtService#"+EtService.class.getName();
		Class<?> businessInterface=EtService.class;
		rejb.setJndiName(jndiName);
		rejb.setBusinessInterface(businessInterface);
		return rejb;
	}
	
	final String wls_url_48="t3://172.24.10.48:7001";
	final String wls_url_04="t3://192.168.102.4:7001";
	@Resource JndiTemplate jt_48;
	@Resource JndiTemplate jt_04;
}
