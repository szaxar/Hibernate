import javax.persistence.*;

@Entity
public class Customer extends Company {

    @Column
    private Integer discount;

    public Customer(String street, String city, Integer zipCode, String CompanyName, Integer discount) {
        super(street, city, zipCode, CompanyName);
        this.discount = discount;
    }

    public Customer() {
    }




    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }
}
