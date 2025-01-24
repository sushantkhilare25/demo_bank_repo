<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Transaction-History</h1>
<table border="1">
<tr>
<th>Transaction-Type</th>
<th>Transaction-Ammount</th>
<th>Remaining-Ammount</th>
<th>Transaction-Date</th>
</tr>
<c:forEach items="${data}" var="t">
  <tr>
  <td>${t.type}</td>
  <td>${t.traamt }</td>
    <td>${t.rembal }</td>
    <td>${t.ldt }</td>
  </tr>
</c:forEach>


</table>

</body>
</html>