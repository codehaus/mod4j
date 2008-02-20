
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="nl.mycompany.mod4j.App" %>
<%
App appobj = new App();
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>My JSP 'MyJsp.jsp' starting page</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">

		<!-- <link rel="stylesheet" type="text/css" href="styles.css"> -->
	</head>

	<body>
		<P align="center"><IMG alt="J-Technologies" src="http://www.j-technologies.nl/images/logo.gif"></P><P align="center"><FONT face="Verdana"><STRONG>Project mod4j</STRONG></FONT></P><P align="center"> &nbsp;<FONT face="Verdana">Hello user! </FONT>
		</P><P align="center"><FONT face="Verdana"></FONT><BR><FONT face="Verdana">Specialy for you, we present to you the enviroment values from where your webModule currently lives in: </FONT></P><P align="center">
			<BR>
			<%= appobj.getEnviromentValues()%>
			<FONT face="Verdana" color="#808080"> <BR></FONT></P></body>
</html>
