package entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "sizes")
public class Size {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sizes")
    private Integer idSize;

    private String size;

    @OneToMany(mappedBy = "size")
    private List<ProductDetails> productDetailsList;

    public Size() {

    }

    @Override
    public String toString() {
        return "Size{" +
                "idSize=" + idSize +
                ", size=" + size +
                '}';
    }

    public Integer getIdSize() {
        return idSize;
    }

    public void setIdSize(Integer idSize) {
        this.idSize = idSize;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public List<ProductDetails> getProductDetailsList() {
        return productDetailsList;
    }

    public void setProductDetailsList(List<ProductDetails> productDetailsList) {
        this.productDetailsList = productDetailsList;
    }
}

