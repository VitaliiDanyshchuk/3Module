package com.company;
/**
 * Classname: Ordering
 * Date: 22.06.2020
 * @author: Vitalii Danyshchuk
 * @version: 1.1
 */
public class Ordering implements  IAcounting{

    private String name;          // name of ordering
    private int cost;             // cost ordering
    private int orderingPerMonth; // number of ordering per month
    private boolean delivery;     // is need delivery?

    public Ordering() { }

    public Ordering(String name,
                    int cost,
                    int orderingPerMonth,
                    boolean delivery) {
        this.name = name;
        this.cost = cost;
        this.orderingPerMonth = orderingPerMonth;
        this.delivery = delivery;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getOrderingPerMonth() {
        return orderingPerMonth;
    }

    public void setOrderingPerMonth(int orderingPerMonth) {
        this.orderingPerMonth = orderingPerMonth;
    }

    public boolean isDelivery() {
        return delivery;
    }

    public void setDelivery(boolean delivery) {
        this.delivery = delivery;
    }

    @Override
    public int getMoneyPerMonth() {
        if(delivery==false){
            return getOrderingPerMonth()*getCost();}
        else
        {
            return  getOrderingPerMonth()*getCost()+10;
        }
    }

    @Override
    public String toString() {
        return "Ordering{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", orderingPerMonth=" + orderingPerMonth +
                ", delivery=" + delivery +
                '}';
    }
}
