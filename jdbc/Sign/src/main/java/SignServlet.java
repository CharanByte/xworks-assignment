import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		
		String songs=arg0.getParameter("songs");
		String cars=arg0.getParameter("cars");
		String mobiles=arg0.getParameter("mobiles");
		String apps=arg0.getParameter("apps");
		String bikes=arg0.getParameter("bikes");
		
	}

}
