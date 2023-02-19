package ru.radio;

public class Radio {

    private int currentVolume;
    private int currentWave;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentWave(){
        return currentWave;
    }


    public void setCurrentVolume(int volume) {

        if (volume < 0) {
            return;
        }
        if (volume > 10) {
            return;
        }
        this.currentVolume = volume;
    }

    public void setCurrentWave(int wave) {
        if (wave < 0) {
            return;
        }
        if (wave > 9) {
            return;
        }
        this.currentWave = wave;
    }
    public void nextWave(){
        if (currentWave == 9){
            this.currentWave = 0;
            return;
        }
        else{
            this.currentWave = currentWave + 1;
        }
        return;
    }
    public void prevWave(){
        if (currentWave == 0){
            this.currentWave = 9;
            return;
        }
        else{
            this.currentWave = currentWave - 1;
        }
        return;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            this.currentVolume = currentVolume + 1;
            return;
        }

    }

    public void reduceVolume() {

        if (currentVolume > 0) {
            this.currentVolume = currentVolume - 1;
            return;
        }
    }
}