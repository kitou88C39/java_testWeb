package yurufuwa.prog.sample;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//HttpServletを継承して作る
public class App3 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // パラメータ取得
        String str1 = request.getParameter("str1");
        String str2 = request.getParameter("str2");

        // モデルで文字列結合
        Concat c = new Concat();
        c.setStr1(str1);
        c.setStr2(str2);
        c.join();

        // モデルをリクエストにセット
        request.setAttribute("result", c);

        // ビュー(JSP)に結果を出力してもらう
        ServletContext ctx = getServletContext();
        RequestDispatcher rd = ctx.getRequestDispatcher("/WEB-INF/join.jsp");
        rd.forward(request, response);
    }
}
