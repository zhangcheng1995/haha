package com.educhina.portal;

import java.io.IOException;

import javax.portlet.GenericPortlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

/**
 * Portlet implementation class HelloWorldPortlet
 */
public class HelloWorldPortlet extends GenericPortlet {
	
	public void doView(RenderRequest req, RenderResponse res) 
      throws IOException,PortletException
	    {
	        res.setContentType("text/html");
	        res.getWriter().println("hello world");
	    }
	
	public void doEdit(RenderRequest req, RenderResponse res)
	    throws IOException,PortletException
	    {
	        res.setContentType("text/html");
	        res.getWriter().println("hello world");
			system.out.println("haha");
	    }
}
