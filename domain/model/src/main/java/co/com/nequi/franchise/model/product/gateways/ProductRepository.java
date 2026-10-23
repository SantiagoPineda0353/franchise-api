package co.com.nequi.franchise.model.product.gateways;

import co.com.nequi.franchise.model.product.BranchTopProduct;
import co.com.nequi.franchise.model.product.Product;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductRepository {
    Mono<Product> save(Product product);
    Mono<Product> findById(Long id);
    Mono<Void> deleteById(Long id);
    Mono<Boolean> existsByBranchIdAndName(Long branchId, String name);
    Flux<BranchTopProduct> findTopStockByFranchiseId(Long franchiseId);
}