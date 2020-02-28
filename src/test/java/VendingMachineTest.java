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

    @Test
    void purchase_twice() {
        VendingMachine machine = new VendingMachine();
        machine.insetMoney(100);
        machine.insetMoney(10);
        machine.purchase("water");
        assertEquals(10, machine.changePort);
        machine.insetMoney(100);
        machine.purchase("water");
        assertEquals(0, machine.changePort);
    }

    @Test
    void stock() {
        VendingMachine machine = new VendingMachine();
        machine.addStock("water", 2);
        assertEquals(2, machine.showStock("water"));
        machine.insetMoney(100);
        machine.insetMoney(10);
        machine.purchase("water");
        assertEquals(1, machine.showStock("water"));
    }

    @Test
    void noop_shortage_money() {
        VendingMachine machine = new VendingMachine();
        machine.insetMoney(10);
        assertEquals(10, machine.money);
        machine.purchase("water");
        assertEquals(10, machine.money);
        assertEquals(0, machine.changePort);
    }

    @Test
    void noop_shortage_money_another() {
        VendingMachine machine = new VendingMachine();
        machine.insetMoney(50);
        assertEquals(50, machine.money);
        machine.purchase("water");
        assertEquals(50, machine.money);
        assertEquals(0, machine.changePort);
    }
}
