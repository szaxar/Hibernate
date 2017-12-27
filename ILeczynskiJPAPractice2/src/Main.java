import org.hibernate.*;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {

    private static final SessionFactory ourSessionFactory;

    static {
        try {
            Configuration configuration = new Configuration();
            configuration.configure();

            ourSessionFactory = configuration.buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() throws HibernateException {
        return ourSessionFactory.openSession();
    }


    public static void main(final String[] args) throws Exception {
/*
            System.out.println("Wpisz nazwe i ilosc Produktu");
            Scanner odczyt = new Scanner(System.in);
            String name=odczyt.nextLine();
            String ilosc = odczyt.nextLine();
            Product product=new Product(name,Integer.parseInt(ilosc));
            */

        Supplier supplier = new Supplier("cxxx", "fsf", "fsff");
        Supplier supplier1 = new Supplier("cahjfj", "fsf", "fsff");
        Product product = new Product("fsjf", 5242);
        Product product1 = new Product("jfasd", 3254);
        Product product2 = new Product("afvxxx", 5212);
        supplier.addProduct(product);
        supplier.addProduct(product1);
        supplier1.addProduct(product2);

        Category category = new Category("fsfs");
        category.addProdcut(product);
        category.addProdcut(product1);
        category.addProdcut(product2);

        Transcaction transaction;
        transaction = new Transcaction(15, 25);

        Transcaction transaction1;
        transaction1 = new Transcaction(21, 2);
        transaction.addProduct(product);
        transaction.addProduct(product1);
        transaction1.addProduct(product);


        final Session session = getSession();
        try {
            Transaction tx = session.beginTransaction();



        //    session.save(transaction);
       //    session.save(transaction1);

      //  Supplier product3=session.get(Supplier.class,1);
       // System.out.println(product3.getCompanyName());

            Transcaction transcaction3 = session.get(Transcaction.class, 17);
            System.out.println(transcaction3.getTransactionNumber());
            System.out.println(transcaction3.getQuantity());
            for (int i = 0; i < transcaction3.getProductList().size(); i++)
                System.out.println(transcaction3.getProductList().get(i).getProductName());

            tx.commit();
        } finally {
            session.close();
        }
/*
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("myDatabaseConfig");
            EntityManager em = emf.createEntityManager();
            EntityTransaction etx = em.getTransaction();
            etx.begin();
//do something
            em.persist(product);

            etx.commit();
            em.close();
        }
*/

    }

}



