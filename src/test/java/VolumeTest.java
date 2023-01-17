import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VolumeTest {

    @Test
    public void volume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(3);

        int expected = 3;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVol() {
        Radio radio = new Radio();
        radio.setCurrentVolume(7);

        radio.nextVolume();

        int expected = 8;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volume1() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volume2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volume3() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volume4() {
        Radio radio = new Radio();

        radio.setCurrentVolume(9);

        int expected = 9;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volume5() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volume6() {
        Radio radio = new Radio();

        radio.setCurrentVolume(11);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void volume7() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-16);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volume8() {
        Radio radio = new Radio();

        radio.setCurrentVolume(18);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextVol1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);

        radio.nextVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextVol2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        radio.nextVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextVol3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.nextVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevVol1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.prevVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevVol2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.prevVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevVol3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        radio.prevVolume();

        int expected = 9;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
