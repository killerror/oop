package Interfaces;

public interface iReturnOrderMarketBehaviour {
    /**
     * Оформление заявки на возврат товара
     * @param actor Покупатель
     * @param orderId Идентификатор заказа
     * @return Идентификатор заявки на возврат
     */
    public int returnRequest(iActorBehaviour actor, int orderId);
    /**
     * Подтверждение возврата товара
     * @param returnRequestId Идентификатор заявки на возврат
     * @return Результат одобрения заявки на возврат
     */
    public boolean returnCommit(int returnRequestId);
}
