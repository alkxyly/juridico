package br.com.sergipetec.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class ConexaoHibernateFilter implements Filter {
	private SessionFactory sf;
	@Override
	public void destroy() {
		System.out.println("calling destroy()");
		
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		Session currentSession = this.sf.getCurrentSession();
		Transaction transaction = null;
		
		try {
			transaction = currentSession.beginTransaction();
			arg2.doFilter(arg0, arg1);
			transaction.commit();
			if(currentSession.isOpen())
				currentSession.close();
		} catch (Throwable ex) {
			try {
				if (transaction.isActive()) {
					transaction.rollback();
				}
			} catch (Throwable t) {
				t.printStackTrace();
			}
			throw new ServletException(ex);
		}
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		this.sf = HibernateUtil.getSessionFactory();
		
	}

}
