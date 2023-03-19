package ru.netology.oop;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Radio {
  private int numberOfCurrentRadioStation;
  private int currentVolume;
  int quantityOfRadioStations;
  int minVolume = 0;
  int maxVolume = 100;


  // Radio control
  public Radio(int quantityOfRadioStations) {
    if (quantityOfRadioStations > 0) {
      this.quantityOfRadioStations = quantityOfRadioStations;
    } else {
      this.quantityOfRadioStations = 10;
    }
  }

  public Radio() {
    this.quantityOfRadioStations = 10;
  }

  public void setNumberOfCurrentRadioStation(int numberOfCurrentRadioStation) {
    if (numberOfCurrentRadioStation >= 0) {
      if (numberOfCurrentRadioStation <= quantityOfRadioStations - 1) {
        this.numberOfCurrentRadioStation = numberOfCurrentRadioStation;
      } else {
        this.numberOfCurrentRadioStation = 0;
      }
    }
  }

  public void setQuantityOfRadioStations(int quantityOfRadioStations) {
    if (quantityOfRadioStations > 0) {
      this.quantityOfRadioStations = quantityOfRadioStations;
    } else {
      this.quantityOfRadioStations = 10;
    }
  }


  //Radio control
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

  // Volume control
  public void setMinVolume(int minVolume) {
    if (minVolume > 0) {
      this.minVolume = minVolume;
    } else {
      this.maxVolume = 0;
    }
  }

  public void setMaxVolume(int maxVolume) {
    if (maxVolume > 0) {
      this.maxVolume = maxVolume;
    } else {
      this.maxVolume = 100;
    }
  }

  public void increaseVolume() {
    if (currentVolume < 100) {
      currentVolume++;
    }
  }

  public void decreaseVolume() {
    if (currentVolume > 0) {
      currentVolume--;
    } else {
      this.currentVolume = 0;
    }
  }

  public void setCurrentVolume(int currentVolume) {
    if (currentVolume >= 0) {
      if (currentVolume <= 100) {
        this.currentVolume = currentVolume;
      } else {
        this.currentVolume = maxVolume;
      }
    } else {
      this.currentVolume = minVolume;
    }
  }
}