package franciscambp.bsale.repository;

import franciscambp.bsale.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends JpaRepository<Product, Integer> {
    // SELECT * FROM product WHERE category.id = ?
    Page<Product> findAllByCategoryCategory (Integer category, Pageable pageable);

    // SELECT * FROM product WHERE name LIKE = %?%
    Page<Product> findAllByNameContaining (String name, Pageable pageable);
}
