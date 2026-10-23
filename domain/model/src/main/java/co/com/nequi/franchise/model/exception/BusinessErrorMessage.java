package co.com.nequi.franchise.model.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum BusinessErrorMessage {
    FRANCHISE_NOT_FOUND("FRN-404", "Franchise not found", ErrorType.NOT_FOUND),
    BRANCH_NOT_FOUND("BRN-404", "Branch not found", ErrorType.NOT_FOUND),
    PRODUCT_NOT_FOUND("PRD-404", "Product not found", ErrorType.NOT_FOUND),
    PRODUCT_NOT_IN_BRANCH("PRD-404-2", "Product does not belong to the given branch", ErrorType.NOT_FOUND),
    FRANCHISE_NAME_ALREADY_EXISTS("FRN-409", "A franchise with that name already exists", ErrorType.CONFLICT),
    BRANCH_NAME_ALREADY_EXISTS("BRN-409", "A branch with that name already exists in the franchise", ErrorType.CONFLICT),
    PRODUCT_NAME_ALREADY_EXISTS("PRD-409", "A product with that name already exists in the branch", ErrorType.CONFLICT),
    INVALID_NAME("VAL-400-1", "Name must not be blank", ErrorType.VALIDATION),
    INVALID_STOCK("VAL-400-2", "Stock must be zero or greater", ErrorType.VALIDATION);

    private final String code;
    private final String message;
    private final ErrorType type;
}