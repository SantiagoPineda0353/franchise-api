package co.com.nequi.franchise.model.product;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class BranchTopProduct {
    Long branchId;
    String branchName;
    Long productId;
    String productName;
    Integer stock;
}