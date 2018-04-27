import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Kata {

    public static String high(String s) {
        String[] wordFromSentence = s
                .toLowerCase()
                .split(" ");
        String highestScoringWord =null;
        int highestScoring = 0;


        Kata kata = new Kata();
        Map<Character, Integer> alphabet = kata.alphabet();

        for (String word : wordFromSentence) {
            int sum = 0;
            for (char c : word.toCharArray()) {
                sum += alphabet.get(c);
            }
            if (sum>highestScoring){
                highestScoring = sum;
                highestScoringWord = word;
            }
        }

        return highestScoringWord;
    }

    private Map<Character, Integer> alphabet() {
        Map<Character, Integer> alphabet = new HashMap<>();
        alphabet.put('a',1);
        alphabet.put('b',2);
        alphabet.put('c',3);
        alphabet.put('d',4);
        alphabet.put('e',5);
        alphabet.put('f',6);
        alphabet.put('g',7);
        alphabet.put('h',8);
        alphabet.put('i',9);
        alphabet.put('j',10);
        alphabet.put('k',11);
        alphabet.put('l',12);
        alphabet.put('m',13);
        alphabet.put('n',14);
        alphabet.put('o',15);
        alphabet.put('p',16);
        alphabet.put('q',17);
        alphabet.put('r',18);
        alphabet.put('s',19);
        alphabet.put('t',20);
        alphabet.put('u',21);
        alphabet.put('v',22);
        alphabet.put('w',23);
        alphabet.put('x',24);
        alphabet.put('y',25);
        alphabet.put('z',26);
        return alphabet;
    }

}

//OR

/*
import java.util.*;

public class Kata {
    public static String high(String s) {
        return Arrays.stream(s.split(" "))
                .max(Comparator.comparingInt(
                        a -> a.chars().map(i -> i - 96).sum()
                )).get();
    }
}*/
