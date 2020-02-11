package com.practice.fuzzysearch.model.fuzzy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FuzzySearch {

    public static int getScoreFromTwoWords(String word1, String word2){

        int score = 0;

        List<Integer> results = new ArrayList<>();

        String word1AfterPrepare = WordPreparation.prepare(word1);
        String word2AfterPrepare = WordPreparation.prepare(word2);

        for(String partOfWord1 : word1AfterPrepare.split(" ")){
            for(String partOfWord2 : word2AfterPrepare.split(" ")){
                 results.add(Ratio.apply(partOfWord1, partOfWord2));
            }
            int maxResult = Collections.max(results);
            score += maxResult;
            results.clear();
        }

        return score;
    }

}
