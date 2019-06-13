import org.hibernate.Session;

import com.erick.istoque.HibernateUtil;

public class Conecta {

	public static void main(String[] args) {
		Session sessao = null;
		try {
			sessao = HibernateUtil.getSession().openSession();
			System.out.println("conectou");
		} finally {
			sessao.close();
			System.out.println("fechou");
		}
	}
}
