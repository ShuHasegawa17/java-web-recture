package janken;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import janken.model.JankenBean;
import janken.model.JankenLogic;

/**
 * Servlet implementation class JankenServlet
 */
@WebServlet("/JankenServlet")
public class JankenServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JankenServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatch = request.getRequestDispatcher("WEB-INF/janken/index.jsp");
		dispatch.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String value = request.getParameter("janken");
		
		JankenLogic logic = new JankenLogic();
		JankenBean janken = logic.executeJanken(Integer.parseInt(value));
		
		request.setAttribute("janken", janken);
		
		RequestDispatcher dispatch = request.getRequestDispatcher("WEB-INF/janken/result.jsp");
		dispatch.forward(request, response);
	}

}
