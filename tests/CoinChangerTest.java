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
}
