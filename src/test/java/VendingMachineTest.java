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

    @Test
    void purchase_and_put_change() {
        VendingMachine machine = new VendingMachine();
        machine.insetMoney(100);
        machine.insetMoney(10);
        machine.purchase("water");
        assertEquals(10, machine.changePort);
    }
}
