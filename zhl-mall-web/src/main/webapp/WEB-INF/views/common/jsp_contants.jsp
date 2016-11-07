<%@page import="java.util.List"%>
<%@page import="java.util.Map"%>

<%
	String webRoot = (String)application.getAttribute("webRoot");
	String toolRoot      = (String)session.getServletContext().getAttribute("toolRoot");
	String imageRoot     = (String)session.getServletContext().getAttribute("imageRoot");
	String jsRoot        = (String)session.getServletContext().getAttribute("jsRoot");
	String cssRoot       = (String)session.getServletContext().getAttribute("cssRoot");
	String uploadRoot    = (String)session.getServletContext().getAttribute("uploadRoot");
%>
