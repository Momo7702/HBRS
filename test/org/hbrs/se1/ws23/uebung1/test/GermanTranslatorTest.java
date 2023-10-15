package org.hbrs.se1.ws23.uebung1.test;

import org.hbrs.se1.ws23.uebung1.control.GermanTranslator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GermanTranslatorTest {

    @Test
    void aPositiveTest() {
        GermanTranslator translator = new GermanTranslator();
        String value = translator.translateNumber(1);
        assertEquals(value, "eins");
    } //Aequivalenzklasse: 1 <= Number <= 10  (Die untere Grenze)
    @Test
    void bPositiveTest() {
        GermanTranslator translator = new GermanTranslator();
        String value = translator.translateNumber(5);
        assertEquals(value, "fuenf");
    } //Aequivalenzklasse: 1 <= Number <= 10  (Innerhalb des Intervalls)
    @Test
    void cPositiveTest() {
        GermanTranslator translator = new GermanTranslator();
        String value = translator.translateNumber(10);
        assertEquals(value, "zehn");
    } //Aequivalenzklasse: 1 <= Number <= 10  (Die obere Grenze)
    @Test
    void aNegativeTest() {
        GermanTranslator translator = new GermanTranslator();
        assertThrows(IllegalArgumentException.class,()->
        {translator.translateNumber(0);});
    } //Aequivalenzklasse: Number < 1  (Exception: Nächste Zahl nach untere Grenze)
    @Test
    void bNegativeTest() {
        GermanTranslator translator = new GermanTranslator();
        assertThrows(IllegalArgumentException.class,()->
        {translator.translateNumber(11);});
    } //Aequivalenzklasse: Number > 10  (Exception: Nächste Zahl nach obere Grenze)
    @Test
    void cNegativeTest() {
        GermanTranslator translator = new GermanTranslator();
        assertThrows(IllegalArgumentException.class,()->
        {translator.translateNumber(-3);});
    } //Aequivalenzklasse: Number < 1  (Exception: Negative Zahl)
    @Test
    void dNegativeTest() {
        GermanTranslator translator = new GermanTranslator();
        assertThrows(IllegalArgumentException.class,()->
        {translator.translateNumber(1012345);});
    } //Aequivalenzklasse: Number > 10  (Exception: Grosse Zahl)
}