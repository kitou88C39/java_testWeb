<%@ page language="java" contentType="text/html;charset="UTF-8"
pageEnconding="UTF-8"%> 
String str = ["昭和","平成","令和"];

<!DOCTYPE html>
<html lang="ja">
  <head>
    <meta charset="UTF-8" />
    <title>サンプルHTMLページ</title>
  </head>
  <body>
    <h1>Hello World!</h1>
    
    <% for(int i=0; i<strs.length; i++>) {%>
        <% strs[i] %>
    <% }%>

    </body>
</html>
