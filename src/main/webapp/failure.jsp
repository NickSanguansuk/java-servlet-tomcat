<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en-US">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Failure</title>
    <link  rel="stylesheet" href="css/styles.css" type="text/css">
    <script src="js/script.js" defer type="text/javascript"></script>
</head>
<body>
<h2>The username: <%=request.getAttribute("username")%> or The password: <%=request.getAttribute("password")%> is/are incorrect. Please try again.</h2>
</body>
</html>
