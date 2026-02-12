package enumEstudo.entities;

import java.util.Date;
import enumEstudo.enums.OrderStatus;

public class Order {
    private Integer id;
    private Date moment;
    private OrderStatus status;

    public Order(){
    }

    //lembrando: usamos esse construtor para inicializar o objeto com as informacoes adicionadas:
    public Order(Integer id, Date moment, OrderStatus status){
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Date getMoment() {
        return moment;
    }
    public void setMoment(Date moment) {
        this.moment = moment;
    }
    public OrderStatus getStatus() {
        return status;
    }
    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public String toString(){
        return "Order = id: " + id + " moment: " + moment + " status: " + status; 
    }
}
