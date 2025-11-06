public class Sv3 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)

    //セッションを取得
    HttpSession session = request.getSession(false);

    //セッションを無効化
   session.invalidate();
}
