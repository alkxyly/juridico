package br.com.sergipetec.web.filter;

import javax.swing.JOptionPane;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtil {
	
	private static final SessionFactory sf = builderSessionFactory();

	private static SessionFactory builderSessionFactory() {
		try {
			AnnotationConfiguration cfg = new AnnotationConfiguration();
			cfg.configure("hibernate.cfg.xml");
			SessionFactory retorno = cfg.buildSessionFactory();
			System.out.println("Criou Relacionamentos");
			return retorno;
		} catch (Throwable e) {
			throw new ExceptionInInitializerError(e);
		}
	}
	
	public static SessionFactory getSessionFactory(){
		return sf;
	}
}
