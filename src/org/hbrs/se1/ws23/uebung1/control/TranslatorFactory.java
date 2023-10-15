package org.hbrs.se1.ws23.uebung1.control;

public class TranslatorFactory {
    public static Translator createGermanTranslator(){
        Translator translator = new GermanTranslator();
        return translator;
    }
}
