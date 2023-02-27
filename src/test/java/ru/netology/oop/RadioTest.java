package ru.netology.oop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {
    Radio radio = new Radio();

    @Test
    void getQuantityofRadioStationsTest() {
        radio.setQuantityOfRadioStations(1);
        int expected = 0;
        int actual = radio.getQuantityOfRadioStations();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void setQuantityOfRadioStationsTestBelow() {
        radio.setQuantityOfRadioStations(-1);
        int expected = 10;
        int actual = radio.getQuantityOfRadioStations();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void setQuantityOfRadioStationsTestInRange() {
        radio.setQuantityOfRadioStations(12);
        int expected = 11;
        int actual = radio.getQuantityOfRadioStations();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void setRadioStationNumberAbove9() {
        radio.setNumberOfRadioStations(10);
        int expected = 0;
        int actual = radio.getNumberOfRadioStations();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setRadioStationNumberBelow0() {
        radio.setNumberOfRadioStations(-1);

        int expected = 0;
        int actual = radio.getNumberOfRadioStations();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setRadioZero() {
        int stationNumber = 0;
        radio.setNumberOfRadioStations(stationNumber);

        int expected = 0;
        int actual = radio.getNumberOfRadioStations();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setRadioNine() {
        int stationNumber = 9;
        radio.setNumberOfRadioStations(stationNumber);

        int expected = 9;
        int actual = radio.getNumberOfRadioStations();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationWhen9() {
        int stationNumber = 9;
        radio.setNumberOfRadioStations(stationNumber);
        radio.next();

        int expected = 0;
        int actual = radio.getNumberOfRadioStations();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationWhen8() {
        int stationNumber = 8;
        radio.setNumberOfRadioStations(stationNumber);
        radio.next();

        int expected = 9;
        int actual = radio.getNumberOfRadioStations();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationWhen0() {
        int stationNumber = 0;
        radio.setNumberOfRadioStations(stationNumber);
        radio.prev();

        int expected = 9;
        int actual = radio.getNumberOfRadioStations();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationWhen1() {
        int stationNumber = 1;
        radio.setNumberOfRadioStations(stationNumber);
        radio.prev();

        int expected = 0;
        int actual = radio.getNumberOfRadioStations();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeWhen9() {
        radio.setRadioVolume(9);
        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeWhen10() {
        int volumeLevel = 10;
        radio.setRadioVolume(volumeLevel);
        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeWhen1() {
        int volumeLevel = 1;
        radio.setRadioVolume(volumeLevel);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeWhen0() {
        int volumeLevel = 0;
        radio.setRadioVolume(volumeLevel);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVoulumeWrongBelow() {
        int volumeLevel = -1;
        radio.setRadioVolume(volumeLevel);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVoulumeWrongAbove() {
        int volumeLevel = 11;
        radio.setRadioVolume(volumeLevel);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}
