

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserAuthenticationServlet
 */

public class UserAuthenticationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public UserAuthenticationServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String logout = request.getParameter("Logout");
		if(logout.equalsIgnoreCase("logout")) {
			request.getSession().setAttribute("user", null);
			request.getSession().invalidate();
		}
		// TODO Auto-generated method stub
		response.sendRedirect("index.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String user = request.getParameter("user");
		String password = request.getParameter("password");
		
		boolean case1Failed = ((user==null ||!user.equalsIgnoreCase("user")));
		boolean case2Failed = ((user==null ||!password.equalsIgnoreCase("password")));
		
		
		
		
		if(!case1Failed && !case2Failed) {
			request.getSession(true);
			request.getSession().setAttribute("user", user);
			request.setAttribute("user", user);
			response.sendRedirect("welcome.jsp");
		}
		else {
			request.getSession().setAttribute("user", null);
			response.sendRedirect("error.jsp");
		}
	}

}
