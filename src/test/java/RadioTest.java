import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class RadioTest {

    @Test
    public void test() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);



        int expected = 5;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testLeft() {
        Radio radio = new Radio();

        radio.setCurrentStation(-5);



        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void testRight() {
        Radio radio = new Radio();

        radio.setCurrentStation(15);



        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testGranicaLeft() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);



        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void testNull() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);



        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void testEight() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);



        int expected =8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void testNine() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);



        int expected =9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void testTen() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);



        int expected =0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void testNext() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        radio.next();

        int expected =0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testNext2() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);

        radio.next();

        int expected =9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }
}