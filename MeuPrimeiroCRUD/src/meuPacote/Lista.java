package meuPacote;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.io.PrintWriter;



@WebServlet("/lista")

public class Lista extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
			DAO dao = new DAO();
			List<Posts> posts = dao.getLista();
			
			PrintWriter out = response.getWriter();
			out.println("<html><body><table border='1'>");
			out.println("<tr><td>ID</td>" + "<td>Conteúdo</td></tr>");
			for (Posts post : posts) {
				out.println("<tr><td>" + post.getPost_id() + "</td>");
				//out.println("<td>" + post.getUser_id() + "</td>");
				out.println("<td>" + post.getContent() + "</td>");
				//out.println("<td>" + post.getData().getTime() + "</td>");
				//out.println("<td>" + post.getCollection() + "</td></tr>");
			}
			out.println("</table></body></html>");

			dao.close();
	 }

}
