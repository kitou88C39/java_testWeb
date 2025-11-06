public class Sv4 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)

    //セッションを取得
    HttpSession session = request.getSession(false);

    //セッションから値を消去
   session.removeAttribute("param");
}
