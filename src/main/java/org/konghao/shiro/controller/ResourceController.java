package org.konghao.shiro.controller;

import javax.inject.Inject;

import org.konghao.shiro.model.Resource;
import org.konghao.shiro.service.IResourceService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/admin/res")//test1
public class ResourceController {
	@Inject
	private IResourceService resourceService;


	@RequestMapping(value="/index")
	public String index(Model model) {
		model.addAttribute("reses", resourceService.listResource2());
		return "index";
	}
	
	@RequestMapping("/list")
	public String list(Model model) {
		//model.addAttribute("reses", resourceService.listResource());
		model.addAttribute("reses", resourceService.listResource2());
		return "res/list";
	}
	
	@RequestMapping(value="/add/{id}",method=RequestMethod.GET)
	public String add(@PathVariable int id,Model model) {
		//根据id查找这条resource
		Resource r = resourceService.findById(id);
		if(r==null) {
			model.addAttribute("res", new Resource(id,id+"/"));
		}else {
			model.addAttribute("res",new Resource(id,r.getParent_ids()));
		}
		return "res/add";
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String add(Resource res,Model model) {
		/*if(res.getParent_id()==0) {
			
		}
		res.setParent_ids("0/");*/
		if(res.getParent_id() !=0) {
			res.setParent_ids(res.getParent_ids()+res.getParent_id()+"/");
		}
		resourceService.add(res);
		return "redirect:/admin/res/list";
	}
	
	@RequestMapping("delete/{id}")
	public String delete(@PathVariable int id) {
		resourceService.delete(id);
		return "redirect:/admin/res/list";
	}
	
	@RequestMapping(value="/update/{id}",method=RequestMethod.GET)
	public String update(@PathVariable int id,Model model) {
		model.addAttribute("res", resourceService.load(id));
		return "res/update";
	}
	
	@RequestMapping(value="/update/{id}",method=RequestMethod.POST)
	public String update(@PathVariable int id,Resource res,Model model) {
		Resource tr = resourceService.load(id);
		tr.setName(res.getName());
		tr.setPermission(res.getPermission());
		tr.setUrl(res.getUrl());
		tr.setType(res.getType());
		resourceService.update(tr);
		return "redirect:/admin/res/list";
	}
}
