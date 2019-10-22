package comm.example.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class MyApplicationListener
 *
 */
@WebListener
public class MyApplicationListener implements ServletContextListener {
	private String email = null;
    @Override
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		email = sce.getServletContext().getInitParameter("email").toString();
		System.out.println("Context initialized: "+ email);
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		System.out.println("Context destroyed: "+ email);
	}

	/**
     * Default constructor. 
     */
    public MyApplicationListener() {
        // TODO Auto-generated constructor stub
    }
	
}
