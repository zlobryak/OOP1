package ru.netology.oop;

public class Radio {
    private int quantityOfRadioStations;
    private int numberOfCurrentRadioStation = 0;
    private int currentVolume = 5;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio(int quantityOfRadioStations) {
        if (quantityOfRadioStations > 0) {
            this.quantityOfRadioStations = quantityOfRadioStations;
        } else this.quantityOfRadioStations = 10;
    }

    public Radio() {
        this.quantityOfRadioStations = 10;
    }

    public int getQuantityOfRadioStations() {
        return quantityOfRadioStations;
    }

    public void setNumberOfCurrentRadioStation(int newStationNumber) {
        if (newStationNumber >= 0)
            if (newStationNumber <= quantityOfRadioStations - 1) numberOfCurrentRadioStation = newStationNumber;
            else numberOfCurrentRadioStation = 0;
    }

    public void next() {
        if (numberOfCurrentRadioStation < quantityOfRadioStations - 1) {
            numberOfCurrentRadioStation++;
        } else {
            numberOfCurrentRadioStation = 0;
        }
    }

    public void prev() {
        if (numberOfCurrentRadioStation > 0) {
            numberOfCurrentRadioStation--;
        } else {
            numberOfCurrentRadioStation = quantityOfRadioStations - 1;
        }
    }

    public int getNumberOfCurrentRadioStation() {

        return numberOfCurrentRadioStation;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

    public void setRadioVolume(int newRadioVolume) { // Used only for tests.

        if (newRadioVolume >= 0) {
            if (newRadioVolume <= 10) {
                currentVolume = newRadioVolume;
            } else currentVolume = 0;
        } else currentVolume = 0;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newVolume) {
        if (getCurrentVolume() >= 0) {
            if (newVolume <= 100) {
                currentVolume = newVolume;
            }
            currentVolume = maxVolume;
        } else {
            currentVolume = minVolume;
        }
    }
}


