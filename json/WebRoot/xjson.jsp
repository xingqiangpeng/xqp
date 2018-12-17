<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   <script type="text/javascript">
   		var json1=[1,2,true,"lisi"];
   		console.log(json1);
   		console.log(json1[3]);
   		var json2={"uid":1001,"username":"zhangsan","password":"123456"};
   		console.log(json2);
   		console.log(json2.uid);
   		var json3=[{"uid":1001,"username":"zhangsan","password":"123456"},
   				   {"uid":1002,"username":"lisi","password":"111111"},
   				   {"uid":1003,"username":"wanghwu","password":"222222"}];
   		console.log(json3);
   		console.log(json3[2]);
   		console.log(json3[2].uid);
   		var json4={"uid":1001,"username":{"orld":"zhangsan","newe":"lisi"},"password":["123456","7894556"]};
   		console.log(json4);
   		console.log(json4.username.newe);
   		console.log(json4.password[1]);
   		console.log(typeof json2);
   		var msg=JSON.stringify(json2);
   		console.log(msg+":"+typeof msg);
   		var json5='{"uid":1001,"username":"zhangsan","password":"123456"}'
   		var strjson=JSON.parse(json5);
   		console.log(strjson+":"+ typeof strjson);
   		for(var i in strjson)
   		{	
   			console.log(i+","+strjson[i]);
   		}
   </script>

  </head>
  
  <body>
   
  </body>
</html>
