<%@ page language="java" contentType="text/html;charset="UTF-8"
pageEnconding="UTF-8"%> <%@ page import="yurufuwa.prog.sample.Concat" %> <%
//モデルからリクエストから取得 Concat c =
(Concat)request.getAttribute("result"); %>

<!DOCTYPE html>
<html lang="ja">
  <head>
    <meta charset="UTF-8" />
    <title>サンプルHTMLページ</title>
  </head>
  <body>
    文字列の結合結果: <br />
    <%= c.getAnswer() %>
  </body>
</html>
