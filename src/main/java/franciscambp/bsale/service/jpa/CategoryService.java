package franciscambp.bsale.service.jpa;

import franciscambp.bsale.entity.Category;
import franciscambp.bsale.repository.ICategoryRepository;
import franciscambp.bsale.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements ICategoryService {

    @Autowired
    private ICategoryRepository categoryRepository;

    // Obtener todas las categorías
    @Override
    public List<Category> getCategorias() {
        return categoryRepository.findAll();
    }
}
