package edu.wctc.dice.impl;

import edu.wctc.dice.iface.DiceRoller;

public class FourSidedDiceRoller implements DiceRoller {
    @Override
    public int Roll() {
        return (int)Math.round(Math.random()*3+1);
    }
}
