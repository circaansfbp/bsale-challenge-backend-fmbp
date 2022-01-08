package franciscambp.bsale.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "category")
public class Category implements Serializable {

    @Id
    @Column(name = "id")
    private Integer category;

    private String name;

    public Category(Integer category, String name) {
        this.category = category;
        this.name = name;
    }

    public Category () { }

    public Integer getIdCategoria() {
        return category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Category{" +
                "idCategoria=" + category +
                ", name='" + name + '\'' +
                '}';
    }
}
