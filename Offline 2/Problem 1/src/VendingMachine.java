public class VendingMachine {
    private  State state;
    private int currentMoney;
    private Product[] product;
    public VendingMachine(int cm){
        state=null;
        this.currentMoney=cm;
        product=new Product[3];
    }
    public void setProduct(){

        product[0]=new Pepsi(1,16);
        product[1]=new Cokacola(15,18);
        product[2]=new Sevenup(20,15);
    }
    public void getProduct(int ch){
         product[ch].getProduct();
         currentMoney+=product[ch].getPrice();
    }
    public int getProductPrice(int ch){
        return product[ch].getPrice();
    }
    public int getProductAmount(int ch){
        return product[ch].getAmount();
    }
    public void setState(State state){
        this.state=state;
    }
    public State getState(){
        return this.state;
    }
}
