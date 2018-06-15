public class Pepsi extends Product {
    int amount,price;
    Pepsi(int a,int p){
        amount=a;
        price=p;
    }
    @Override
    void getProduct() {
        amount--;
    }

    @Override
    int getAmount() {
        return amount;
    }

    @Override
    int getPrice() {
        return price;
    }
}
