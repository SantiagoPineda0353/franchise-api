package co.com.nequi.franchise.model.franchise;
import lombok.Builder;
import lombok.Value;

@Value
@Builder(toBuilder = true)
public class Franchise {
    Long id;
    String name;

    public boolean hasValidName(){
        return name != null && !name.isBlank();
    }
}
