package ru.radio;

public class Radio {


    private int firstRadioWave = 0;
    private int lastRadioWave = 9;
    private int currentWave = firstRadioWave;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume = minVolume;

    public Radio() {
        this.firstRadioWave = firstRadioWave;
        this.lastRadioWave = lastRadioWave;
        this.currentWave = firstRadioWave;
    }

    public Radio(int quantityRadioWaves) {
        lastRadioWave = firstRadioWave + quantityRadioWaves - 1;
    }

    public int getCurrentVolume() {

        return currentVolume;
    }


    public int getCurrentWave() {
        return currentWave;

    }


    public void setCurrentVolume(int volume) {

        if (volume < minVolume) {
            return;
        }
        if (volume > maxVolume) {
            return;
        }
        this.currentVolume = volume;
    }

    public void setCurrentWave(int wave) {
        if (wave < firstRadioWave) {
            return;
        }
        if (wave > lastRadioWave) {
            return;
        }
        this.currentWave = wave;
    }

    public void nextWave() {
        if (currentWave == lastRadioWave) {
            this.currentWave = firstRadioWave;
            return;
        } else {
            this.currentWave = currentWave + 1;
        }
        return;
    }

    public void prevWave() {
        if (currentWave == firstRadioWave) {
            this.currentWave = lastRadioWave;
            return;
        } else {
            this.currentWave = currentWave - 1;
        }
        return;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            this.currentVolume = currentVolume + 1;
            return;
        }

    }

    public void reduceVolume() {

        if (currentVolume > minVolume) {
            this.currentVolume = currentVolume - 1;
            return;
        }
    }
}