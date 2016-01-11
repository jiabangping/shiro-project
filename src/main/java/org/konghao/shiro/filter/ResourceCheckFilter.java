package org.konghao.shiro.filter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.AccessControlFilter;

public class ResourceCheckFilter extends AccessControlFilter {
	private String errorUrl;
	public String getErrorUrl() {
		return errorUrl;
	}
	public void setErrorUrl(String errorUrl) {
		this.errorUrl = errorUrl;
	}
	
	@Override
	protected boolean isAccessAllowed(ServletRequest request,
			ServletResponse response, Object mappedValue) throws Exception {
		Subject subject = getSubject(request, response);
		//得到请求的url
		String url = getPathWithinApplication(request);
		/**
		 * subject.isPermitted(url)则会调用
		 * securityManager.authorizer.permissionResolver(如果使用WildcardPermission匹配权限字符串的话，需要在这里根据url获取到对应的)
		 */
		//如果返回false，则会调用下面的onAccessDenied跳转到相应的提示页面
		return subject.isPermitted(url);
	}

	@Override
	protected boolean onAccessDenied(ServletRequest request,
			ServletResponse response) throws Exception {
		HttpServletResponse hsp = (HttpServletResponse)response;
		HttpServletRequest hReq = (HttpServletRequest)request;
		hsp.sendRedirect(hReq.getContextPath()+this.errorUrl);
		return false;
	}

}
