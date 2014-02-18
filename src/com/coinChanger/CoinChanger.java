package com.coinChanger;

import java.util.ArrayList;

/**
 * Created by elizabethengelman on 2/18/14.
 */
public class CoinChanger {
    public ArrayList giveChange(int amount){
        ArrayList <Integer> change = new ArrayList<Integer>();
        while (amount >= 10){
            change.add(10);
            amount -= 10;
        }

        while (amount >= 5){
            change.add(5);
            amount -= 5;
        }

        while (amount > 0){
            change.add(1);
            amount -= 1;
        }

        return change;
    }
}
