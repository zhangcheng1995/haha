package com.educhina.portal;

import java.io.IOException;

import javax.portlet.GenericPortlet;
import javax.portlet.PortletException;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

/**
 * Portlet implementation class HelloJSPPortlet
 */
public class HelloJSPPortlet extends GenericPortlet {
	
	public void doView(RenderRequest req, RenderResponse res)
	    throws IOException,PortletException
	    {
	        res.setContentType("text/html");
	        String jspName=getPortletConfig().getInitParameter("view-jsp");
	       PortletRequestDispatcher rd = getPortletContext().getRequestDispatcher(jspName);
	        rd.include(req,res);
	   }
	
	public void doEdit(RenderRequest req, RenderResponse res)
	    throws IOException,PortletException
	   {
	        res.setContentType("text/html");
	        String jspName=getPortletConfig().getInitParameter("edit-jsp");
	        PortletRequestDispatcher rd=getPortletContext().getRequestDispatcher(jspName);
	        rd.include(req,res);        
	    }
}
