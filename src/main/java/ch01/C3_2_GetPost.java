package ch01;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ch01/getPost2/add")
public class C3_2_GetPost extends HttpServlet {
	// C3_GetPost.java 클래스의 중복코드(14~36줄)를 Servlet 메서드를 사용하여 코드 작성
	// service 메서드 사용
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
			int num1 = 400;
			int num2 = 900;
		
			response.setContentType("text/html; charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<h2>" + request.getMethod() + "</h2>");
			out.printf("<p>%d = %d = %d</p>", num1, num2, num1 + num2);
		}
	// 서블릿을 통하여 Java를 가지고 웹앱을 만들 때 장점, 단점
	// 장점 : 
	// 단점 : Java 코드와 Html 코드가 뒤섞여 있어 유지보수가 어렵다. (스파게티 코드라 한다.)
}
 