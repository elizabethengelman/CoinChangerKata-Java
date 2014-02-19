package com.coinChanger;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by elizabethengelman on 2/18/14.
 */
public class CoinChangerTest {
    private CoinChanger coinChanger;
    private ArrayList<Integer> expectedChange;

    public ArrayList<Integer> expectedChange(int... numbers) {
        ArrayList<Integer> change = new ArrayList<Integer>();
        for (int number : numbers){
            change.add(number);
        }
        return change;
    }


    @Before
    public void setUp() throws Exception{
      coinChanger = new CoinChanger();
    }

    @Test
    public void givesChangeFor1() throws Exception {
        assertEquals(expectedChange(1), coinChanger.giveChange(1));
    }

    @Test
    public void givesChangeFor2() throws Exception {
        assertEquals(expectedChange(1,1), coinChanger.giveChange(2));
    }

    @Test
    public void givesChangeFor3() throws Exception {
        assertEquals(expectedChange(1,1,1), coinChanger.giveChange(3));
    }

    @Test
    public void givesChangeFor5() throws Exception {
        assertEquals(expectedChange(5), coinChanger.giveChange(5));
    }

    @Test
    public void givesChangeFor9() throws Exception {
        assertEquals(expectedChange(5,1,1,1,1), coinChanger.giveChange(9));
    }

    @Test
    public void givesChangeFor10() throws Exception {
        assertEquals(expectedChange(10), coinChanger.giveChange(10));
    }

    @Test
    public void givesChangeFor16()throws Exception {
        assertEquals(expectedChange(10,5,1), coinChanger.giveChange(16));
    }

    @Test
    public void givesChangeFor20() throws Exception {
        assertEquals(expectedChange(10,10), coinChanger.giveChange(20));
    }

    @Test
    public void givesChangeFor25() throws Exception {
        assertEquals(expectedChange(25), coinChanger.giveChange(25));
    }

    @Test
    public void givesChangeFor50() throws Exception {
        assertEquals(expectedChange(25,25),coinChanger.giveChange(50));
    }

    @Test
    public void givesChangeFor99() throws Exception {
        assertEquals(expectedChange(25,25,25,10,10,1,1,1,1), coinChanger.giveChange(99));
    }
}
