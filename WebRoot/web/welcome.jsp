<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
  <head>
 <meta content="width=device-width, initial-scale=1.0" name="viewport">
 <meta charset="gbk">
      <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->  
<link href="${pb_contextpath }/jslib/bootstrap/css/bootstrap.min.css" rel="stylesheet" /> 
    <title>欢迎来到我的博客</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="博客,我的桃子博客,桃子博客">
	<meta http-equiv="description" content="首页">
	<style type="text/css">
      #footer {
        background-color: #f5f5f5;
      }

      /* Lastly, apply responsive CSS fixes as necessary */
      @media (max-width: 767px) {
        #footer {
          margin-left: -20px;
          margin-right: -20px;
          padding-left: 20px;
          padding-right: 20px;
        }
      }	
	</style>
  </head>
  
  <body style="margin: 0px auto;">
	<div class="container">
		<h1 class="page-header">Welcome<small>桃子博客</small></h1>
		<div class="container" style="height: 400px;">
   						<table  cellpadding="0" cellspacing="0" width="100%" height="100%">
   							<tr valign="middle">
   								<td><center><img   src="${pb_contextpath }/web/images/psb.jpg" /></center></td>
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
		</div>
	   	<div  id="footer">
	   		 <jsp:include page="/commweb/foot.jsp"></jsp:include>
   		</div>	
	</div>  

  </body>
  <script src="${pb_contextpath }/jslib/bootstrap/js/jquery.js"></script>
<script  src="${pb_contextpath }/jslib/bootstrap/js/bootstrap.min.js" ></script>
</html>

	
