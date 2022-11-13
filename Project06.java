package projects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Project06 {
    public static void main(String[] args) {

        System.out.println("\n>>>--------------- TASK 1 ---------------<<<");
        String[] arrayS = {"foo", "", " ", "foo bar", "java is fun", " ruby "};
        System.out.println(countMultipleWords(arrayS));


        System.out.println("\n>>>--------------- TASK 2 ---------------<<<");
        Integer[] arrayN = {2, -5, 6, 7, -10, -78, 0, 15};
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(arrayN));
        System.out.println(removeNegatives(numbers));


        System.out.println("\n>>>--------------- TASK 3 ---------------<<<");
        System.out.println(validatePassword(" "));
        System.out.println(validatePassword("abcd"));
        System.out.println(validatePassword("abcd1234"));
        System.out.println(validatePassword("Abcd1234"));
        System.out.println(validatePassword("Abcd123!"));


        System.out.println("\n>>>--------------- TASK 4 ---------------<<<");
        System.out.println(validateEmailAddress("a@gmail.com"));
        System.out.println(validateEmailAddress("abc@g.com"));
        System.out.println(validateEmailAddress("abc@gmail.c"));
        System.out.println(validateEmailAddress("abc@@gmail.com"));
        System.out.println(validateEmailAddress("abcd@gmail.com"));




    }


    public static int countMultipleWords(String[] arrayS){
        int count = 0;
        for (int i = 0; i < arrayS.length; i++) {
            if (arrayS[i].trim().split("[\\w]{1,}").length >= 2) count++;
        }
        return count;
    }


    public static ArrayList<Integer> removeNegatives(ArrayList<Integer> numbers){
        numbers.removeIf(n -> n < 0);
        return numbers;
    }



    public static boolean validatePassword(String password){
        return password.matches("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,16}");
    }



    public static boolean validateEmailAddress(String emailAddress){
        return emailAddress.matches("[\\w]{2,}@[\\w]{2,}\\.[\\w.]{2,}");
    }
























}
