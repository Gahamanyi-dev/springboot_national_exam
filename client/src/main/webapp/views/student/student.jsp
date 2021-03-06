<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student</title>
    <%@ include file="../components/layout/page-header.jsp" %>
</head>
<body>
<%@ include file="../components/atoms/navbar.jsp" %>
<div class="container pt-5">
    <div class="">
        <div>
            <div class="card  bg-warning text-white" style="min-height: 150px">
                <h1>Students</h1>
                <table>
                    <thead>
                    <tr>
                        <th>Student names</th>
                        <th>Student NID</th>
                        <th>Phone number</th>
                        <th>Email address</th>
                        <th>Courses</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${students}" var="student">
                        <tr>
                                <%--                            <td onclick="window.location.assign('/posts/'${book.id})">${book.id}</td>--%>
                            <td>${student.names}</td>
                            <td>${student.nationalId}</td>
                            <td>${student.phoneNumber}</td>
                            <td>${student.email}</td>
                            <td>
                                <c:forEach items="${student.courses}"  var="course">
                                    ${course.name},
                                </c:forEach>
                            </td>


                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>
</body>
</html>
