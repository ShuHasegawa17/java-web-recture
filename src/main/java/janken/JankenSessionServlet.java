package janken;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import janken.model.JankenBean;
import janken.model.JankenLogic;

/**
 * Servlet implementation class JankenSessionServlet
 */
@WebServlet("/JankenSessionServlet")
public class JankenSessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public JankenSessionServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatch = request.getRequestDispatcher("WEB-INF/jankensession/index.jsp");
		dispatch.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		String value = request.getParameter("janken");

		JankenLogic logic = new JankenLogic();
		JankenBean janken = logic.executeJanken(Integer.parseInt(value));

		HttpSession session = request.getSession();

		@SuppressWarnings("unchecked")
		List<JankenBean> jankenList = (List<JankenBean>) session.getAttribute("jankenList");
		if (jankenList == null) {
			jankenList = new ArrayList<>();
		}
		jankenList.add(janken);

		session.setAttribute("jankenList", jankenList);

		RequestDispatcher dispatch = request.getRequestDispatcher("WEB-INF/jankensession/result.jsp");
		dispatch.forward(request, response);
	}

}
