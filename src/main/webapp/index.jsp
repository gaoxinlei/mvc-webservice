<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.2.1.js"></script>
<script type="text/javascript" >
	$(function(){
		$("a").click(function(){
			$.ajax({
			    type: 'post',
			    url: this.href,
			    contentType: 'application/json;charset=utf-8',
			    data: '{"reqId": 10, "reqBody": "request body"}',
			    success: function (data) { //返回json结果
			        alert(JSON.stringify(data));
			    }
			});
			return false;
		})
	})
</script>
</head>
<body>
<a id="v1" href="${pageContext.request.contextPath }/get/1">版本1</a>
<a id="v2" href="${pageContext.request.contextPath }/get/2">版本2</a>
</body>
</html>