<%@ page language="java" contentType="text/html;charset="UTF-8"
pageEnconding="UTF-8"%> //パラメータの所得　<%String str =
request.getParameter("param1");%>

<!DOCTYPE html>
<html lang="ja">
  <head>
    <meta charset="UTF-8" />
    <title>サンプルHTMLページ</title>
  </head>
  <body>
    <h1>Hello World!</h1>
    パラメータは<%=str %>です<br />
  </body>
</html>
