<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home</title>
    <link href="css/styles.css" rel="stylesheet">
    <script src="js/script.js" defer type="text/javascript"></script>
</head>
<body>
<jsp:include page="header.jsp"/>

<h2>This is the header of Home page</h2>

<h3><%= "Hello World! I am Wasin Sanguansuk from Per Scholas Chicago." %>
</h3>
<br/>
<a href="hello-servlet">Hello Servlet</a>

<jsp:include page="footer.jsp"/>
</body>
</html>