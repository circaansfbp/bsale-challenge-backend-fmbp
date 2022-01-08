package franciscambp.bsale.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "product")
public class Product implements Serializable {

    @Id
    @Column(name = "id")
    private Integer idProducto;

    private String name;

    @Column(name = "url_image")
    private String urlImage;

    private float price;

    private Integer discount;

    @ManyToOne
    @JoinColumn(name = "category", insertable = false, updatable = false)
    private Category category;

    public Product(Integer idProducto, String name, String urlImage, float price, Integer discount, Category category) {
        this.idProducto = idProducto;
        this.name = name;
        this.urlImage = urlImage;
        this.price = price;
        this.discount = discount;
        this.category = category;
    }

    public Product () { }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProducto=" + idProducto +
                ", name='" + name + '\'' +
                ", urlImage='" + urlImage + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", category=" + category +
                '}';
    }
}
