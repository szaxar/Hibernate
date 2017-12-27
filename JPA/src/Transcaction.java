import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Transcaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int dbId;

    private Integer TransactionNumber;
    private Integer Quantity;

    @ManyToMany(mappedBy = "transcactionList",cascade ={CascadeType.PERSIST} )
    private List<Product> productList=new ArrayList<>();

    public List<Product> getProductList() {
        return productList;
    }

    public void addProduct(Product product){
        productList.add(product);
        product.getTranscactionList().add(this);
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public Transcaction(Integer transactionNumber, Integer quantity) {
        TransactionNumber = transactionNumber;
        Quantity = quantity;
    }

    public Transcaction() {
    }

    public int getDbId() {
        return dbId;
    }

    public void setDbId(int dbId) {
        this.dbId = dbId;
    }

    public Integer getTransactionNumber() {
        return TransactionNumber;
    }

    public void setTransactionNumber(Integer transactionNumber) {
        TransactionNumber = transactionNumber;
    }

    public Integer getQuantity() {
        return Quantity;
    }

    public void setQuantity(Integer quantity) {
        Quantity = quantity;
    }
}
