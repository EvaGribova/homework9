package ru.netology.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetStationNumberOnMinBorder() {
        Radio radio = new Radio();

        radio.setStationNumber(0);

        int expected = 0;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationNumberUnderMax() {
        Radio radio = new Radio();

        radio.setStationNumber(10);

        int expected = 0;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationNumberUnderMin() {
        Radio radio = new Radio();

        radio.setStationNumber(-1);

        int expected = 0;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeOnNextStationNumberOnMaxBorder() {
        Radio radio = new Radio();

        radio.setStationNumber(9);
        radio.nextStationNumber();

        int expected = 0;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeOnNextStationNumber() {
        Radio radio = new Radio();

        radio.setStationNumber(8);
        radio.nextStationNumber();

        int expected = 9;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeOnPrevStationNumberOnMinBorder() {
        Radio radio = new Radio();

        radio.setStationNumber(0);
        radio.prevStationNumber();

        int expected = 9;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeOnPrevStationNumberBeforeMinBorder() {
        Radio radio = new Radio();

        radio.setStationNumber(1);
        radio.prevStationNumber();

        int expected = 0;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeOnMaxBorder() {
        Radio radio = new Radio();

        radio.setVolume(100);

        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAfterMaxBorder() {
        Radio radio = new Radio();

        radio.setVolume(101);

        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAfterMinBorder() {
        Radio radio = new Radio();

        radio.setVolume(-1);

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldLouderVolumeOnMinBorder() {
        Radio radio = new Radio();

        radio.setVolume(0);
        radio.setLouderVolume();

        int expected = 1;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldLouderVolumeOnMaxBorder() {
        Radio radio = new Radio();

        radio.setVolume(100);
        radio.setLouderVolume();

        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldQuietVolumeBeforeMinBorder() {
        Radio radio = new Radio();

        radio.setVolume(1);
        radio.setQuietVolume();

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldQuietVolumeOnMinBorder() {
        Radio radio = new Radio();

        radio.setVolume(0);
        radio.setQuietVolume();

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }
}
