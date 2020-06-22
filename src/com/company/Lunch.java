package com.company;
/**
 * Classname: Lunch
 * Date: 22.06.2020
 * @author: Vitalii Danyshchuk
 * @version: 1.1
 */
import java.time.LocalDateTime;

public class Lunch implements IAcounting {

 private String name;
 private int cost;            // solid salary for a month according to contranct
 private int lunchesPerMonth; // lunches for the month were sold
 private boolean souse;       // lunch supplement for an additional price
 LocalDateTime discountDay;

    public Lunch() {
    }

    public Lunch(String name, int cost, int lunchesPerMonth, boolean souse, LocalDateTime discountDay) {
        this.name = name;
        this.cost = cost;
        this.lunchesPerMonth = lunchesPerMonth;
        this.souse = souse;
        this.discountDay = discountDay;
    }

    public LocalDateTime getDiscountDay() {
        return discountDay;
    }

    public void setDiscountDay(LocalDateTime discountDay) {
        this.discountDay = discountDay;
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

    public int getLunchesPerMonth() {
        return lunchesPerMonth;
    }

    public void setLunchesPerMonth(int lunchesPerMonth) {
        this.lunchesPerMonth = lunchesPerMonth;
    }

    public boolean getSouse() {
        return souse;
    }

    public void setSouse(boolean souse) {
        this.souse = souse;
    }

    public void getdiscount()
    {
        if(discountDay.getDayOfMonth()==14)
        {
            cost= cost/2;
        }
    }


    @Override
    public int getMoneyPerMonth()
 {
     if(souse==false){
        return getLunchesPerMonth()*getCost();}
     else
     {
         return  getLunchesPerMonth()*getCost()+2;
     }
    }

    @Override
    public String toString() {
        return "Lunch{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", lunchesPerMonth=" + lunchesPerMonth +
                ", souse=" + souse +
                '}';
    }
}
