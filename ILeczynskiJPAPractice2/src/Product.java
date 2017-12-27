import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int dbID;
    private String ProductName;
    private Integer UnitsOnStock;


    @ManyToOne
    private Supplier supplier;


    @ManyToMany
    private List<Transcaction> transcactionList=new ArrayList<>();

    public void addTransaction(Transcaction transcaction){
        transcactionList.add(transcaction);
        transcaction.getProductList().add(this);
    }

    public List<Transcaction> getTranscactionList() {
        return transcactionList;
    }

    public void setTranscactionList(List<Transcaction> transcactionList) {
        this.transcactionList = transcactionList;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Product() {
    }

    public Product(String productName, Integer unitsOnStock) {
        ProductName = productName;
        UnitsOnStock = unitsOnStock;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public Integer getUnitsOnStock() {
        return UnitsOnStock;
    }

    public void setUnitsOnStock(Integer unitsOnStock) {
        UnitsOnStock = unitsOnStock;
    }

    public int getDbID() {
        return dbID;
    }

    public void setDbID(int dbID) {
        this.dbID = dbID;
    }
}
