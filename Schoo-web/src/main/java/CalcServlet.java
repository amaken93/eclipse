
import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcServlet
 */
@WebServlet("/CalcServlet")
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CalcServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String operator = request.getParameter("operator");
		String snum1 = request.getParameter("num1");
		String snum2 = request.getParameter("num2");
		String msg = null;
		int calc = 0;

		try {
			int num1 = Integer.parseInt(snum1);
			int num2 = Integer.parseInt(snum2);
			switch (operator) {
			case "plus":
				calc = num1 + num2;
				break;

			case "minus":
				calc = num1 - num2;
				break;

			case "multiply":
				calc = num1 * num2;
				break;

			case "divide":
				if (num2 == 0) {
					msg = "0で割ることはできません";
					break;
				}
				calc = num1 / num2;
				break;

			default:
				msg = "error";
			}

		} catch (Exception e) {
			// TODO: handle exception
			if (snum1.isEmpty() || snum2.isEmpty()) {
				msg = "数値を入力してください";
			} else {
				msg = "数値を入力してください";
			}

		}
		request.setAttribute("msg", msg);
		request.setAttribute("calc", calc);
		RequestDispatcher rd = request.getRequestDispatcher("output2.jsp");
		rd.forward(request, response);
	}

}
