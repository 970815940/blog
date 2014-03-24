<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"

%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>   
    <title>欢迎来到桃子博客天地</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="桃子博客,博客系统,123blog,blog123">
	<meta http-equiv="description" content="这个是123blog桃子博客系统欢迎PAGE">
	<style type="text/css">
		.td1{
			width:13%;
		}
		.td2{
			width: 74%;
			margin: 0px;
		}
		.IndexArea{
			font-size: 13px;
			text-decoration: none;
			color: green;
		}
		.sentence{
			font-size: 15px;font-family: serif;
		}
		a{
			text-decoration: none;
		}
	</style>

  </head>
  <body style="margin: 0px auto;">
   	<table border="0"  height="100%" width="100%" cellpadding="0" cellspacing="0">	
   		<tr  height="90%">
   				<td class="td1"></td>
   				<td valign="top" class="td2">
   						<table  cellpadding="0" cellspacing="0" width="100%" height="100%">
   							<tr valign="middle">
   								<td><center><img   src="${pb_contextpath }/web/images/tou2.png" /></center></td>
   								<td>&nbsp;</td>
   							</tr>
   							<tr>
   								<td class="sentence" align="center">每日一句:时间没有等我 ，是我忘了跟着走</td>
   								<td>&nbsp;</td>   							
   							</tr>
   							<tr>
   								<td class="IndexArea"><center><a href="${pb_contextpath }/comm/bcadoBlog.peach?open=1">进入博客</a>&nbsp;&brvbar;&nbsp;<a href="http://123bbs.aliapp.com">进入论坛</a></center></td>
   							</tr>
   						</table>
   					
   					
   				</td>
   				<td class="td1"></td>
   		</tr>
   		<tr>
   			<td class="td1">&nbsp;</td>
   			<td class="td2" >
   			   	<table  cellpadding="0" cellspacing="0" width="100%" height="100%">
   					<tr height="100%">
   						<td width="1200px;">
   							    <jsp:include page="/commweb/foot.jsp"></jsp:include>
   						</td>
   					</tr>
   				</table>
   			</td>
   			<td class="td1">&nbsp;</td>
   		</tr>
   	</table>
  </body>
</html>
