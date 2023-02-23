package ru.netology.oop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {
    @Test
    public  void setRadioStationNumberAbove9(){
        Radio radio = new Radio();
        radio.setRadioStationNumber(10);

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public  void setRadioStationNumberBelow0(){
        Radio radio = new Radio();
        radio.setRadioStationNumber(-1);

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setRadioZero(){
        int stationNumber = 0;
        Radio radio = new Radio();
        radio.setRadioStationNumber(stationNumber);

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setRadioNine(){
        int stationNumber = 9;
        Radio radio = new Radio();
        radio.setRadioStationNumber(stationNumber);

        int expected = 9;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public  void nextStationWhen9(){
        int stationNumber = 9;
        Radio radio = new Radio();
        radio.setRadioStationNumber(stationNumber);
        radio.next();

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public  void nextStationWhen8(){
        int stationNumber = 8;
        Radio radio = new Radio();
        radio.setRadioStationNumber(stationNumber);
        radio.next();

        int expected = 9;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public  void prevStationWhen0(){
        int stationNumber = 0;
        Radio radio = new Radio();
        radio.setRadioStationNumber(stationNumber);
        radio.prev();

        int expected = 9;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevStationWhen1(){
        int stationNumber = 1;
        Radio radio = new Radio();
        radio.setRadioStationNumber(stationNumber);
        radio.prev();

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void  increaseVolumeWhen9 (){

        Radio radio = new Radio();
        radio.setRadioVolume(9);
        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void  increaseVolumeWhen10 (){
        int volumeLevel = 10;
        Radio radio = new Radio();
        radio.setRadioVolume(volumeLevel);
        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void  decreaseVolumeWhen1 (){
        int volumeLevel = 1;
        Radio radio = new Radio();
        radio.setRadioVolume(volumeLevel);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void  decreaseVolumeWhen0 (){
        int volumeLevel = 0;
        Radio radio = new Radio();
        radio.setRadioVolume(volumeLevel);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVoulumeWrongBelow(){
        int volumeLevel = -1;
        Radio radio = new Radio();
        radio.setRadioVolume(volumeLevel);

        int expected = 0;
        int actual = radio.getRadioVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setVoulumeWrongAbove(){
        int volumeLevel = 11;
        Radio radio = new Radio();
        radio.setRadioVolume(volumeLevel);

        int expected = 0;
        int actual = radio.getRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

}
