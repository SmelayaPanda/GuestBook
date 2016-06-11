import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Smela on 09.06.2016.
 */
@WebServlet("/gbook")
public class MyServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("greeting", "<br>Live a comment");
        request.getRequestDispatcher("start.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // super.doPost(req, resp);
        req.setAttribute("greeting", "<br>Live a comment");
        req.getRequestDispatcher("start.jsp").forward(req, resp);

        String name = req.getParameter("name");
        System.out.println(name);
        String comment = req.getParameter("comment");
        System.out.println(comment);

        try {
            DBConnect.addIntoDB(name,comment);
        } catch (ClassNotFoundException e) {
            System.out.println("Не нашел драйвера");
        }

    }
}
