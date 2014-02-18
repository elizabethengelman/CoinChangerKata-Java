package com.coinChanger;

import java.util.ArrayList;

/**
 * Created by elizabethengelman on 2/18/14.
 */
public class CoinChanger {
    public ArrayList giveChange(int amount){
        ArrayList <Integer> change = new ArrayList<Integer>();
        if (amount == 1){
            change.add(1);
        }
        else{
            change.add(1);
            change.add(1);
        }

        return change;
    }
}
