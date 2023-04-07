package read.program;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Scanner;

public class UniqueCharacter
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter input");
        String input = scn.nextLine();

       uniqueCharacters(input);
    }

    private static void uniqueCharacters(String inputData)
    {
        String input = inputData.replaceAll("[^a-zA-Z]", "");
        System.out.println("Value ===" + input);


        HashSet<Object> charSet = new HashSet<>();

        for(int i =0; i<input.length(); i++)
            charSet.add(input.charAt(i));

        System.out.println("Length of sentence == " +input.length());

       if (charSet.size() == input.length())
       {
           System.out.println("Given String " + input + " is true");
           return;
       }

       System.out.println("Given String" + input + " is false");

    }
}
