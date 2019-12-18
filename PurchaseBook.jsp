<%-- 
    Document   : PurchaseBook
    Created on : Dec 3, 2019, 11:45:05 PM
    Author     : 14372
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Thanks for purchasing </h1>
        <table border="1">
            <tr>
                <th>ID</th>
                <th>TITLE</th>
                <th>AUTHOR</th>
                <th>PRICE</th>
                <th>INVENTORY QUANTITY</th>
                <th>LIST OF COURSES</th>
            </tr>
            <tr>
                <td>${book.id}</td>
                <td>${book.title}</td>
                <td>${book.author}</td>
                <td>${book.price}</td>
                <td>${book.inventoryQuantity}</td>
                <td>${book.listOfCourses}</td>
            </tr>
        </table>
    </body>
</html>
