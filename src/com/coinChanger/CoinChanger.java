package com.coinChanger;

import java.util.ArrayList;

/**
 * Created by elizabethengelman on 2/18/14.
 */
public class CoinChanger {
    public ArrayList giveChange(int amount){
        ArrayList <Integer> change = new ArrayList<Integer>();
        int [] coins = {25, 10, 5, 1};
        for (int coin : coins){
            while (amount >= coin){
                change.add(coin);
                amount -= coin;
            }
        }
        return change;
    }
}
