package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void setNextRadioStationUnderMaxStationByDefault() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(8);

        Assertions.assertEquals(9, radio.nextRadioStation());
    }

    @Test
    public void setNextRadioStationMaxStationByDefault() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);

        Assertions.assertEquals(0, radio.nextRadioStation());
    }

    @Test
    public void setNextRadioStationAboveMaxStationByDefault() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);

        Assertions.assertEquals(1, radio.nextRadioStation());
    }

    @Test
    public void setPrevRadioStationAboveMinStationByDefault() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(1);

        Assertions.assertEquals(0, radio.prevRadioStation());
    }

    @Test
    public void setPrevRadioStationOnMinStationByDefault() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);

        Assertions.assertEquals(9, radio.prevRadioStation());
    }

    @Test
    public void setPrevRadioStationUnderMinStationByDefault() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);

        Assertions.assertEquals(8, radio.prevRadioStation());
    }

    @Test
    public void shouldNotSetCurrentRadioStationBelowMinStationByDefault() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-1);

        Assertions.assertEquals(0, radio.getMinRadioStation());
    }

    @Test
    public void shouldSetCurrentRadioStationOnMinStationByDefault() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);

        Assertions.assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetCurrentRadioStationAboveMinStationByDefault() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(1);

        Assertions.assertEquals(1, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetCurrentRadioStationBelowMaxStationByDefault() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(8);

        Assertions.assertEquals(8, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetCurrentRadioStationOnMaxStationByDefault() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);

        Assertions.assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldNotSetCurrentRadioStationAboveMaxStationByDefault() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(10);

        Assertions.assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetCurrentRadioStationOnMinStation0() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);

        Assertions.assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetCurrentRadioStationAboveMinStation0() {
        Radio radio = new Radio(30);

        radio.setCurrentRadioStation(1);

        Assertions.assertEquals(1, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetCurrentRadioStationBelowMaxStation29() {
        Radio radio = new Radio(30);

        radio.setCurrentRadioStation(28);

        Assertions.assertEquals(28, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetCurrentRadioStationOnMaxStation29() {
        Radio radio = new Radio(30);

        radio.setCurrentRadioStation(29);

        Assertions.assertEquals(29, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldNotSetCurrentRadioStationAboveMaxStation29() {
        Radio radio = new Radio(30);

        radio.setCurrentRadioStation(30);

        Assertions.assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void setNextRadioStationUnderMaxStation29() {
        Radio radio = new Radio(30);

        Assertions.assertEquals(29, radio.getMaxRadioStation());

        radio.setCurrentRadioStation(28);

        Assertions.assertEquals(29, radio.nextRadioStation());
    }

    @Test
    public void setNextRadioStationOnMaxStation29() {
        Radio radio = new Radio(30);

        radio.setCurrentRadioStation(29);

        Assertions.assertEquals(0, radio.nextRadioStation());
    }

    @Test
    public void setNextRadioStationAboveMaxStation29() {
        Radio radio = new Radio(30);

        radio.setCurrentRadioStation(0);

        Assertions.assertEquals(1, radio.nextRadioStation());
    }

    @Test
    public void setPrevRadioStationAboveMinStation0() {
        Radio radio = new Radio(30);

        radio.setCurrentRadioStation(1);

        Assertions.assertEquals(0, radio.prevRadioStation());
    }

    @Test
    public void setPrevRadioStationOnMinStation0() {
        Radio radio = new Radio(30);

        radio.setCurrentRadioStation(0);

        Assertions.assertEquals(29, radio.prevRadioStation());
    }

    @Test
    public void setPrevRadioStationUnderMinStation0() {
        Radio radio = new Radio(30);

        radio.setCurrentRadioStation(29);

        Assertions.assertEquals(28, radio.prevRadioStation());
    }

    @Test
    public void shouldNotSetCurrentRadioStationBelowMinStation0() {
        Radio radio = new Radio(30);

        radio.setCurrentRadioStation(-1);

        Assertions.assertEquals(0, radio.getMinRadioStation());
    }


    @Test
    public void shouldIncreaseVolumeUnderMaxVolume100() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);

        int expected = 100;
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolumeOnMaxVolume100() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        int expected = 100;
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeAboveMinVolume0() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);

        int expected = 0;
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolumeOnMinVolume0() {
        Radio radio = new Radio();

        int currentVolume = 0;

        int expected = 0;
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
