package ru.netology.oop;

public class Radio {
    private int quantityOfRadioStations = 10;
    private int numberOfRadioStations;
    private int currentVolume = 5;

    public int getQuantityOfRadioStations() {
        return quantityOfRadioStations;
    }

    public void setQuantityOfRadioStations(int quantityOfRadioStations) {
        if (quantityOfRadioStations > 0) {
            this.quantityOfRadioStations = quantityOfRadioStations;
        }
        else {
            this.quantityOfRadioStations = 10;
        }
    }

    public void setNumberOfRadioStations(int newStationNumber){
        if (newStationNumber >= 0)
            if (newStationNumber <= quantityOfRadioStations - 1) numberOfRadioStations = newStationNumber;
        else numberOfRadioStations = 0;
    }
    public void next(){
        if (numberOfRadioStations < quantityOfRadioStations - 1) {
            numberOfRadioStations++;
        }
        else {
            numberOfRadioStations = 0;
        }
    }

    public void prev(){
        if (numberOfRadioStations > 0) {
            numberOfRadioStations--;

        }
        else  {
            numberOfRadioStations = quantityOfRadioStations - 1;
        }

    }
    public int getNumberOfRadioStations(){

        return numberOfRadioStations;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume ++;
        }
    }
    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume --;
        }
    }
    public void setRadioVolume(int newRadioVolume){ // Used only for tests.

        if (newRadioVolume >= 0) {
            if (newRadioVolume <= 10){
                currentVolume = newRadioVolume;
            } else currentVolume = 0;
        } else currentVolume = 0;

    }
    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }
}

