<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html" charset="EUC-KR">
<title><spring:message code="message.user.login.title"/></title>
</head>
<body>
	<center>
		<h1>�α���</h1>
		<hr>
		<form action="login.do" method="post">
			<table border="1" cellpadding="0" cellspacing="0">
				<tr>
					<td bgcolor="orange"><spring:message code="message.user.login.id"/></td>
					<td><input type="text" name="id" value="${userVO.id }" /></td>
				</tr>
				<tr>
					<td bgcolor="orange">��й�ȣ</td>
					<td><input type="password" name="password" value="${userVO.password }"/></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="�α���" /></td>
				</tr>
			</table>
		</form>
		<hr>
		
	</center>
</body>
</html>