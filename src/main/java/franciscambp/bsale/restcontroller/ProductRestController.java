package franciscambp.bsale.restcontroller;

import franciscambp.bsale.entity.Product;
import franciscambp.bsale.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/productos")
public class ProductRestController {

    @Autowired
    private IProductService productService;

    // Maneja la petición para obtener los productos por categoría
    @GetMapping("/categoria/{idCategoria}/page/{nroPagina}")
    public ResponseEntity<Page<Product>> getProductosPorCategoria (@PathVariable(value = "idCategoria") Integer idCategoria,
                                                                   @PathVariable(value = "nroPagina") int nroPagina) {

        Page productos = productService.getProductosPorCategoria(idCategoria, PageRequest.of(nroPagina, 6));

        if (!productos.isEmpty()) return new ResponseEntity<>(productos, HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    // Maneja la petición de búsqueda de productos
    @GetMapping("/buscar/page/{nroPagina}")
    public ResponseEntity<Page<Product>> searchProductos (@PathVariable(value = "nroPagina") int nroPagina,
                                                          @RequestParam String name) {
        Page productos = productService.searchProductos(name, PageRequest.of(nroPagina, 6));

        if (!productos.isEmpty() && productos != null) return new ResponseEntity<>(productos, HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}
