<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>ConventionSpringboot</title>
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>

</head>
<body>

<h2>Convention database</h2>

<table>
    <c:forEach var = "listitem" items="${conventionlist}">
        <tr>
            <th>ID</th>
            <th>Description</th>
            <th>StartDate</th>
            <th>EndDate</th>
        </tr>
        <tr>
            <td>${listitem.id}</td>
            <td>${listitem.description}</td>
            <td>${listitem.startdate}</td>
            <td>${listitem.enddate}</td>
        </tr>

    </c:forEach>
</table>

</body>
</html>