package org.konghao.shiro.service;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.konghao.shiro.model.Role;
import org.springframework.orm.hibernate4.SessionHolder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.support.TransactionSynchronizationManager;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/beans.xml")
public class TestRoleService {

	@Inject
	private SessionFactory sessionFactory;
	
	@Inject
	private IRoleService roleService;
	
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

	@Test
	public void testAddRole() {
		Role r = new Role();
		r.setId(1);
		r.setName("admin");//管理员
		roleService.add(r);
		
		Role r2 = new Role();
		r.setId(2);
		r2.setName("jingli");//经理
		roleService.add(r2);
		
		Role r3 = new Role();
		r.setId(3);
		r3.setName("commonuser");//普通用户
		roleService.add(r3);
	}
	
	@Test
	public void testAddUserRole() {
		roleService.addUserRole(1, 1); //给admin 管理员角色
		roleService.addUserRole(2, 2); //张三       经理角色
		roleService.addUserRole(3, 2); //给李四    经理角色
		roleService.addUserRole(3, 3); //给李四    普通用户角色 
	}
	
	@Test
	public void testAddRoleRes() {
/*		roleService.addRoleResource(1, 1);//给角色 admin  系统管理权限
		roleService.addRoleResource(2, 2);//给角色 guest  用户管理权限
		roleService.addRoleResource(2, 3);//给角色 guest  用户添加
		roleService.addRoleResource(2, 4);//给角色 guest  用户删除
		
		roleService.addRoleResource(3, 5);//给角色             角色管理
		roleService.addRoleResource(3, 6);            //角色添加
		roleService.addRoleResource(3, 7);           // 角色修改
*/	
		//admin 角色有所有的权限
		roleService.addRoleResource(1, 1);
		roleService.addRoleResource(1, 2);
		roleService.addRoleResource(1, 3);
		roleService.addRoleResource(1, 4);
		
		roleService.addRoleResource(1, 5);
		roleService.addRoleResource(1, 6);            
		roleService.addRoleResource(1, 7);          
	
		
		//经理角色 有 用户管理权限 ，用户添加，用户删除
		roleService.addRoleResource(2, 2);
		roleService.addRoleResource(2, 3);
		roleService.addRoleResource(2, 4);
		
		
		//普通用户有 用户查看角色
		
	}
	
	@Test
	public void testQuery() {
		
	}
}
