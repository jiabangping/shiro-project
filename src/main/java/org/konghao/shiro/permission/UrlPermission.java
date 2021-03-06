package org.konghao.shiro.permission;

import org.apache.shiro.authz.Permission;
import org.apache.shiro.util.AntPathMatcher;
import org.apache.shiro.util.PatternMatcher;

public class UrlPermission implements Permission {
	private String url;
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public UrlPermission() {
	}
	
	public UrlPermission(String url) {
		this.url = url;
	}

	@Override//表明
	public boolean implies(Permission p) {
		if(!(p instanceof UrlPermission)) return false;
		UrlPermission up = (UrlPermission)p;
		// /admin/role/**
		PatternMatcher patternMatcher = new AntPathMatcher();
		System.out.println(this.getUrl()+","+up.getUrl()+","+patternMatcher.matches(this.getUrl(), up.getUrl()));
		return patternMatcher.matches(this.getUrl(), up.getUrl());
	}
	
	
	public static void main(String[] args) {
		PatternMatcher patternMatcher = new AntPathMatcher();
		//拥有的权限 /*/list   
		//判断能否访问 /admin/user/list
		boolean result = patternMatcher.matches("*/*/list", " /admin/user/list");
		boolean result1 = patternMatcher.matches("*/role/list", " /admin/role/list");
		System.out.println(result);
		System.out.println(result1);
	}

}
