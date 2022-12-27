package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void setNextRadioStationUnderBorder9() {
        Radio radio = new Radio();

        radio.currentRadioStation = 8;

        int expected = 9;
        int actual = radio.nextRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextRadioStationBorder9() {
        Radio radio = new Radio();

        radio.currentRadioStation = 9;

        int expected = 0;
        int actual = radio.nextRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextRadioStationAboveBorder9() {
        Radio radio = new Radio();

        radio.currentRadioStation = 0;

        int expected = 1;
        int actual = radio.nextRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPrevRadioStationAboveLimit0() {
        Radio radio = new Radio();

        radio.currentRadioStation = 1;

        int expected = 0;
        int actual = radio.prevRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPrevRadioStationOnLimit0() {
        Radio radio = new Radio();

        radio.currentRadioStation = 0;

        int expected = 9;
        int actual = radio.prevRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPrevRadioStationUnderLimit0() {
        Radio radio = new Radio();

        radio.currentRadioStation = 9;

        int expected = 8;
        int actual = radio.prevRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetCurrentRadioStationBelow0() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStationOnLimit0() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStationAboveLimit0() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(1);

        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStationBelowLimit9() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(8);

        int expected = 8;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStationOnLimit9() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetCurrentRadioStationAboveLimit9() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeUnderLimit10() {
        Radio radio = new Radio();

        radio.currentVolume = 9;

        int expected = 10;
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolumeOnLimit10() {
        Radio radio = new Radio();

        radio.currentVolume = 10;

        int expected = 10;
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeAboveLimit0() {
        Radio radio = new Radio();

        radio.currentVolume = 1;

        int expected = 0;
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolumeOnLimit0() {
        Radio radio = new Radio();

        radio.currentVolume = 0;

        int expected = 0;
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
