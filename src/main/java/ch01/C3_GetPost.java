package ch01;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ch01/getPost/add")
public class C3_GetPost extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) // HttpServlet을 상속받은 doGet 메서드 (doGet 메서드 = Get 요청을 처리[읽는다])
		throws ServletException, IOException {
		int num1 = 4;
		int num2 = 9;
		
		response.setContentType("text/html; charset=utf-8");	// setContentType = response 객체의 메서드로, 응답의 콘텐츠 타입을 설정한다. (text/html 로 설정하여 응답이 HTML 형식임을 브라우저에 알림)
		PrintWriter out = response.getWriter();		// getWriter() = response 객체의 메서드로, 응답을 작성할 때 사용할 PrintWriter 객체를 반환 (이 객체를 통해 텍스트 기반의 응답 본문을 작성할 수 있음)
		out.println("<h2>GET</h2>");
		out.printf("<p>%d = %d = %d</p>", num1, num2, num1 + num2);
	}
	
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
