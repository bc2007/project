package projects;

import utilities.RandomNumberGenerator;
import utilities.ScannerHelper;

public class Project04 {
    public static void main(String[] args) {


        System.out.println(">>>--------------- TASK 1 ---------------<<<");
        String s1 = ScannerHelper.getAString();
        if (s1.length() < 8) System.out.println("This String does not have 8 characters");
        else {
            String first4 = s1.substring(0, 4);
            String last4 = s1.substring(s1.length()-4);
            String middle = s1.substring(4, s1.length()-4);
            System.out.println(last4 + middle + first4);
        }


        System.out.println("\n>>>--------------- TASK 2 ---------------<<<");
        String s2 = ScannerHelper.getAString().trim();
        int counter = 0;
        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) == ' ') counter++;
        }
        if (counter < 2) System.out.println("This sentence does not have 2 or more words to swap");
        else {
            String firstWord = s2.substring(0, s2.indexOf(' '));
            String lastWord = s2.substring(s2.lastIndexOf(' ')+1);
            String middle = s2.substring(s2.indexOf(' '), s2.lastIndexOf(' ')+1);
            System.out.println(lastWord + middle + firstWord);
        }


        System.out.println("\n>>>--------------- TASK 3 ---------------<<<");
        String s3 = ScannerHelper.getAString();
        s3 = s3.replace("stupid", "nice");
        s3 = s3.replace("idiot", "nice");
        System.out.println(s3);


        System.out.println("\n>>>--------------- TASK 4 ---------------<<<");
        String name = ScannerHelper.getAName();
        if (name.length() < 2) System.out.println("Invalid input!!!");
        else if (name.length() % 2 == 1) System.out.println(name.charAt(name.length()/2));
        else System.out.println(name.substring(name.length()/2-1, name.length()/2+1));


        System.out.println("\n>>>--------------- TASK 5 ---------------<<<");
        String country = ScannerHelper.getACountry();
        if (country.length() > 5) System.out.println(country.substring(2, country.length()-2));
        else System.out.println("Invalid input!!!");


        System.out.println("\n>>>--------------- TASK 6 ---------------<<<");
        String address = ScannerHelper.getAnAddress();
        address = address.replace('a', '*');
        address = address.replace('A', '*');
        address = address.replace('e', '#');
        address = address.replace('E', '#');
        address = address.replace('i', '+');
        address = address.replace('I', '+');
        address = address.replace('u', '$');
        address = address.replace('U', '$');
        address = address.replace ('o', '@');
        address = address.replace ('O', '@');
        System.out.println(address);


        System.out.println("\n>>>--------------- TASK 7 ---------------<<<");
        String newS = "";
        int random1 = RandomNumberGenerator.getARandomNumber(0, 25);
        int random2 = RandomNumberGenerator.getARandomNumber(0, 25);

        for (int i = Math.min(random1, random2); i <= Math.max(random1, random2) ; i++) {
            if (i % 5 != 0) newS = newS + i + " - ";
        }
        //System.out.println(random1);
        //System.out.println(random2);
        System.out.println(newS.substring(0, newS.length()-3));


        System.out.println("\n>>>--------------- TASK 8 ---------------<<<");
        String sentence = ScannerHelper.getAString().trim();
        int counter8 = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') counter8 ++;
        }
        int wordCount = counter8 + 1;
        if (wordCount < 2) System.out.println("This sentence does not have multiple words.");
        else System.out.println("This sentence has " + wordCount + " words.");


        System.out.println("\n>>>--------------- TASK 9 ---------------<<<");
        int number = ScannerHelper.getANumber();
        for (int i = 1; i <= number; i++) {
            if (i % 6 == 0) System.out.println("FooBar");
            else if (i % 2 == 0) System.out.println("Foo");
            else if (i % 3 == 0) System.out.println("Bar");
            else System.out.println(i);
        }


        System.out.println("\n>>>--------------- TASK 10 ---------------<<<");
        String word = ScannerHelper.getAWord();
        boolean signal = false;
        if (word.length() < 1) System.out.println("This word does not have 1 or more characters");
        else if (word.length() == 1) System.out.println("This word is palindrome");
        else {
            for (int i = 1; i < word.length()/2; i++) {
                if (word.charAt(i-1) == word.charAt(word.length()-i)) signal = true;
            }
            if (signal) System.out.println("This word is palindrome");
            else System.out.println("This word is not palindrome");
        }


        System.out.println("\n>>>--------------- TASK 11 ---------------<<<");
        String sentence11 = ScannerHelper.getAString();
        int counter11 = 0;
        if (sentence11.length() < 1) System.out.println("This sentence does not have any characters");
        else {
            for (int i = 0; i < sentence11.length(); i++) {
                if (sentence11.charAt(i) == 'A' || sentence11.charAt(i) == 'a') counter11++;
            }
            System.out.println("This sentence has " + counter11 + " a or A letters.");
        }


    }
}