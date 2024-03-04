
package ru.netology.homework;

public class Radio {
    private int maxStationNumber = 9;
    private int minStationNumber = 0;
    private int stationNumber = minStationNumber;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int volume = minVolume;

    public int getStationNumber() {

        return stationNumber;
    }

    public int getMaxStationNumber() {

        return maxStationNumber;
    }

    public int getMinStationNumber() {
        return minStationNumber;
    }

    public Radio(int size) {
        this.maxStationNumber = minStationNumber + size - 1;
    }

    public Radio() {
    }

    public void setStationNumber(int newStationNumber) {
        if ((newStationNumber <= 9) && (newStationNumber >= 0)) {
            stationNumber = newStationNumber;
        }
    }

    public void nextStationNumber() {
        if (stationNumber >= maxStationNumber) {
            stationNumber = 0;
        } else {
            stationNumber++;
        }
    }

    public void prevStationNumber() {
        if (stationNumber <= minStationNumber) {
            stationNumber = 9;
        } else {
            stationNumber--;
        }
    }

    public int getVolume() {

        return volume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setVolume(int newVolume) {
        if (newVolume <= 100 && newVolume >= 0) {
            volume = newVolume;
        }
    }

    public void setLouderVolume() {
        if (volume < maxVolume) {
            volume++;
        }
    }

    public void setQuietVolume() {
        if (volume > minVolume) {
            volume--;
        }
    }
}