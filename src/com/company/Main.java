package com.company;
/**
 * Classname: Main
 * Date: 22.06.2020
 * @author: Vitalii Danyshchuk
 * @version: 1.1
 *
1. Create two appropriate classes and 5 objects of each one.
2. Calculate the total salary of a month.
3. Find the highest cost .
4. Find he lowest cost
5.  The average cost.
6. What get more money, ordering or lunch?
 */
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Lunch happyMorning = new Lunch("happyMorning",20,20,false,LocalDateTime.of(2020,10,15,16,23));
        Lunch sunny = new Lunch("sunny",14, 10,true,LocalDateTime.of(2020,9,14,12,22));;
        Lunch vegan = new Lunch("vegan",10,6,true,LocalDateTime.of(2020,1,25,11,13));;
        Lunch bigLunch = new Lunch("bigLunch",29,50,true,LocalDateTime.of(2020,3,12,11,56));;
        Lunch extraLunch =  new Lunch("extraLunch",33,29,false,LocalDateTime.of(2020,7,30,9,03));;

        Ordering childrenOrder = new Ordering("childrenOrder",23,14,false,LocalDateTime.of(2020,2,21,10,15));
        Ordering friendlyOrder = new Ordering("friendlyOrder",30,30,false,LocalDateTime.of(2020,11,30,22,45));
        Ordering girlsOrder = new Ordering("girlsOrder",45,10,true,LocalDateTime.of(2020,9,12,14,1));
        Ordering workOrder = new Ordering("workOrder",15,20,true,LocalDateTime.of(2020,4,1,16,12));
        Ordering familyOrder = new Ordering("familyOrder",40,35,false,LocalDateTime.of(2020,10,5,9,02));

        List<IAcounting> eat = new ArrayList<>();
        eat.add(happyMorning);
        eat.add(sunny);
        eat.add(vegan);
        eat.add(bigLunch);
        eat.add(extraLunch);

        eat.add(childrenOrder);
        eat.add(friendlyOrder);
        eat.add(girlsOrder);
        eat.add(workOrder);
        eat.add(familyOrder);

        int moneyPerMonth = eat.stream().mapToInt(IAcounting::getMoneyPerMonth).sum();

        IAcounting highestCost = eat.stream().max(Comparator // what eat is the most cost
                .comparingInt(IAcounting::getMoneyPerMonth)).orElse(null);

        IAcounting lowestCost = eat.stream().min(Comparator // what eat is the least cost
                .comparingInt(IAcounting::getMoneyPerMonth)).orElse(null);

        double averageCost = eat.stream().mapToInt(IAcounting::getMoneyPerMonth) // average cost per month
                .average().orElse(0);

        int moneyByOrdering = eat.stream().filter(el -> el instanceof
                Ordering).mapToInt(IAcounting::getMoneyPerMonth).sum();

        int moneyByLunch = eat.stream().filter(el -> el instanceof
                Lunch).mapToInt(IAcounting::getMoneyPerMonth).sum();


        System.out.println("Money by ordering per month: " + moneyByOrdering);
        System.out.println("Money by lunch per month: " + moneyByLunch);

        if (moneyByOrdering > moneyByLunch)
        {   System.out.println("There are more money for ordering!");
    }
    else
        {
            System.out.println("There are more money for lunch!");
        }





    }
}
