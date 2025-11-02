<%@ page language="java" contentType="text/html;charset="UTF-8"
pageEnconding="UTF-8"%> 

<% page import="java.util.ArrayList" %>
<% page import="yuryfuwa.prg.sample.Todofuken" %>

//都道府県のリストを取得
Todofuken todoufuken = new Todofuken();
ArrayList<String> todoufukenList = td.getList();


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
