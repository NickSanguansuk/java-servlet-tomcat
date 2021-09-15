<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en-US">
<head>
    <title>Lesson</title>
</head>
<body>

<%
    int count = 1;
%>

<h1><%= count %>
</h1>

<%
    count = count + 1;
%>

<h1>Count + 1 = <%= count %>
</h1>

<%= new java.util.Date() %>
<br>
<p>Print out: <% out.print("Hello Servlet World!"); %></p>
<p>Print out: <%= "This is another message." %>
</p>

<%= application.getContextPath() %>
<%--<%= application.get%>--%>

</body>
</html>
