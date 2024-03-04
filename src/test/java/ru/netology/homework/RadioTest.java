package ru.netology.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldSetStationNumberOnMinBorder() {

        radio.setStationNumber(0);

        int expected = 0;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationNumberUnderMax() {

        radio.setStationNumber(10);

        int expected = 0;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationNumberUnderMin() {

        radio.setStationNumber(-1);

        int expected = 0;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeOnNextStationNumberOnMaxBorder() {

        radio.setStationNumber(9);
        radio.nextStationNumber();

        int expected = 0;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeOnNextStationNumber() {

        radio.setStationNumber(8);
        radio.nextStationNumber();

        int expected = 9;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeOnPrevStationNumberOnMinBorder() {

        radio.setStationNumber(0);
        radio.prevStationNumber();

        int expected = 9;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeOnPrevStationNumberBeforeMinBorder() {

        radio.setStationNumber(1);
        radio.prevStationNumber();

        int expected = 0;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeOnMaxBorder() {

        radio.setVolume(100);

        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAfterMaxBorder() {

        radio.setVolume(101);

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAfterMinBorder() {

        radio.setVolume(-1);

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldLouderVolumeOnMinBorder() {

        radio.setVolume(0);
        radio.setLouderVolume();

        int expected = 1;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldLouderVolumeOnMaxBorder() {

        radio.setVolume(100);
        radio.setLouderVolume();

        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldQuietVolumeBeforeMinBorder() {

        radio.setVolume(1);
        radio.setQuietVolume();

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldQuietVolumeOnMinBorder() {

        radio.setVolume(0);
        radio.setQuietVolume();

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSizeStationNumber() {
        Radio radio = new Radio(30);

        Assertions.assertEquals(0, radio.getMinStationNumber());
        Assertions.assertEquals(29, radio.getMaxStationNumber());
        Assertions.assertEquals(0, radio.getStationNumber());
    }
}
