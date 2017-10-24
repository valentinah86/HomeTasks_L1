package Task_2;

import java.util.Scanner;

public class task2 {

    private static boolean isNumericValue(String X) throws NumberFormatException {
        try {
            Integer.parseInt(X);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public static void main (String [] args) {

        String[] days = {"Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье"};
        Scanner str = new Scanner(System.in);
        int DayNumber;
        String value="";

        while (!value.equals("X")) {
            System.out.println("Enter any value from 1 to 7 or X to exit");
            value = str.next();

           if (isNumericValue(value) && Integer.parseInt(value) >= 1 && Integer.parseInt(value) <= 7) {
                DayNumber = Integer.parseInt(value);
                System.out.println(days[DayNumber - 1]);

            }
            else if (value.equals("X")||value.equals("x"))
            {
               break;
            }
                else{
                    System.out.println("Incorrect value. Please, try again");

                }

            }
        }

    }



