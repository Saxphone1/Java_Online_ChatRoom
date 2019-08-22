<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0">

    <title>聊天室 - 注册</title>
    <meta name="keywords" content="">
    <meta name="description" content="">
    <link href="static/css/bootstrap.min.css" rel="stylesheet">
    <link href="static/css/font-awesome.css?v=4.4.0" rel="stylesheet">
    <link href="static/css/animate.css" rel="stylesheet">
    <link href="static/css/style.css" rel="stylesheet">
    <link href="static/css/login.css" rel="stylesheet">
    <!--[if lt IE 9]>
    <meta http-equiv="refresh" content="0;ie.html" />
    <![endif]-->
    <script>
        if (window.top !== window.self) {
            window.top.location = window.location;
        }
    </script>
<script type="text/javascript">
	function check() {
		if(document.getElementById("form1").username.value=="") {
			alert("请输入用户名！");
			document.getElementById("form1").username.focus();
			return false;
		}
		
		if(document.getElementById("form1").password.value=="") {
			alert("请输入密码！");
			document.getElementById("from1").password.focus();
			return false;
		}
	}
</script>
</head>

<body class="signin">
    <div class="signinpanel">
        <div class="row">
            <div class="col-sm-7">
                <div class="signin-info">
                    <div class="logopanel m-b">
                        <h1>聊天室</h1>
                    </div>
                    <div class="m-b"></div>
                    <h4>欢迎使用 <strong>聊天室</strong></h4>
                    <ul class="m-b">
                        <li><i class="fa fa-arrow-circle-o-right m-r-xs"></i> 优势一:实时对话，多用户模式</li>
                        <li><i class="fa fa-arrow-circle-o-right m-r-xs"></i> 优势二：管理员可以对用户进行清理</li>
                        <li><i class="fa fa-arrow-circle-o-right m-r-xs"></i> 优势三：支持对某人对特定聊天</li>
                        <li><i class="fa fa-arrow-circle-o-right m-r-xs"></i> 优势四：聊天室采用过滤验证，防止未登录用户</li>
                    </ul>
                    <strong>已有账号？ <a href="/chatroom/login.jsp">立即登陆&raquo;</a></strong>
                </div>
            </div>
            <div class="col-sm-5">
                <form id="form1" name="form1" method="post" action="${ pageContext.request.contextPath }/user" onsubmit="return check()">
                     <input type="hidden" name="method" value="register">
                    <h4 class="no-margins">注册：</h4>
                    <p class="m-t-md">注册聊天室账号</p>
                    <input type="text" class="form-control uname" name="username" placeholder="新的用户名" />
                    <input type="password" class="form-control pword m-b" name="password" placeholder="新的密码" />
                    <a href="/chatroom/login.jsp">已有账号？</a>
                    <input type="submit" class="btn btn-success btn-block" value="注册"></button>
                </form>
            </div>
        </div>
        <div class="signup-footer">
            <div class="pull-left">
                
            </div>
        </div>
    </div>
</body>

</html>
