package servlet_validation;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class signup extends GenericServlet
{

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		User user = new User();
		user.setName(req.getParameter("Name"));
		user.setMobile(Long.parseLong(req.getParameter("Mobile")));
		
	}

}
 