package co.com.nequi.franchise.model.product;
import lombok.Builder;
import lombok.Value;

@Value
@Builder(toBuilder = true)
public class Product {
    Long id;
    String name;
    Integer stock;
    Long branchId;

    public boolean hasValidName(){
        return name != null && !name.isBlank();
    }

    public boolean hasValidStock(){
        return stock != null && stock >= 0;
    }

    public boolean belongsTo(Long branchId) {
        return this.branchId.equals(branchId);
    }

}
