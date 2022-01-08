package franciscambp.bsale.restcontroller;

import franciscambp.bsale.entity.Category;
import franciscambp.bsale.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/categorias")
public class CategoryRestController {

    @Autowired
    private ICategoryService categoryService;

    // Maneja petición para obtener las categorías
    @GetMapping("/")
    public ResponseEntity<List<Category>> getCategorias () {
        List<Category> categorias = categoryService.getCategorias();

        if (!categorias.isEmpty()) return new ResponseEntity<>(categorias, HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}
