<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html;charset=UTF-8" %>
<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>登入成功</title>
</head>

<body>
<table width="30%" border="1" align="center">
    <tbody>
    <tr>
        <td width="30%">使用者ID：</td>
        <td>${customer.id}</td>
    </tr>
    <tr>
        <td>使用者姓名：</td>
        <td>${customer.name}</td>
    </tr>
    <tr>
        <td>使用者密碼：</td>
        <td>${customer.password}</td>
    </tr>
    <tr>
        <td>使用者地址：</td>
        <td>${customer.address}</td>
    </tr>
    <tr>
        <td>使用者電話號碼：</td>
        <td>${customer.phone}</td>
    </tr>
    <tr>
        <td>使用者生日：</td>
        <td><fmt:formatDate value="${customer.birthday}" pattern="yyyy年MM月dd日"/></td>
    </tr>
    </tbody>
</table>
<p>&nbsp;</p>

</body>
</html>
