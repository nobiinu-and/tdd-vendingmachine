import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VendingMachineTest {
    @Test
    void first_test() {
        VendingMachine machine = new VendingMachine();
        machine.insetMoney(100);
        machine.purchase("water");
        assertEquals(0, machine.changePort);
    }
}
