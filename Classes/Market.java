package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Interfaces.iActorBehaviour;
import Interfaces.iMarketBehaviour;
import Interfaces.iQueueBehaviour;
import Interfaces.iReturnOrderMarketBehaviour;

// дополнительно подключаем поведение магазина для возврата товара
public class Market implements iMarketBehaviour, iQueueBehaviour, iReturnOrderMarketBehaviour {
    //private List<Actor> queue;
    private List<iActorBehaviour> queue;

    public Market() {
        this.queue = new ArrayList<iActorBehaviour>();
    }

    @Override
    public void acceptToMarket(iActorBehaviour actor) {
        System.out.println(actor.getActor().getName()+" клиент пришел в магазин ");
        takeInQueue(actor);
    }

    @Override
    public void takeInQueue(iActorBehaviour actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName()+" клиент добавлен в очередь ");
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for(Actor actor:actors)
        {
            System.out.println(actor.getName()+" клиент ушел из магазина ");
            queue.remove(actor);
        }
        
    }

    @Override
    public void update() {
       takeOrder();
       giveOrder();
       releaseFromQueue();
    }

    @Override
    public void giveOrder() {
        for(iActorBehaviour actor: queue)
        {
            if(actor.isMakeOrder())
            {
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName()+" клиент получил свой заказ ");
            }
        }
        
    }

    @Override
    public void releaseFromQueue() {
       List<Actor> releaseActors = new ArrayList<>();
       for(iActorBehaviour actor:queue)
       {
        if(actor.isTakeOrder())
        {
            releaseActors.add(actor.getActor());
            System.out.println(actor.getActor().getName()+" клиент ушел из очереди ");
        }

       }
    releaseFromMarket(releaseActors);
    }



    @Override
    public void takeOrder() {
        for(iActorBehaviour actor:queue)
        {
            if(!actor.isMakeOrder())
            {
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName()+" клиент сделал заказ ");

            }
        }
        
    }

    /**
     * Подтверждение возврата товара
     * @param returnRequestId Идентификатор заявки на возврат
     * @return Результат одобрения заявки на возврат
     */
    @Override
    public boolean returnCommit(int returnRequestId) {
        // делаем что-нибудь вроде returnProductsToMarket(returnRequestId), а потом:
        System.out.printf("Возврат по заявке %s подтвержден\n", returnRequestId);
        return true;
    }

    /**
     * Оформление заявки на возврат товара
     * @param actor Покупатель
     * @param orderId Идентификатор заказа
     * @return Идентификатор заявки на возврат
     */
    @Override
    public int returnRequest(iActorBehaviour actor, int orderId) {
        int returnRequestId = 0;
        // делаем что-то вроде returnRequestId = returnRequests.insert(orderId), вместо этого сымитируем:
        Random rnd = new Random();
        returnRequestId = rnd.nextInt(100);
        System.out.printf("%s создал заявку на возврат. Номер заявки: %s\n", actor.getActor().getName(), returnRequestId);
        return returnRequestId;
    }
}
