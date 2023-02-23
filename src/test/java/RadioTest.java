import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.radio.Radio;

public class RadioTest {

    @Test

    public void shouldSetQuantityRadioWaves() {

        Radio maf = new Radio(20);

        int actual = maf.getCurrentWave();

        Assertions.assertEquals(0, actual);
    }

    @Test

    public void shouldSetCurrentWaveWithUserQuantityWaves() {
        Radio maf = new Radio(20);
        maf.setCurrentWave(18);
        int actual = maf.getCurrentWave();
        Assertions.assertEquals(18, actual);
    }

    @Test

    public void nextWaveWithUserQuantityWaves() {
        Radio maf = new Radio(20);
        maf.setCurrentWave(19);
        maf.nextWave();
        int actual = maf.getCurrentWave();
        Assertions.assertEquals(0, actual);
    }

    @Test

    public void prevWaveWithUserQuantityWaves() {
        Radio maf = new Radio(20);
        maf.prevWave();
        int actual = maf.getCurrentWave();
        Assertions.assertEquals(19, actual);
    }

    @Test

    public void shouldSetCurrentVolume() {

        Radio maf = new Radio();

        maf.setCurrentVolume(45);

        int expected = 45;
        int actual = maf.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldSetLessCurrentVolume() {

        Radio maf = new Radio();

        maf.setCurrentVolume(-3);

        int expected = 0;
        int actual = maf.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldSetHigherCurrentVolume() {

        Radio maf = new Radio();

        maf.setCurrentVolume(101);

        int expected = 0;
        int actual = maf.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseVolume() {

        Radio maf = new Radio();

        maf.setCurrentVolume(99);
        maf.increaseVolume();

        int expected = 100;
        int actual = maf.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseWhenVolumeMax() {

        Radio maf = new Radio();

        maf.setCurrentVolume(100);
        maf.increaseVolume();

        int expected = 100;
        int actual = maf.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseWhenVolumeMin() {

        Radio maf = new Radio();

        maf.setCurrentVolume(0);
        maf.increaseVolume();

        int expected = 1;
        int actual = maf.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolume() {

        Radio maf = new Radio();

        maf.setCurrentVolume(100);
        maf.reduceVolume();

        int expected = 99;
        int actual = maf.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceWhenVolumeMin() {

        Radio maf = new Radio();

        maf.setCurrentVolume(0);
        maf.reduceVolume();

        int expected = 0;
        int actual = maf.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentWave() {

        Radio maf = new Radio();

        maf.setCurrentWave(5);

        int expected = 5;
        int actual = maf.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetLessCurrentWave() {

        Radio maf = new Radio();

        maf.setCurrentWave(-3);

        int expected = 0;
        int actual = maf.getCurrentWave();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldSetHigherCurrentWave() {

        Radio maf = new Radio();

        maf.setCurrentWave(11);

        int expected = 0;
        int actual = maf.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseWave() {

        Radio maf = new Radio();

        maf.setCurrentWave(8);
        maf.nextWave();

        int expected = 9;
        int actual = maf.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseWhenWaveMax() {

        Radio maf = new Radio();

        maf.setCurrentWave(9);
        maf.nextWave();

        int expected = 0;
        int actual = maf.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceWave() {

        Radio maf = new Radio();

        maf.setCurrentWave(9);
        maf.prevWave();

        int expected = 8;
        int actual = maf.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceWhenWaveMin() {

        Radio maf = new Radio();

        maf.setCurrentWave(0);
        maf.prevWave();

        int expected = 9;
        int actual = maf.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }
}
