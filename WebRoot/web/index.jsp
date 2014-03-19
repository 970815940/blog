<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
  <head>
 <meta content="width=device-width, initial-scale=1.0" name="viewport">
 <meta charset="gbk">
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
		<h1 class="page-header">Welcome<small>来到桃子博客</small></h1>
		<div class="navbar navbar-inner">
			<a href="#" class="brand">桃子博客</a>
			<ul class="nav">
				<li class="active"><a href="${pb_contextpath }/comm/bcadoBlog.peach?open=1">首页</a></li>
				<li><a  href="${pb_contextpath }/comm/bcadoBlog.peach?open=2">玩转技术</a></li>
				<li><a  href="${pb_contextpath }/comm/bcadoBlog.peach?open=3">烟雨蒙蒙</a></li>
				<li><a  href="${pb_contextpath }/comm/bcadoBlog.peach?open=4" target="_blank">留言板</a></li>
				<li class="dropdown"><a  class="dropdown-toggle" data-toggle="dropdown" href="${pb_contextpath }/comm/bcadoBlog.peach?open=5">关于我<span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a target="_blank" href="${pb_contextpath }/web/aboutAuth.jsp">加入我</a></li>
						<li><a target="_blank" href="${pb_contextpath }/comm/bcadoBlog.peach?open=6">帮助我</a></li>
						<li><a href="#">作者简历</a></li>
					</ul>
				
				</li>
			</ul>

			<ul class="nav pull-right ">
				<li><a  href="${pb_contextpath }/comm/bcadoBlog.peach?open=7">登录</a></li>
				<li><a  href="${pb_contextpath }/comm/bcadoBlog.peach?open=8">注册</a></li>
			</ul>		
		</div>
		fsdf
		<div style="height: 500px;"></div>
	   	<div  id="footer">
	   		<div class="container">
	   			<p class="muted credit">版权所有<a href="http://martinbean.co.uk">Martin Bean</a> and <a href="http://ryanfait.com/sticky-footer/">Ryan Fait</a>.</p>
	   		</div>
   		</div>	
	</div>  

  </body>
  <script src="${pb_contextpath }/jslib/bootstrap/js/jquery.js"></script>
<script  src="${pb_contextpath }/jslib/bootstrap/js/bootstrap.min.js" ></script>
</html>

	
