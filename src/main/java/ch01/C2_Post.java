package ch01;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ch01/post/add")
public class C2_Post extends HttpServlet {
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) // HttpServlet을 상속받은 doPost 메서드 (doPost 메서드 = Post 요청을 처리[쓴다])
		throws ServletException, IOException {
			int num1 = 90;
			int num2 = 40;
			
			response.setContentType("text/html; charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<h2> POST </h2>");
			out.printf("<p>%d + %d = %d</p>", num1, num2, num1 + num2);
		}
}
