package Task_4;

import java.util.Arrays;

public class Task_4 {

    public static void main(String[] args) {
        String[] Names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};
        int[] time = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265};

        int[] place = Arrays.copyOf(time, time.length);
        Arrays.sort(place);
            for (int i = 0; i < Names.length; i++) {
            for (int j = 0; j < Names.length; j++) {
                if (place[i] == time[j]) {
                    System.out.println(Names[j]+" "+ ", time - " + place[i]);
                }
            }

        }
    }
}


