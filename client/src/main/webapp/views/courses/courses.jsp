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
            <div class="card p-5 bg-primary text-white" style="min-height: 150px">
                <h2>Courses</h2>
                <table>
                    <thead>
                    <tr>
                        <th>Course name</th>

                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${courses}" var="course">
                        <tr>
                            <td>${course.name}</td>
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

