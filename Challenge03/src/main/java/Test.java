
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test
 */
@WebServlet("/Test")
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;

		String url = "jdbc:postgresql://127.0.0.1:5432/test";
		String user = "postgres";
		String password = "";
		
		try {
			// postgreSQLのJDBCドライバを読み込み
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			// JDBCドライバが見つからない場合
			e.printStackTrace();
		}

		try {
			conn = DriverManager.getConnection(url, user, password);
			conn.setAutoCommit(false);

			stmt = conn.createStatement();
			String sql = "SELECT * FROM user_list";
			rset = stmt.executeQuery(sql);

			while (rset.next()) {
				System.out.println("[" + rset.getInt("id") + "件目]");
				System.out.println("name\t:" + rset.getString("name"));
				System.out.println("age\t:" + rset.getInt("age"));
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error dbConnect");
			e.printStackTrace();
		} finally {
			try {
				if (rset != null)
					rset.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
