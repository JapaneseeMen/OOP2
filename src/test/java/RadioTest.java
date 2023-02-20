import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.radio.Radio;

public class RadioTest {
    @Test

    public void shouldSetCurrentVolume() {

        Radio maf = new Radio();

        maf.setCurrentVolume(5);

        int expected = 5;
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

        maf.setCurrentVolume(11);

        int expected = 0;
        int actual = maf.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseVolume() {

        Radio maf = new Radio();

        maf.setCurrentVolume(9);
        maf.increaseVolume();

        int expected = 10;
        int actual = maf.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseWhenVolumeMax() {

        Radio maf = new Radio();

        maf.setCurrentVolume(10);
        maf.increaseVolume();

        int expected = 10;
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

        maf.setCurrentVolume(10);
        maf.reduceVolume();

        int expected = 9;
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
