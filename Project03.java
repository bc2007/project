package projects;

public class Project03 {
    public static void main(String[] args){


        System.out.println(">>>--------------- TASK 1 ---------------<<<");
        String s1 = "24", s2 = "5";
        int i1 = Integer.parseInt(s1), i2 = Integer.parseInt(s2);
        System.out.println("The sum of " + i1 + " and " + i2 + " = " + (i1 + i2));
        System.out.println("The subtraction of " + i1 + " and " + i2 + " = " + (i1 - i2));
        System.out.println("The division of " + i1 + " and " + i2 + " = " + (double)i1 / (double)i2);
        System.out.println("The remainder of " + i1 + " and " + i2 + " = " + i1 % i2);


        System.out.println("\n>>>--------------- TASK 2 ---------------<<<");
        int randomNum = (int) (Math.random()*35) + 1;
        System.out.println("Random number = " + randomNum);
        if (((randomNum == 1) || (randomNum % 2 == 0) || (randomNum % 3 == 0) || (randomNum % 5 == 0) || (randomNum % 7 == 0)) && ((randomNum != 2) && (randomNum != 3) && (randomNum != 5)))
        {System.out.println("THE NUMBER IS NOT A PRIME NUMBER");}
                else {
            System.out.println("THE NUMBER IS A PRIME NUMBER");
        }


        System.out.println("\n>>>--------------- TASK 3 ---------------<<<");
        int random1 = (int) (Math.random()*50) + 1;
        int random2 = (int) (Math.random()*50) + 1;
        int random3 = (int) (Math.random()*50) + 1;
        System.out.println("Random number 1 = " + random1);
        System.out.println("Random number 2 = " + random2);
        System.out.println("Random number 3 = " + random3);
        int lowest = Math.min(Math.min(random1, random2),random3);
        int greatest = Math.max(Math.max(random1, random2),random3);

        System.out.println("\nLowest number is = " + lowest);

        if (random1 != lowest && random1 != greatest){
            System.out.println("Middle number is = " + random1);
        }
        else if (random2 != lowest && random2 != greatest){
            System.out.println("Middle number is = " + random2);
        }
        else {
            System.out.println("Middle number is = " + random3);
        }

        System.out.println("Greatest number is = " + greatest);


        System.out.println("\n>>>--------------- TASK 4 ---------------<<<");
        char char1 = '/';
        if (char1 >= 'A' && char1 <= 'Z') {
                System.out.println("The letter is uppercase");
            } else if (char1 >= 'a' && char1 <= 'z') {
                System.out.println("The letter is lowercase");
            }
         else {
            System.out.println("Invalid character detected!!!");
        }


        System.out.println("\n>>>--------------- TASK 5 ---------------<<<");
        char char2 = 'I';
        if ((char2 >= 'A' && char2 <= 'Z') || (char2 >= 'a' && char2 <= 'z')) {
            switch (char2) {
                case 'A':
                case 'a':
                case 'E':
                case 'e':
                case 'I':
                case 'i':
                case 'O':
                case 'o':
                case 'U':
                case 'u':
                    System.out.println("The letter is vowel");
                    break;
                default:
                    System.out.println("The letter is consonant");
            }
        } else {
            System.out.println("Invalid character detected!!!");
        }


        System.out.println("\n>>>--------------- TASK 6 ---------------<<<");
        char char3 = '#';
        if ((char3 >= 'A' && char3 <= 'Z') || (char3 >= 'a' && char3 <= 'z') || (char3 >= '0' && char3 <= '9')) {

            System.out.println("Invalid character detected!!!");
        } else {
            System.out.println("Special character is = " + char3);
        }


        System.out.println("\n>>>--------------- TASK 7 ---------------<<<");
        char char4 = '&';
        if ((char4 >= 'A' && char4 <= 'Z') || (char4 >= 'a' && char4 <= 'z')) {
            System.out.println("Character is a letter");
        } else if ((char4 >= '0' && char4 <= '9')) {
            System.out.println("Character is a digit");
        } else {
            System.out.println("Character is a special character");
        }


    }
}
