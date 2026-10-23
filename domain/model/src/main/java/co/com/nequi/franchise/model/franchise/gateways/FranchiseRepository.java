package co.com.nequi.franchise.model.franchise.gateways;

import co.com.nequi.franchise.model.franchise.Franchise;
import reactor.core.publisher.Mono;

public interface FranchiseRepository {
    Mono<Franchise> save(Franchise franchise);
    Mono<Franchise> findById(Long id);
    Mono<Boolean> existsByName(String name);
}