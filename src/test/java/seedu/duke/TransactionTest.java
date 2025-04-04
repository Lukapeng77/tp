package seedu.duke;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;
import enumStructure.Category;
import enumStructure.Currency;
import enumStructure.Status;
import enumStructure.Priority;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TransactionTest {

    private Transaction transaction;
    private Currency usd;
    private Currency sgd;

    @BeforeEach
    public void setUp() {
        transaction = new Transaction(1, "Lunch", 10.0, sgd,
                Category.FOOD, LocalDate.of(2025, 4, 3), Status.PENDING);
    }

    @Test
    public void testGetters() {
        assertEquals(1, transaction.getId());
        assertEquals("Lunch", transaction.getDescription());
        assertEquals(10.0, transaction.getAmount());
        assertEquals(sgd, transaction.getCurrency());
        assertEquals(Category.FOOD, transaction.getCategory());
        assertEquals(Status.PENDING, transaction.getStatus());
        assertEquals(Priority.LOW, transaction.getPriority());
        assertEquals(0, transaction.getRecurringPeriod());
        assertFalse(transaction.isCompleted());
        assertFalse(transaction.isDeleted());
        assertTrue(transaction.getTags().isEmpty());
    }

    @Test
    public void testSetters() {
        transaction.setDescription("Dinner");
        transaction.setAmount(20);
        transaction.setCategory(Category.ENTERTAINMENT);
        transaction.setRecurringPeriod(7);
        transaction.setPriority(Priority.HIGH);

        assertEquals("Dinner", transaction.getDescription());
        assertEquals(20, transaction.getAmount());
        assertEquals(Category.ENTERTAINMENT, transaction.getCategory());
        assertEquals(7, transaction.getRecurringPeriod());
        assertEquals(Priority.HIGH, transaction.getPriority());
    }

    @Test
    public void testTagOperations() {
        transaction.addTag("food");
        transaction.addTag("daily");
        assertTrue(transaction.containsTag("food"));
        assertTrue(transaction.containsTag("daily"));

        transaction.removeTag("food");
        assertFalse(transaction.containsTag("food"));
        assertEquals(List.of("daily"), transaction.getTags());
    }

    @Test
    public void testDeleteAndRecover() {
        transaction.delete();
        assertTrue(transaction.isDeleted());
        transaction.recover();
        assertFalse(transaction.isDeleted());
    }

    @Test
    public void testCompleteStatus() {
        transaction.complete();
        assertTrue(transaction.isCompleted());
        transaction.notComplete();
        assertFalse(transaction.isCompleted());
    }

    @Test
    public void testIsSameTransaction() {
        Transaction other = new Transaction(1, "Dinner", 20.0, usd,
                Category.FOOD, LocalDate.now(), Status.COMPLETED);
        assertTrue(transaction.isSameTransaction(other));

        Transaction different = new Transaction(2, "Dinner", 20.0, usd,
                Category.FOOD, LocalDate.now(), Status.COMPLETED);
        assertFalse(transaction.isSameTransaction(different));
    }

    @Test
    public void testToString_completed() {
        transaction.complete();
        String output = transaction.toString();
        assertTrue(output.contains("[✓]"));
    }

    @Test
    public void testToString_notCompletedOrRecurring() {
        String output = transaction.toString();
        assertTrue(output.contains("[ ]"));
    }
}
