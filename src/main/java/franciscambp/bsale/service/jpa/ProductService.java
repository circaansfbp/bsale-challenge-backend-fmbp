package franciscambp.bsale.service.jpa;

import franciscambp.bsale.entity.Category;
import franciscambp.bsale.entity.Product;
import franciscambp.bsale.repository.IProductRepository;
import franciscambp.bsale.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductService implements IProductService {

    @Autowired
    private IProductRepository productRepository;

    @Override
    @Transactional(readOnly = true)
    public Page<Product> getProductosPorCategoria(Integer idCategoria, Pageable pageable) {
        if (idCategoria != null) return productRepository.findAllByCategoryCategory(idCategoria, pageable);
        else
            return null;
    }

    @Override
    @Transactional(readOnly = true)
    public Page<Product> searchProductos(String name, Pageable pageable) {
        if (name != null) return productRepository.findAllByNameContaining(name, pageable);
        else
            return null;
    }
}
