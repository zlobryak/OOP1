package ru.netology.oop;

public class Radio {
    private int radioStationNumber;
    private int currentVolume;

    public void setRadioStationNumber(int newStationNumber){
        radioStationNumber = newStationNumber;

    }
    public void next(){
        if (radioStationNumber < 9) {
            radioStationNumber++;
        }
        else if (radioStationNumber == 9){
            radioStationNumber = 0;
        }
    }

    public void prev(){
        if (radioStationNumber > 0) {
            radioStationNumber--;

        }
        else if (radioStationNumber == 0) {
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

