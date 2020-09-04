<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
<head>
    <title>Student Confirmation Form  </title>
</head>
<body>
    The student is confirm ${student.firstName} ${student.lastName}

    <br><br>
    Country ${student.country}

    <br><br>
    Favorite language ${student.favoriteLanguage}
    <br><br>
    Operating System:
    <ul>
        <c:forEach var="temp" items="${student.operatingSystems}">
            <li>${temp}</li>
        </c:forEach>

    </ul>

</body>


</html>