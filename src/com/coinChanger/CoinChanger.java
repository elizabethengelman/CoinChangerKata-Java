package com.coinChanger;

import java.util.ArrayList;

/**
 * Created by elizabethengelman on 2/18/14.
 */
public class CoinChanger {
    public ArrayList giveChange(int amount){
        ArrayList <Integer> change = new ArrayList<Integer>();
        while (amount > 0){
            change.add(1);
            amount -= 1;
        }
       
        return change;
    }
}
