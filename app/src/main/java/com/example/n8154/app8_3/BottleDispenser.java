package com.example.n8154.app8_3;

import android.widget.TextView;

import java.util.ArrayList;

public class BottleDispenser {

    private int bottles;
    private double money;
    //private ArrayList<Bottle> list;
    private static int lukumaara;

    public BottleDispenser() {
        bottles = 6;
        money = 0;
        ArrayList<Bottle> list = new ArrayList<Bottle>();
        /*list.add(new Bottle("Pepsi Max"));
        list.add(new Bottle("Pepsi Max", "Pepsi", 0.3, 0.5, 1.8));
        list.add(new Bottle("Pepsi Max", "Pepsi", 0.3, 1.5, 2.2));
        list.add(new Bottle("Coca-Cola Zero", "Coca-Cola", 0.3, 0.5, 2.0));
        list.add(new Bottle("Coca-Cola Zero", "Coca-Cola", 0.3, 1.5, 2.5));
        list.add(new Bottle("Fanta Zero", "Fanta", 0.3, 0.5, 1.95));
        list.add(new Bottle("Fanta Zero", "Fanta", 0.3, 0.5, 1.95));*/
        for(int i = 0;i<bottles;i++) {
            list.add(new Bottle());
        }
        lukumaara++;
    }


    public static int getAmount() {
        return lukumaara;
    }

    public double getBalance() {
        return money;
    }

    public void buyBottle(TextView text) {
        if (bottles <= 0) text.setText("Pullot ovat loppuneet!");
        else if (money < 1) text.setText("Syötä rahaa ensin!");
        else {
            bottles -= 1;
            money -= 1;
            text.setText("KACHUNK! Pepsi Max tipahti masiinasta!\nRahaa jäljellä: " +getBalance() + "e");
        }
    }

    public void returnMoney(TextView text) {
        text.setText("Klink klink. Sinne menivät rahat!\nRahaa tuli ulos " + getBalance() + "e");
        money = 0;
    }

    public void addMoney(TextView text, double amount) {
        money += amount;
        text.setText("Lisäsit rahaa!\nSaldo: " + getBalance() + "e");
    }
}