package org.konghao.shiro.service;

import javax.inject.Inject;

import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.konghao.shiro.model.Resource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/beans.xml")
public class TestResourceService {

	@Inject
	private SessionFactory sessionFactory;
	
	@Inject
	private IResourceService resourceService;
	
	@Test
	public void testAdd() {
		
		Resource res = new Resource();
		res.setId(1);
		res.setName("用户管理");
		res.setUrl("/admin/user/list");
		res.setParent_id(0);
		res.setType("menu");
		res.setParent_ids("0/");
		resourceService.add(res);
		
		res = new Resource();
		res.setId(2);
		res.setName("资源管理");
		res.setUrl("/admin/res/list");
		res.setParent_id(0);
		res.setType("menu");
		res.setParent_ids("0/");
		resourceService.add(res);
		
		res = new Resource();
		res.setId(3);
		res.setName("角色管理");
		res.setUrl("/admin/role/list");
		res.setParent_id(0);
		res.setType("menu");
		res.setParent_ids("0/");
		resourceService.add(res);
		
		res = new Resource();
		res.setName("添加用户");
		res.setUrl("/admin/user/add/*");
		res.setParent_id(1);
		res.setType("button");
		res.setParent_ids("0/1/");
		resourceService.add(res);
		
		res = new Resource();
		res.setName("删除用户");
		res.setUrl("/admin/user/delete/*");
		res.setParent_id(1);
		res.setType("button");
		res.setParent_ids("0/1/");
		resourceService.add(res);
		
		res = new Resource();
		res.setName("更新用户");
		res.setUrl("/admin/user/update/*");
		res.setParent_id(1);
		res.setType("button");
		res.setParent_ids("0/1/");
		resourceService.add(res);
		
		res = new Resource();
		res.setName("设置用户角色");
		res.setUrl("/admin/user/setUserRole/*");
		res.setParent_id(1);
		res.setType("button");
		res.setParent_ids("0/1/");
		resourceService.add(res);
		
		
		res = new Resource();
		res.setName("添加资源");
		res.setUrl("/admin/res/add/*");
		res.setParent_id(2);
		res.setType("button");
		res.setParent_ids("0/2/");
		resourceService.add(res);
		
		res = new Resource();
		res.setName("删除资源");
		res.setUrl("/admin/res/delete/*");
		res.setParent_id(2);
		res.setType("button");
		res.setParent_ids("0/2/");
		resourceService.add(res);
		
		res = new Resource();
		res.setName("修改资源");
		res.setParent_id(2);
		res.setType("button");
		res.setParent_ids("0/2/");
		res.setUrl("/admin/res/update/*");
		resourceService.add(res);
		
		res = new Resource();
		res.setName("添加角色");
		res.setUrl("/admin/role/add/*");
		res.setParent_id(3);
		res.setType("button");
		res.setParent_ids("0/3/");
		resourceService.add(res);
		
		res = new Resource();
		res.setName("删除角色");
		res.setUrl("/admin/role/delete/*");
		res.setParent_id(3);
		res.setType("button");
		res.setParent_ids("0/3/");
		resourceService.add(res);
		
		res = new Resource();
		res.setName("修改角色");
		res.setParent_id(3);
		res.setType("button");
		res.setParent_ids("0/3/");
		res.setUrl("/admin/role/update/*");
		resourceService.add(res);
		
		res = new Resource();
		res.setName("设置角色资源");
		res.setParent_id(3);
		res.setType("button");
		res.setParent_ids("0/3/");
		res.setUrl("/admin/role/setRolePermission/*");
		resourceService.add(res);
	}
}
