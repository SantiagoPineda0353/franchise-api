package co.com.nequi.franchise.model.franchise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FranchiseTest {

    @Test
    void shouldAcceptValidName() {
        Franchise franchise = Franchise.builder().name("Nequi Coffee").build();
        assertTrue(franchise.hasValidName());
    }

    @Test
    void shouldRejectBlankName() {
        Franchise franchise = Franchise.builder().name("   ").build();
        assertFalse(franchise.hasValidName());
    }

    @Test
    void shouldRejectNullName() {
        Franchise franchise = Franchise.builder().build();
        assertFalse(franchise.hasValidName());
    }

    @Test
    void toBuilderShouldRenameWithoutMutatingOriginal() {
        Franchise original = Franchise.builder().id(1L).name("Old Name").build();
        Franchise renamed = original.toBuilder().name("New Name").build();

        assertEquals("Old Name", original.getName());
        assertEquals("New Name", renamed.getName());
        assertEquals(original.getId(), renamed.getId());
    }
}