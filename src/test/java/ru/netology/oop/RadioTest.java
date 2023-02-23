package ru.netology.oop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {
    @Test
    public void setRaidioZero(){
        int stationNumber = 0;
        Radio radio = new Radio();
        radio.setRadioStationNumber(stationNumber);

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }
}
