package com.practice.fuzzysearch.model.fuzzy;

public class WordPreparation {

    public static String prepare(String item){
        item = item.toLowerCase();

        item = replacePLChars(item);

        item = separation(item);

        item = replaceTheSemicolon(item);

        return item;
    }

    public static String replacePLChars(String in){
        in = in.replace("ł","l");
        in = in.replace("ś","s");
        in = in.replace("ć","c");
        in = in.replace("ź","z");
        in = in.replace("ż","z");
        in = in.replace("ą","a");
        in = in.replace("ę","e");
        in = in.replace("ń","n");
        in = in.replace("ó","o");

        return in;
    }

    public static String separation(String in){
        in = in.replace(".", ". ").trim();
        return in;
    }

    public static String replaceTheSemicolon(String in){
        in = in.replace(";", " ").trim();
        return in;
    }
}
