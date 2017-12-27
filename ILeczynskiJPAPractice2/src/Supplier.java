
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int dbID;
    private String CompanyName;
    private String Street;
    private String City;

    @OneToMany(mappedBy = "supplier")
    private List<Product> productList=new ArrayList<Product>();

    public List<Product> getProductList() {
        return productList;
    }

    public void addProduct(Product product){
        productList.add(product);
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public Supplier(String companyName, String street, String city) {
        CompanyName = companyName;
        Street = street;
        City = city;
    }

    public Supplier() {
    }


    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public int getDbID() {
        return dbID;
    }

    public void setDbID(int dbID) {
        this.dbID = dbID;
    }
}
