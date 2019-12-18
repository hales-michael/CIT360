package servletPackage;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class calculator extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		
			PrintWriter out = response.getWriter();
			int n1 = Integer.parseInt(request.getParameter("num1"));
			int n2 = Integer.parseInt(request.getParameter("num2"));
			String operation = request.getParameter("operation");
			int result = 0;
			
//			System.out.println(operation);
			
//			operation = "a";
			
			
			switch(operation) {
			case "+":
				result = n1 + n2;
				break;
				
			case "-":
				result = n1 - n2;
				break;
				
			case "*":
				result = n1 * n2;
				break;
				
			case "/":
				result = n1 / n2;
				break;
				
			default:
				break;
				
			}
			
			out.println(result);
	}
}
