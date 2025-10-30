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

    }

}
