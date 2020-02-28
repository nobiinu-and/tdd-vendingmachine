import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VendingMachineTest {
    @Test
    void first_test() {
        VendingMachine machine = new VendingMachine();
        machine.insetMoney(100);
        machine.purchase("water");
        assertEquals("water", machine.dispensingSlot);
        assertEquals(0, machine.changePort);
    }
}
