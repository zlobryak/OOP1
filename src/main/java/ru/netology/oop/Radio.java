package ru.netology.oop;

public class Radio {

    private int numberOfCurrentRadioStation = 0;
    private int currentVolume = 5;
    int quantityOfRadioStations;
    int minVolume = 0;
    int maxVolume = 100;

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
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        } else this.currentVolume = 0;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newVolume) {
        if (newVolume >= 0) {
            if (newVolume <= 100) {
                currentVolume = newVolume;
            } else currentVolume = maxVolume;
        } else {
            currentVolume = minVolume;
        }
    }
}


