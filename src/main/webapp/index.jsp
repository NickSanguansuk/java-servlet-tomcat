<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en-US">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home</title>
    <link  rel="stylesheet" href="css/styles.css" type="text/css">
    <script src="js/script.js" defer type="text/javascript"></script>
</head>
<body>
<jsp:include page="header.jsp"/>

<main>
    <h2>Home</h2>
    <p>This is the contents of Home page</p>

    <div class="row">
        <div class="container">
            <form action="hello-servlet" method="post">
                <label for="username">Enter your username:</label>
                <input id="username" type="text" name="username">
                <label for="password">Enter your password:</label>
                <input id="password" type="password" name="password">
                <input type="submit" value="login">
            </form>
        </div>
    </div>

    <h3><%= "Hello World! I am Wasin Sanguansuk from Per Scholas Chicago IL." %>
    </h3>
    <br/>
    <a href="hello-servlet">Click here to call "Hello Servlet"</a>
</main>

<jsp:include page="footer.jsp"/>
</body>
</html>