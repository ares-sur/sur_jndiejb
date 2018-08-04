package org.ares.app;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.neusoft.edu.dc.bs.face.EtService;
import cn.neusoft.edu.dc.bs.face.GqService;
import cn.neusoft.edu.dc.entity.et.EStuselectcourse;
import cn.neusoft.edu.dc.entity.et.ElgGradscore;

@SuppressWarnings("unchecked")
@RunWith(SpringRunner.class)
@SpringBootTest
public class StartAppTests {

	/**
	 * 学生毕业资格审查 48
	 */
	@Test
	public void get_stu_socre() {
		List<ElgGradscore> list=gq_srv.getGradScore("14110900217", "2017","1");
		System.out.println("test3 list count is : "+list.size());
		for(ElgGradscore e:list)
			System.out.println(e.getStuno()+":"+e.getScore());
	}
	
	/**
	 * 学生考勤 4
	 * 学年 学期 教学班
	 */
	@Test
	public void get_stu_select_course() {
		et_srv.getStuSelectCourse("2017", "2", "230427-002").stream().forEach(e->{
			EStuselectcourse ee=(EStuselectcourse )e;
			System.out.println(ee.getStudentname());
		});
	
	}
	
	@Resource GqService gq_srv;
	@Resource EtService et_srv;
}
