## Task: Is this code will work? How many transactions will be opened? If it won't work, make code review.

```java
@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Page<Product> getProduct(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return productRepository.findAll(pageable);
    }
}

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/product")
    public Page<Product> getProduct(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        return productService.getProduct(page, size);
    }
}
```
solution: [here](./task_solution.md)