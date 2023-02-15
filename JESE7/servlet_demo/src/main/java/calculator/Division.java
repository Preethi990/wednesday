package calculator;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Division extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		double number1= Double.parseDouble(req.getParameter("number1"));
		double number2= Double.parseDouble(req.getParameter("number2"));
		
		resp.getWriter().print("The division of "+number1+" and "+number2+" is " +(number1/number2));
	}

}
