package ru.netology.oop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {
    Radio radio = new Radio(30);

    @Test
    void constructorRadioTest() {
        Radio radio = new Radio();
        Assertions.assertEquals(10, radio.getQuantityOfRadioStations());
    }

    @Test
    void getQuantityOfRadioStationsTest() {
        Assertions.assertEquals(30, radio.getQuantityOfRadioStations());
    }

    @Test
    void getQuantityOfRadioStationsTestBelowZero() {
        Radio radio = new Radio(-1);
        Assertions.assertEquals(10, radio.getQuantityOfRadioStations());

    }

    @Test
    public void setRadioStationNumberAbove() {
        radio.setNumberOfCurrentRadioStation(30);
        Assertions.assertEquals(0, radio.getNumberOfCurrentRadioStation());
    }

    @Test
    public void setRadioStationNumberBelow0() {
        radio.setNumberOfCurrentRadioStation(-1);
        Assertions.assertEquals(0, radio.getNumberOfCurrentRadioStation());
    }

    @Test
    public void setRadioZero() {
        int stationNumber = 0;
        radio.setNumberOfCurrentRadioStation(stationNumber);
        Assertions.assertEquals(0, radio.getNumberOfCurrentRadioStation());
    }

    @Test
    public void setRadioMax() {
        radio.setNumberOfCurrentRadioStation(29);
        Assertions.assertEquals(radio.getQuantityOfRadioStations() - 1, radio.getNumberOfCurrentRadioStation());
    }

    @Test
    public void nextStationWhenMax() {
        radio.setNumberOfCurrentRadioStation(radio.getQuantityOfRadioStations() - 1);
        radio.next();
        Assertions.assertEquals(0, radio.getNumberOfCurrentRadioStation());
    }

    @Test
    public void nextStationWhenTestMiidle() {
        radio.setNumberOfCurrentRadioStation(radio.getQuantityOfRadioStations() - 2);
        radio.next();
        Assertions.assertEquals(radio.getQuantityOfRadioStations() - 1, radio.getNumberOfCurrentRadioStation());
    }

    @Test
    public void prevStationWhen0() {
        radio.setNumberOfCurrentRadioStation(0);
        radio.prev();
        Assertions.assertEquals(radio.getQuantityOfRadioStations() - 1, radio.getNumberOfCurrentRadioStation());
    }

    @Test
    public void prevStationWhenTestMiddle() {
        radio.setNumberOfCurrentRadioStation(1);
        radio.prev();
        Assertions.assertEquals(0, radio.getNumberOfCurrentRadioStation());
    }

    @Test
    public void increaseVolumeWhenMiddle() {
        radio.setCurrentVolume(99);
        radio.increaseVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void increaseVolumeWhenMax() {
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void decreaseVolumeWhen1() {
        radio.setCurrentVolume(1);
        radio.decreaseVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void decreaseVolumeWhen0() {
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeWrongBelow() {
        radio.setCurrentVolume(-1);
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void setVolumeWrongAbove() {
        radio.setCurrentVolume(101);
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeTestBelow() {
        radio.setCurrentVolume(-1);
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void setMinVolume0() {
        radio.setMinVolume(0);
        Assertions.assertEquals(0, radio.getMinVolume());
    }

    @Test
    void setMinVolumeAbove() {
        radio.setMinVolume(1);
        Assertions.assertEquals(1, radio.getMinVolume());
    }

    @Test
    void setMinVolumeBelow() {
        radio.setMinVolume(-1);
        Assertions.assertEquals(0, radio.getMinVolume());
    }

    @Test
    void setMaxVolumeAbove() {
        radio.setMaxVolume(101);
        Assertions.assertEquals(101, radio.getMaxVolume());
    }

    @Test
    void setMaxVolumeBelow() {
        radio.setMaxVolume(-1);
        Assertions.assertEquals(100, radio.getMaxVolume());
    }

    @Test
    void setQuantityOfRadioStationsBelow() {
        radio.setQuantityOfRadioStations(-1);
        Assertions.assertEquals(10, radio.getQuantityOfRadioStations());
    }

    @Test
    void setQuantityOfRadioStationsAbove() {
        radio.setQuantityOfRadioStations(11);
        Assertions.assertEquals(11, radio.getQuantityOfRadioStations());
    }
}
