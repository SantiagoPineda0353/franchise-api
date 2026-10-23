package co.com.nequi.franchise.model.product;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void shouldRejectNegativeStock() {
        Product product = Product.builder().name("Coffee").stock(-1).branchId(1L).build();
        assertFalse(product.hasValidStock());
    }

    @Test
    void shouldAcceptZeroStock() {
        Product product = Product.builder().name("Coffee").stock(0).branchId(1L).build();
        assertTrue(product.hasValidStock());
    }

    @Test
    void shouldRejectBlankName() {
        Product product = Product.builder().name("   ").stock(10).branchId(1L).build();
        assertFalse(product.hasValidName());
    }

    @Test
    void toBuilderShouldCreateNewInstanceWithoutMutatingOriginal() {
        Product original = Product.builder().id(1L).name("Coffee").stock(10).branchId(1L).build();
        Product updated = original.toBuilder().stock(50).build();

        assertEquals(10, original.getStock());
        assertEquals(50, updated.getStock());
    }

    @Test
    void shouldRejectNullStock() {
        Product product = Product.builder().name("Coffee").branchId(1L).build();
        assertFalse(product.hasValidStock());
    }

    @Test
    void shouldBelongToItsBranch() {
        Product product = Product.builder().name("Coffee").stock(5).branchId(1L).build();
        assertTrue(product.belongsTo(1L));
    }

    @Test
    void shouldNotBelongToAnotherBranch() {
        Product product = Product.builder().name("Coffee").stock(5).branchId(1L).build();
        assertFalse(product.belongsTo(2L));
    }
}