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
    <title>都道府県リスト</title>
  </head>
  <body>
    
    <% for(int i=0; i<todoufuken.size(); i++>) {%>
        <%= todoufukenList.get(i) %>
    <% }%>

    </body>
</html>
