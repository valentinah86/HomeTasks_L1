package Task_1;

import java.util.Scanner;

public class task1 {


    public static void main (String[] args)
    {
        Scanner str = new Scanner(System.in);
        String value;

        System.out.println("Enter the string");

        value = str.nextLine();

        // p. 1 reverse
        StringBuffer s_buffer = new StringBuffer(value.subSequence(0, value.length()));
        System.out.println("subtask 1 - reverse");
        System.out.println(s_buffer.reverse());

        // p.2 - word splitting and output line by line
        System.out.println("subtask 2 - word splitting and output line by line");
        for (String splt : value.split(" ") ) {
            System.out.println(splt);
        }

        // p.3 replacement of spaces with *
        System.out.println("subtask 3 - replacement of spaces with *");
        System.out.println(value.replaceAll(" ", "*"));

        //п.4 change to uppercase
        System.out.println("subtask 4 - change to uppercase");
        System.out.println(value.toUpperCase());

        //п.5 - output from 5 to 10 character
        System.out.println("subtask 5 - output from 5 to 10 character");

       if (value.length() > 4 && value.length() < 10){
           System.out.println(value.substring(4, value.length()));
       } else if (value.length() > 10){
           System.out.println(value.substring(4,10));
       } else {
           System.out.println("String length less than needed to print substring with defined indexes");
       }

    }

}

