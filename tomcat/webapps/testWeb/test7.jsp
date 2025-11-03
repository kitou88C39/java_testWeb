<%@ page language="java" contentType="text/html;charset="UTF-8"
pageEnconding="UTF-8"%>
<% page import="yurufuwa.prg.sample.Calc" %>

<%
String sX = request.getParameter("x");
String sY = request.getParameter("y");

int x = Integer.parseInt(sX);
int y = Integer.parseInt(sY);

Calc calc = new Calc();
calc.setX(x);
calc.setY(y);
%>

  <!DOCTYPE html>
  <html lang="ja">
    <head>
      <meta charset="UTF-8" />
    </head>
    <body>
      計算結果: <%= clac.getAnswer() %>
    </body>
  </html>
</String>
