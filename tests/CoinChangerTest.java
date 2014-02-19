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

    @Before
    public void setUp() throws Exception{
      coinChanger = new CoinChanger();
    }

    @Test
    public void givesChangeFor1() throws Exception {
        ArrayList<Integer> expectedChange = new ArrayList<Integer>();
        expectedChange.add(1);
        assertEquals(expectedChange, coinChanger.giveChange(1));
    }

    @Test
    public void givesChangeFor2() throws Exception {
        ArrayList<Integer> expectedChange = new ArrayList<Integer>();
        expectedChange.add(1);
        expectedChange.add(1);
        assertEquals(expectedChange, coinChanger.giveChange(2));
    }

    @Test
    public void givesChangeFor3() throws Exception {
        ArrayList<Integer> expectedChange = new ArrayList<Integer>();
        expectedChange.add(1);
        expectedChange.add(1);
        expectedChange.add(1);
        assertEquals(expectedChange, coinChanger.giveChange(3));
    }

    @Test
    public void givesChangeFor5() throws Exception {
        ArrayList<Integer> expectedChange = new ArrayList<Integer>();
        expectedChange.add(5);
        assertEquals(expectedChange, coinChanger.giveChange(5));
    }

    @Test
    public void givesChangeFor9() throws Exception {
        ArrayList<Integer> expectedChange = new ArrayList<Integer>();
        expectedChange.add(5);
        expectedChange.add(1);
        expectedChange.add(1);
        expectedChange.add(1);
        expectedChange.add(1);
        assertEquals(expectedChange, coinChanger.giveChange(9));
    }

    @Test
    public void givesChangeFor10() throws Exception {
        ArrayList<Integer> expectedChange = new ArrayList<Integer>();
        expectedChange.add(10);
        assertEquals(expectedChange, coinChanger.giveChange(10));
    }

    @Test
    public void givesChangeFor16()throws Exception {
        ArrayList<Integer> expectedChange = new ArrayList<Integer>();
        expectedChange.add(10);
        expectedChange.add(5);
        expectedChange.add(1);
        assertEquals(expectedChange, coinChanger.giveChange(16));
    }

    @Test
    public void givesChangeFor20() throws Exception {
        ArrayList<Integer> expectedChange = new ArrayList<Integer>();
        expectedChange.add(10);
        expectedChange.add(10);
        assertEquals(expectedChange, coinChanger.giveChange(20));
    }

    @Test
    public void givesChangeFor25() throws Exception {
        ArrayList<Integer> expectedChange = new ArrayList<Integer>();
        expectedChange.add(25);
        assertEquals(expectedChange, coinChanger.giveChange(25));
    }

    @Test
    public void givesChangeFor50() throws Exception {
        ArrayList<Integer> expectedChange = new ArrayList<Integer>();
        expectedChange.add(25);
        expectedChange.add(25);
        assertEquals(expectedChange,coinChanger.giveChange(50));
    }

    @Test
    public void givesChangeFor99() throws Exception {
        ArrayList<Integer> expectedChange = new ArrayList<Integer>();
        expectedChange.add(25);
        expectedChange.add(25);
        expectedChange.add(25);
        expectedChange.add(10);
        expectedChange.add(10);
        expectedChange.add(1);
        expectedChange.add(1);
        expectedChange.add(1);
        expectedChange.add(1);
    }


}
