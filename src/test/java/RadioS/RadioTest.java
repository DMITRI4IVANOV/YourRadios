package RadioS;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
//    Около граничного значения ( для кнопки Next)
    void sholdFrontoftheBorder1NextForStation() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(8);
        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
//    Около граничного значения ( для кнопки Next)
    void sholdFrontoftheBorder2NextForStation() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(1);
        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }

    @Test
//    Граничное значение ( для кнопки Next)
    void sholdBoundary1NextForStation() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(9);
        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
//    Граничное значение ( для кнопки Next)
    void sholdBoundary2NextForStation() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(0);
        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
//    Граничное значение ( для кнопки Prev)
    void sholdBoundary1PrevForStation() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(0);
        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
//    Граничное значение ( для кнопки Prev)
    void sholdBoundary2PrevForStation() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(9);
        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
//    Около граничного значения ( для кнопки Prev)
    void sholdFrontoftheBorder1PrevForStation() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(8);
        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 7;

        Assertions.assertEquals(expected, actual);
    }

    @Test
//    Около граничного значения ( для кнопки Prev)
    void sholdFrontoftheBorder2PrevForStation() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(1);
        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
    @Test
//    Около граничного значения ( для кнопки Prev)
    void sholdFrontoftheBorder3PrevForStation() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(11);
        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }
    @Test
//    Граничное значение для звука ( кнопка increaseVolume "+")
    void sholdBoundary1IncreaseVolumeForVolume() {
        Radio radio = new Radio(10);
        radio.setCurrentVolume(0);
        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
//    Граничное значение для звука ( кнопка increaseVolume "+")
    void sholdBoundary2IncreaseVolumeForVolume() {
        Radio radio = new Radio(10);
        radio.setCurrentVolume(100);
        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 100;

        Assertions.assertEquals(expected, actual);
    }

    @Test
//    Граничное значение для звука ( кнопка decreaseVolume "-")
    void sholdBoundary1DecreaseVolumeForVolume() {
        Radio radio = new Radio(10);
        radio.setCurrentVolume(100);
        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 99;

        Assertions.assertEquals(expected, actual);
    }

    @Test
//    Граничное значение для звука ( кнопка decreaseVolume "-")
    void sholdBoundary2DecreaseVolumeForVolume() {
        Radio radio = new Radio(10);
        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
//    Около граничного значения для звука ( кнопка increaseVolume "+")
    void sholdFrontoftheBorder1IncreaseVolumeForVolume() {
        Radio radio = new Radio(10);
        radio.setCurrentVolume(99);
        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 100;

        Assertions.assertEquals(expected, actual);
    }

    @Test
//    Около граничного значения для звука ( кнопка increaseVolume "+")
    void sholdFrontoftheBorder2IncreaseVolumeForVolume() {
        Radio radio = new Radio(10);
        radio.setCurrentVolume(0);
        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
//    Около граничного значения для звука ( кнопка decreaseVolume "-")
    void sholdFrontoftheBorder1DecreaseVolumeForVolume() {
        Radio radio = new Radio(10);
        radio.setCurrentVolume(99);
        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 98;

        Assertions.assertEquals(expected, actual);
    }

    @Test
//    Около граничного значения для звука ( кнопка decreaseVolume "-")
    void sholdFrontoftheBorder2DecreaseVolumeForVolume() {
        Radio radio = new Radio(10);
        radio.setCurrentVolume(1);
        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
    @Test
//    Около граничного значения для звука ( кнопка decreaseVolume "-")
    void sholdFrontoftheBorder3DecreaseVolumeForVolume() {
        Radio radio = new Radio(10);
        radio.setCurrentVolume(101);
        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
}