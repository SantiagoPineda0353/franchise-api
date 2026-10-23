package co.com.nequi.franchise.model.branch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BranchTest {

    @Test
    void shouldAcceptValidName() {
        Branch branch = Branch.builder().name("Downtown").franchiseId(1L).build();
        assertTrue(branch.hasValidName());
    }

    @Test
    void shouldRejectBlankName() {
        Branch branch = Branch.builder().name("").franchiseId(1L).build();
        assertFalse(branch.hasValidName());
    }

    @Test
    void shouldRejectNullName() {
        Branch branch = Branch.builder().franchiseId(1L).build();
        assertFalse(branch.hasValidName());
    }

    @Test
    void toBuilderShouldRenameAndKeepFranchiseReference() {
        Branch original = Branch.builder().id(10L).name("Downtown").franchiseId(1L).build();
        Branch renamed = original.toBuilder().name("Uptown").build();

        assertEquals("Downtown", original.getName());
        assertEquals("Uptown", renamed.getName());
        assertEquals(1L, renamed.getFranchiseId());
    }
}