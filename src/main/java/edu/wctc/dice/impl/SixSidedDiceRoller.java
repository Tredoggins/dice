package edu.wctc.dice.impl;

import edu.wctc.dice.iface.DiceRoller;
import org.springframework.stereotype.Component;


public class SixSidedDiceRoller implements DiceRoller {

    @Override
    public int Roll() {
        return (int)Math.round(Math.random()*5+1);
    }
}
