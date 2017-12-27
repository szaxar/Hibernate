
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Supplier extends Company {



    @Column
    private Integer bankAccountNumber;

    public Integer getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(Integer bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    /*
        @OneToOne(mappedBy = "supplier")
        private Adress adress;
    */
    @OneToMany
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


    public Supplier(String street, String city, Integer zipCode, String CompanyName, Integer bankAccountNumber) {
        super(street, city, zipCode, CompanyName);
        this.bankAccountNumber = bankAccountNumber;
    }

    public Supplier() {
    }



}
