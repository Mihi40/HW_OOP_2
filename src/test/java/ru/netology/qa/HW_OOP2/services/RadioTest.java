package ru.netology.qa.HW_OOP2.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetRadioStationNumber() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(7);

        int expected = 7;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationNumberUnderZero() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationNumberZero() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(7);
        radio.setCurrentRadioStationNumber(0);

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationNumberOne() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(1);

        int expected = 1;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationNumberMoreThanNine() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationNumberNine() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(9);

        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationNumberEight() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(8);

        int expected = 8;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchNextStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(5);
        radio.nextStation();

        int expected = 6;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchNextStationMin() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(0);
        radio.nextStation();

        int expected = 1;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchNextStationMaх() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(9);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchPrevStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(7);
        radio.prevStation();

        int expected = 6;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchPrevStationMin() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(0);
        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchPrevStationMaх() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(9);
        radio.prevStation();

        int expected = 8;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeNext() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(50);
        radio.increaseVolume();

        int expected = 51;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeMaх() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeUnderZero() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(-1);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeZero() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeToZero() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(1);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeUnderHundred() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(101);

        int expected = 0;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeHundred() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void increaseVolumeToHundred() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(99);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
}



