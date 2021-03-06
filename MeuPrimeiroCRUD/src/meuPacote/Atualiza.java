package meuPacote;

import java.io.IOException;
import java.io.PrintWriter;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/atualiza")
public class Atualiza extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<form method='post'>");
		out.println("<br><br>");
		out.println("Post: <input type='number' name='post_id'><br>");
		out.println("<br><br>");
		//out.println("Usu�rio: <input type='text' name='user_id'><br>");
		out.println("Conte�do: <input type='text' name='content'><br>");
		out.println("<br><br>");
		//out.println("Data: <input type='date' name='data'><br>");
		//out.println("Cole��o: <input type='text' name='collection' step='0.01'><br>");
		out.println("<input type='submit' value='Submit'>");
		out.println("</form>");
		out.println("<body><html>");
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		DAO dao = new DAO();
		Posts post = new Posts();
		post.setPost_id(Integer.valueOf(request.getParameter("post_id")));
		//post.setUser_id(request.getParameter("user_id"));
		post.setContent(request.getParameter("content"));
		//String Data = request.getParameter("data");
		//Date data;
		//try {
			//data = new SimpleDateFormat("yyyy-MM-dd").parse(Data);
			//Calendar dataData = Calendar.getInstance();
			//dataData.setTime(data);
			//post.setData(dataData);
			//post.setCollection(request.getParameter("collection"));
			dao.atualiza(post);
			PrintWriter out = response.getWriter();
			out.println("<html><body>");
			out.println("Atualizado post " + post.getPost_id());
			out.println("</body></html>");
			dao.close();
		//} catch (ParseException e) {
			// TODO Auto-generated catch block
	//		e.printStackTrace();
	//	}
	}
}
