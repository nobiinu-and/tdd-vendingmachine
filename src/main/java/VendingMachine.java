public class VendingMachine {
    public int changePort;
    private int money;

    public void insetMoney(int money) {
        this.money += money;
    }

    public void purchase(String drink) {
        this.changePort = this.money - 100;
        this.money = 0;
    }
}
