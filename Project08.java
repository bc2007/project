package projects;

import java.util.ArrayList;
import java.util.Arrays;

public class Project08 {

    public static void main(String[] args) {

        System.out.println("\n>>>--------------- TASK 1 ---------------<<<");
        System.out.println(findClosestDistance(new int[]{4}));
        System.out.println(findClosestDistance(new int[]{4, 8, 7, 15}));
        System.out.println(findClosestDistance(new int[]{10, -5, 20, 50, 100}));

        System.out.println("\n>>>--------------- TASK 2 ---------------<<<");
        System.out.println(findSingleNumber(new int[]{2}));
        System.out.println(findSingleNumber(new int[]{5, 3, -1, 3, 5, 7, -1}));

        System.out.println("\n>>>--------------- TASK 3 ---------------<<<");
        System.out.println(findFirstUniqueCharacter("Hello"));
        System.out.println(findFirstUniqueCharacter("abc abc d"));
        System.out.println(findFirstUniqueCharacter("abab"));

        System.out.println("\n>>>--------------- TASK 4 ---------------<<<");
        System.out.println(findMissingNumber(new int[]{2, 4}));
        System.out.println(findMissingNumber(new int[]{2, 3, 1, 5}));
        System.out.println(findMissingNumber(new int[]{4, 7, 8, 6}));


    }


    public static int findClosestDistance(int[] numbers){
        Arrays.sort(numbers);
        if (numbers.length < 2) return -1;
        int closestDistance = numbers[1] - numbers[0];
        for (int i = 1; i < numbers.length-1; i++) {
            int currentDistance = numbers[i+1] - numbers[i];
            if (currentDistance < closestDistance) closestDistance = currentDistance;
        }
        return closestDistance;
    }


    public static int findSingleNumber(int[] nums){
        Arrays.sort(nums);
        if (nums.length == 1) return nums[0];       // if it is one element array return that element
        for (int i = 0; i < nums.length-1; i++) {       // if the unique element is somewhere between the index of 0 and nums.length-1 find it through the loop
            if (nums[i] != nums[i+1]) {     // if the element at index i is different from the one next to it - return that element since it is unique
                return nums[i];
            }
            i++;        // skip the next element since it is equal to its predecessor - no need to check it (loop in pairs)
        }
        return nums[nums.length-1];     //lastly return the very last element in the array since that is the only one left
    }


    public static char findFirstUniqueCharacter(String str){
       char[] strArray = str.toCharArray();
        for (int i = 0; i < strArray.length; i++) {
            for (int j = i+1; j < strArray.length; j++) {
                if (strArray[i] == strArray[j]) {
                    strArray[i] = ' ';
                    strArray[j] = ' ';
                }
            }
        }
        for (char c : strArray) {
            if (c != ' ') {
                return c;
            }
        }
        return ' ';
    }


    public static int findMissingNumber(int[] x){
        Arrays.sort(x);
        int rightHere = x[0];
        for (int i = 0; i < x.length-1; i++) {
            if ((x[i+1] - x[i]) > 1) {
                rightHere = x[i];
            }
        }
        return rightHere + 1;
    }


}
