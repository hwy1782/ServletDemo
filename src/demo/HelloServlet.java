package demo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Winter Lau
 */
public class HelloServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		res.getWriter().println("Hello World ");
		res.getWriter().println("Hello World ");
		res.getWriter().println("Hello World sb ");
		
		Cookie cookie_nick = new Cookie("nick", "hint");
		
		res.addCookie(cookie_nick);
	}

}
