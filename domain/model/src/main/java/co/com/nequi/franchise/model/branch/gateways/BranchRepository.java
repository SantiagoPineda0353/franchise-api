package co.com.nequi.franchise.model.branch.gateways;

import co.com.nequi.franchise.model.branch.Branch;
import reactor.core.publisher.Mono;

public interface BranchRepository {
    Mono<Branch> save(Branch branch);
    Mono<Branch> findById(Long id);
    Mono<Boolean> existsByFranchiseIdAndName(Long franchiseId, String name);
}