
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {




    public static void main(final String[] args) throws Exception {
/*
            System.out.println("Wpisz nazwe i ilosc Produktu");
            Scanner odczyt = new Scanner(System.in);
            String name=odczyt.nextLine();
            String ilosc = odczyt.nextLine();
            Product product=new Product(name,Integer.parseInt(ilosc));
            */


       Customer customer=new Customer("sfsfs","fsfsfs",32500,"sxcxcx",42);
       Supplier supplier = new Supplier("Oświecimska","Chrznaów",32552,"fsfs",5252);
       Supplier supplier1 = new Supplier("Oświecimska","Krakow",52323,"xcxcx",525252525);
       // Product product = new Product("testowy", 5242);
        //Product product1 = new Product("jfasd", 3254);
       // Product product2 = new Product("afvxxx", 5212);


       // Adress adress=new Adress("Chrznaów","Oświecimska");
        //Adress adress1=new Adress("Krakow","Oświecimska");
       // supplier.addProduct(product);
       // supplier.addProduct(product1);
       // supplier1.addProduct(product2);
      // product.setSupplier(supplier);
      ///  product1.setSupplier(supplier);
       // product2.setSupplier(supplier1);

        //supplier.setAdress(adress);
       // supplier.setAdress(adress1);
       // adress.setSupplier(supplier);
       // adress1.setSupplier(supplier1);
       // Category category = new Category("fsfs");
       // category.addProdcut(product);
       // category.addProdcut(product1);
       // category.addProdcut(product2);

     //   Transcaction transaction;
      //  transaction = new Transcaction(15, 25);

      //  Transcaction transaction1;
      //  transaction1 = new Transcaction(21, 2);
      //  transaction.addProduct(product);
      //  transaction.addProduct(product1);
      //  transaction1.addProduct(product);





            EntityManagerFactory emf = Persistence.createEntityManagerFactory("myDatabaseConfig");
            EntityManager em = emf.createEntityManager();
            EntityTransaction etx = em.getTransaction();
            etx.begin();
//do something

/*
        em.persist(adress);
        em.persist(adress1);
           em.persist(product);
        em.persist(product1);
        em.persist(product2);
        */
        em.persist(supplier);
        em.persist(supplier1);
        em.persist(customer);


       // em.persist(category);
        //em.persist(transaction);
       // em.persist(transaction1);
            //etx.commit();

           etx.commit();
            em.close();
        }


    }





