package org.konghao.shiro.service;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.konghao.shiro.model.User;
import org.springframework.orm.hibernate4.SessionHolder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.support.TransactionSynchronizationManager;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/beans.xml")
public class TestUserService {
	
	@Inject
	private SessionFactory sessionFactory;
	
	@Inject
	private IUserService userService;

	@Before
	public void setUp() {
		//此时最好不要使用Spring的Transactional来管理，因为dbunit是通过jdbc来处理connection，再使用spring在一些编辑操作中会造成事务shisu
		Session s = sessionFactory.openSession();
		TransactionSynchronizationManager.bindResource(sessionFactory, new SessionHolder(s));
		//SystemContext.setRealPath("D:\\teach_source\\class2\\j2EE\\dingan\\cms-da\\src\\main\\webapp");
	}
	
	@After
	public void tearDown() {
		SessionHolder holder = (SessionHolder) TransactionSynchronizationManager.getResource(sessionFactory);
		Session s = holder.getSession(); 
		s.flush();
		TransactionSynchronizationManager.unbindResource(sessionFactory);
	}
	
	//初始化系统用户数据
	@Test
	public void testAdd() {
		User u = new User();
		u.setUsername("admin");
		u.setNickname("系统管理员");
		u.setStatus(1);
		u.setPassword("111");
		userService.add(u);
		
		User u2 = new User();
		u2.setUsername("zhangsan");
		u2.setNickname("张三");
		u2.setStatus(1);
		u2.setPassword("111");
		userService.add(u2);
		
		User u3 = new User();
		u3.setUsername("lisi");
		u3.setNickname("李四");
		u3.setStatus(1);
		u3.setPassword("111");
		userService.add(u3);
	}
	
	@Test
	public void testRoleUser() {
		System.out.println(userService.listByRole(2));
	}
	
	@Test
	public void testUserRes() {
		System.out.println(userService.listAllResource(3));
	}
	
	
}
