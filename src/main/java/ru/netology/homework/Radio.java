
package ru.netology.homework;

public class Radio {
    public int stationNumber;
    public int volume;

    public int getStationNumber() {
        return stationNumber;
    }

    public void setStationNumber(int newStationNumber) {
        if ((newStationNumber <= 9)&&(newStationNumber >= 0)) {
            stationNumber = newStationNumber;
        } else if (newStationNumber > 9) {
            return;
        } else if (newStationNumber < 0) {
            newStationNumber = 9;
        }
    }

    public void nextStationNumber() {
        if (stationNumber >= 9) {
            stationNumber = 0;
        } else {
            stationNumber++;
        }
    }

    public void prevStationNumber() {
        if (stationNumber <= 0) {
            stationNumber = 9;
        } else {
            stationNumber--;
        }
    }

    public int getVolume () {
        return volume;
    }

    public void setVolume(int newVolume) {
        if ((newVolume <= 100)&&(newVolume >= 0)) {
            this.volume = newVolume;
        } else if (newVolume >= 100) {
            newVolume = 100;
        } else if (newVolume <= 0) {
            return;
        }
        volume = newVolume;
    }

    public void setLouderVolume() {
        if (volume < 100) {
            volume ++;
        }
    }

    public void setQuietVolume() {
        if (volume > 0) {
            volume--;
        }
    }
}