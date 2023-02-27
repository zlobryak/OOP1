package ru.netology.oop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void setRadioStationNumberAbove9() {
        radio.setNumberOfCurrentRadioStation(10);
        int expected = 0;
        int actual = radio.getNumberOfCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setRadioStationNumberBelow0() {
        radio.setNumberOfCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.getNumberOfCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setRadioZero() {
        int stationNumber = 0;
        radio.setNumberOfCurrentRadioStation(stationNumber);

        int expected = 0;
        int actual = radio.getNumberOfCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setRadioNine() {
        int stationNumber = 9;
        radio.setNumberOfCurrentRadioStation(stationNumber);

        int expected = 9;
        int actual = radio.getNumberOfCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationWhen9() {
        int stationNumber = 9;
        radio.setNumberOfCurrentRadioStation(stationNumber);
        radio.next();

        int expected = 0;
        int actual = radio.getNumberOfCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationWhen8() {
        int stationNumber = 8;
        radio.setNumberOfCurrentRadioStation(stationNumber);
        radio.next();

        int expected = 9;
        int actual = radio.getNumberOfCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationWhen0() {
        int stationNumber = 0;
        radio.setNumberOfCurrentRadioStation(stationNumber);
        radio.prev();

        int expected = 9;
        int actual = radio.getNumberOfCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationWhen1() {
        int stationNumber = 1;
        radio.setNumberOfCurrentRadioStation(stationNumber);
        radio.prev();

        int expected = 0;
        int actual = radio.getNumberOfCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeWhen9() {
        radio.setCurrentVolume(9);
        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeWhen10() {
        int volumeLevel = 10;
        radio.setCurrentVolume(volumeLevel);
        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeWhen1() {
        int volumeLevel = 1;
        radio.setCurrentVolume(volumeLevel);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeWhen0() {
        int volumeLevel = 0;
        radio.setCurrentVolume(volumeLevel);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolumeWrongBelow() {
        int volumeLevel = -1;
        radio.setCurrentVolume(volumeLevel);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeWrongAbove() {
        int volumeLevel = 101;
        radio.setCurrentVolume(volumeLevel);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolumeTestBelow() {
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
