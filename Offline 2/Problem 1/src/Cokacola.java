public class Cokacola extends Product {
    int amount,price;
    Cokacola(int a,int p){
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
