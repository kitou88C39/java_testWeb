<%@ page language="java" contentType="text/html;charset="UTF-8"
pageEnconding="UTF-8"%> 

<% page import="yurufuwa.prg.sample.Calc" %>

<%
//パラメータの取得
String sX = request.getParameter("x");
String sY = request.getParameter("y");

int x = Integer.parseInt(sX);
int y = Integer.parseInt(sY);

//計算機クラスにパラメータをセット
Calc calc = new Calc();
calc.setX(x);
calc.setY(y);
%>

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
