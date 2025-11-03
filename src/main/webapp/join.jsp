<%@ page language="java" contentType="text/html;charset="UTF-8"
pageEnconding="UTF-8"%> <% //結合結果をリクエストから取得 String ans =
(String)request.getAttribute("ans"); %>

<!DOCTYPE html>
<html lang="ja">
  <head>
    <meta charset="UTF-8" />
    <title>サンプルHTMLページ</title>
  </head>
  <body>
    文字列の結合結果: <br />
    <%= ans %>
  </body>
</html>
