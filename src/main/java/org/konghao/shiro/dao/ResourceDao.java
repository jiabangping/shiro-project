package org.konghao.shiro.dao;

import java.util.List;

import org.jbp.basic.dao.impl.BaseDaoImpl;
import org.konghao.shiro.model.Resource;
import org.springframework.stereotype.Repository;

@Repository("resourceDao")
public class ResourceDao extends BaseDaoImpl<Resource> implements IResourceDao {

	public List<Resource> listResource() {
		return super.list("from Resource");
	}

	@Override
	public List<Resource> listResource2() {
		String sql = "select * from t_resource order by concat(parent_ids,id) asc ";
		return super.listBySql(sql, Resource.class, true);
	}
	
}
