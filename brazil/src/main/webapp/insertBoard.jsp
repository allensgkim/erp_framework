<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html" charset="EUC-KR">
<title>���۵��</title>
</head>
<body>
	<center>
		<h1>�� ���</h1>
		<a href="logout.do">Log-out</a>
		<hr>
		<form action="insertBoard.do" method="post" enctype="multipart/form-data">
			<tr>
				<td bgcolor="orange" width="70">����</td>
				<td align="left"><input type="text" name="title"></td>
			</tr>
			<tr>
				<td bgcolor="orange">�ۼ���</td>
				<td align="left"><input type="text" name="writer" size="10"></td>
			</tr>
			<tr>
				<td bgcolor="orange">����</td>
				<td align="left"><textarea name="wcontent" cols="40" rows="10"></textarea></td>
			</tr>
			<tr>
				<td bgcolor="orange" width="70">���ε�</td>
				<td align="left"><input type="file" name="uploadFile"></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="���� ���">
				</td>
			</tr>
		</form>
		
		<hr>
		
		<a href="getBoardList.do">�� ��� ����</a>
	</center>
</body>
</html>