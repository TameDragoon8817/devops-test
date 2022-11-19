<%@ page contentType="text/html; charset=UTF-8" import="java.util.*"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询用户结果demo</title>
</head>
<body>

	<table width="100%" border="0" cellspacing="1" cellpadding="0">
		<c:forEach items="${requestScope.querylist}" var="users"
			varStatus="status">
			<tr bgcolor="#fba661" height="25">
				<td width="10%">
					<div align="center">${users.name}</div>
				</td>
			</tr>
		</c:forEach>
	</table>


</body>
</html>