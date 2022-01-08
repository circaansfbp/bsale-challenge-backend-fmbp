package franciscambp.bsale.service;

import franciscambp.bsale.entity.Category;
import franciscambp.bsale.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IProductService {

    // Obtener los productos por categoria
    Page<Product> getProductosPorCategoria (Integer idCategoria, Pageable pageable);

    // Buscar productos
    Page<Product> searchProductos (String name, Pageable pageable);
}
