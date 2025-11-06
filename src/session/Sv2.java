public class Sv2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)

    //セッションを取得
    HttpSession session = request.getSession(false);

    //セッションから値を取得
   String data = (String)session.setAttribute("param");
}
