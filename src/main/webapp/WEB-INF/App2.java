package yurufuwa.prog.sample;

import java.io.IOException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//HttpServletを継承して作る
public class App2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response
                                            throws ServletException, IOException) {

        // パラメータ取得
        String params1 = request.getParameter("str1");
        String params2 = request.getParameter("str2");
        String params3 = request.getParameter("str3");

        // Htmlを作成する処理
        String html = "<html>"
                + "<body>"
                + "パラメータ名:params1 値: " + params1 + "<br />"
                + "パラメータ名:params2 値: " + params2 + "<br />"
                + "パラメータ名:params3 値: " + params3 + "<br />"
                + "</body>"
                + "</html>";
        // レスポンスのヘッダーに、MIMEタイプ、文字コードをセット
        response.setContentType("test/html");
        response.setCharacterEncoding("UTF-8");

        // 作成したHTMLを出力
        response.getWriter().append(html);
    }
}
