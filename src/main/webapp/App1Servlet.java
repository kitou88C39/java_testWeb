import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

//HttpServletを継承して作る
public class App1Servlet extends HttpServlet {
    praivate static final long serialVersionUID = 1L;

    //スーパークラス(HttpServlet)のコンストラクタを呼び出す
    public App1Servlet() {
        super();
    }



}
