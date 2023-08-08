package ru.netology.qa.HW_OOP2.services;

public class Radio {
    private int currentRadioStationNumber;
    private int currentSoundVolume;
    private int maxRadioStation;

    public Radio() {
        maxRadioStation = 9;
    }

    public Radio(int QuantityRadioStation) {
        maxRadioStation = QuantityRadioStation - 1;
    }

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void setCurrentRadioStationNumber(int currentRadioStationNumber) {
        if (currentRadioStationNumber < 0) {
            return;
        }
        if (currentRadioStationNumber > maxRadioStation) {
            return;
        }
        this.currentRadioStationNumber = currentRadioStationNumber;
    }

    public void nextStation() {
        if (currentRadioStationNumber != maxRadioStation) {
            currentRadioStationNumber++;
            return;
        } else {
            currentRadioStationNumber = 0;
        }
    }

    public void prevStation() {
        if (currentRadioStationNumber != 0) {
            currentRadioStationNumber--;
            return;
        } else {
            currentRadioStationNumber = maxRadioStation;
        }
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void setCurrentSoundVolume(int currentSoundVolume) {
        if (currentSoundVolume < 0) {
            return;
        }
        if (currentSoundVolume > 100) {
            return;
        }
        this.currentSoundVolume = currentSoundVolume;
    }

    public void increaseVolume() {
        if (currentSoundVolume < 100) {
            currentSoundVolume = currentSoundVolume + 1;
            return;
        } else {
            currentSoundVolume = 100;
        }
    }

    public void decreaseVolume() {
        if (currentSoundVolume > 0) {
            currentSoundVolume = currentSoundVolume - 1;
            return;
        } else {
            currentSoundVolume = 0;
        }
    }
}