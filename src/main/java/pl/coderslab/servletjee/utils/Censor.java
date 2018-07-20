package pl.coderslab.servletjee.utils;

import java.util.Collections;

public class Censor {

    private static final String[] NOT_ALLOWED_WORDS = {"cholera", "kurde", "fuck", "spadaj"};

    public static String doCensor(String text) {

        for (String word : NOT_ALLOWED_WORDS){
            final String stars = String.join("", Collections.nCopies(word.length(), "*"));
            text = text.replaceAll(word, stars);
        }

        return text;
    }
}
