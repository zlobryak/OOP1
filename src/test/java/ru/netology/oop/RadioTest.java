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

    @Test
    public  void nextStationWhen9(){
        Radio radio = new Radio();
        radio.setRadioStationNumber(9);
        radio.next();

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public  void nextStation(){
        Radio radio = new Radio();
        radio.setRadioStationNumber(8);
        radio.next();

        int expected = 9;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public  void prevStationWhen0(){
        Radio radio = new Radio();
        radio.setRadioStationNumber(0);
        radio.prev();

        int expected = 9;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevStationWhen(){
        Radio radio = new Radio();
        radio.setRadioStationNumber(1);
        radio.prev();

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void  increaseVolume9 (){

        Radio radio = new Radio();
        radio.setRadioVolume(9);
        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void  increaseVolume10 (){

        Radio radio = new Radio();
        radio.setRadioVolume(10);
        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void  decreaseVolume1 (){

        Radio radio = new Radio();
        radio.setRadioVolume(1);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void  decreaseVolume0 (){

        Radio radio = new Radio();
        radio.setRadioVolume(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }



}
