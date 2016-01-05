package a.b.c;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Rocky on 2016/1/5.
 */
public class TestServlet extends HttpServlet {

    private String springProflesActive = "default";

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        springProflesActive = config.getServletContext().getInitParameter("spring.profiles.active");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String testString = "PQS";
        resp.getWriter().append(String.format("spring.profiles.active: %s\ntest string: %s", springProflesActive, testString));
    }
}
