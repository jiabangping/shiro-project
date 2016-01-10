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
	
}
