public class Sv1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)

    //パラメータを取得
    String params = request.getParameter("param");

    //セッションを生成
    HttpSession session = request.getSession(true);

    //セッションに値をセット
   session.setAttribute("param", params);
}
