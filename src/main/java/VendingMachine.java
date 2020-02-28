public class VendingMachine {
    public int changePort;
    private int money;
    private int stock;

    public void insetMoney(int money) {
        this.money += money;
    }

    public void purchase(String drink) {
        this.changePort = this.money - 100;
        this.money = 0;
        stock -= 1;
    }

    public void addStock(String drink, int amount) {
        stock = amount;
    }

    public int showStock(String drink) {
        return stock;
    }
}
