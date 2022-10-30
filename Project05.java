package projects;

import java.util.Arrays;

public class Project05 {
    public static void main(String[] args) {

        int[] array1 = {10, 7, 7, 10, -3, 10, -3};
        int[] array2 = {10, 5, 6, 7, 8, 5, 15, 15};
        String[] words1 = {"foo", "bar", "Foo", "bar", "6", "abc", "6", "xyz", "bar"};
        String[] words2 = {"pen", "eraser", "pencil", "pen", "123", "abc", "pen", "eraser"};
        findGreatestAndSmallestWithSort(array1);
        findGreatestAndSmallest(array1);
        findSecondGreatestAndSmallestWithSort(array2);
        findSecondGreatestAndSmallest(array2);
        findDuplicatedElementsInAnArray(words1);

        System.out.println("\n>>>--------------- TASK 6 ---------------<<<");
        System.out.println(findMostRepeatedElementInAnArray(words2));
    }



    public static void findGreatestAndSmallestWithSort(int[] numbers) {
        Arrays.sort(numbers);
        System.out.println("\n>>>--------------- TASK 1 ---------------<<<");
        System.out.println("Smallest = " + numbers[0]);
        System.out.println("Greatest = " + numbers[numbers.length - 1]);
    }



    public static void findGreatestAndSmallest(int[] numbers) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int n : numbers) {
            if (n < min) min = n;
            if (n > max) max = n;
        }
        System.out.println("\n>>>--------------- TASK 2 ---------------<<<");
        System.out.println("Smallest = " + min);
        System.out.println("Greatest = " + max);
    }



    public static void findSecondGreatestAndSmallestWithSort(int[] numbers) {
        Arrays.sort(numbers);
        int min = numbers[0];
        int max = numbers[numbers.length - 1];
        int secondMax = Integer.MIN_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int n : numbers) {
            if (n > secondMax && n < max) secondMax = n;
            if (n < secondMin && n > min) secondMin = n;
        }
        System.out.println("\n>>>--------------- TASK 3 ---------------<<<");
        System.out.println(("Second Smallest = " + secondMin));
        System.out.println(("Second Greatest = " + secondMax));
    }



    public static void findSecondGreatestAndSmallest(int[] numbers) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int n : numbers) {
            if (n < min) min = n;
            if (n > max) max = n;
        }
        int secondMax = Integer.MIN_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int n : numbers) {
            if (n > secondMax && n < max) secondMax = n;
            if (n < secondMin && n > min) secondMin = n;
        }
        System.out.println("\n>>>--------------- TASK 4 ---------------<<<");
        System.out.println(("Second Smallest = " + secondMin));
        System.out.println(("Second Greatest = " + secondMax));
    }



    public static void findDuplicatedElementsInAnArray(String[] words) {
        String duplicates = "";
        for (int i = 0; i < words.length-1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (duplicates.contains(words[i])) break;
                if (words[i] == words[j]) duplicates += words[i] + " ";
            }
        }
        System.out.println("\n>>>--------------- TASK 5 ---------------<<<");
        String[] newArray = duplicates.split(" ");
        for (String s : newArray) {
            System.out.println(s);
        }
    }



    public static String findMostRepeatedElementInAnArray(String[] words) {
       int maxRepeating = 0;
       String mostRepeated = "";
        for (int i = 0; i < words.length; i++) {
            int countRepeating = 0;
            for (int j = 0; j < words.length; j++) {
                if (words[i] == words[j]) countRepeating++;
            }
            if (countRepeating > maxRepeating) {
                maxRepeating = countRepeating;
                mostRepeated = words[i];
            }
        }
        return mostRepeated;
    }








}
