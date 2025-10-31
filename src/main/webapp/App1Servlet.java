import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//HttpServletを継承して作る
public class App1Servlet extends HttpServlet {
    // スーパークラス(HttpServlet)のコンストラクタを呼び出す
    public App1Servlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) {

        // パラメータ取得
        String params1 = request.getParameter("param1");
        String params2 = request.getParameter("param2");
        String params3 = request.getParameter("param3");

        // Htmlを作成する処理
        String html = "<html>";
                + "<body>"
                + "パラメータ名:params1 値: " + params1 + "<br>"
                + "パラメータ名:params2 値: " + params2 + "<br>"
                + "パラメータ名:params3 値: " + params3 + "<br>"
                + "</body>"
                + "</html>";

    }

}
