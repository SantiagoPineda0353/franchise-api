package co.com.nequi.franchise.model.branch;
import lombok.Builder;
import lombok.Value;

@Value
@Builder(toBuilder = true)
public class Branch {
    Long id;
    String name;
    Long franchiseId;

    public boolean hasValidName(){
        return name != null && !name.isBlank();
    }
}
