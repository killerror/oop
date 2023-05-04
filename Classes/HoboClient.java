package Classes;

public class HoboClient extends Actor {
    private int promoId;

    public HoboClient(String name, int promo) {
        super(name);
        promoId = promo;
    }

    public int getPromoId() {
        return this.promoId;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Actor getActor() {
        return this;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }

    @Override
    public void setTakeOrder(boolean pickUpOrder) {
        super.isTakeOrder = pickUpOrder;
    }

}
