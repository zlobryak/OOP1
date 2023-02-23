package ru.netology.oop;

public class Radio {
    private int radioStationNumber;
    private int currentVolume;

    public void setRadioStationNumber(int newStationNumber){
        if (newStationNumber >= 0)
            if (newStationNumber <= 9) radioStationNumber = newStationNumber;
        else radioStationNumber = 0;
    }
    public void next(){
        if (radioStationNumber < 9) {
            radioStationNumber++;
        }
        else {
            radioStationNumber = 0;
        }
    }

    public void prev(){
        if (radioStationNumber > 0) {
            radioStationNumber--;

        }
        else  {
            radioStationNumber = 9;
        }

    }
    public int getRadioStationNumber(){

        return radioStationNumber;
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
    public void setRadioVolume(int newRadioVolume){
        currentVolume = newRadioVolume;
    }
    public  int getRadioVolume(){
        return currentVolume;
    }
}

