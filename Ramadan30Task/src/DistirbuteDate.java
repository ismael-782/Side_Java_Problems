import java.util.Arrays;
import java.util.Scanner;

public class DistirbuteDate {
    public static void main(String[] args) {

        int numDate = 0;
        int numGuests = 0;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println( "Enter the number of dates available: ");
            numDate = input.nextInt();
            System.out.println("Enter the number of Guests comming: ");
            numGuests = input.nextInt();
        }
        System.out.println(Arrays.toString(distrbuteDates(numDate,numGuests)));
    }

    private static int[] distrbuteDates(int totalDate, int totalGuests) {

        int[] arr = new int[totalGuests];
        int temp = 0;
        

        if (totalDate > totalGuests) {

            int rem = (int) Math.floor(totalDate / totalGuests);

            if (rem % 2 == 0) {
                rem--;
            }
    
            for (int j = 0; j < arr.length; j++) {
                arr[j] = rem;
            }
    
            temp = totalDate - (rem * totalGuests);
            if (temp % 2 != 0) {
                 System.out.println("The remaining is 1");
            } else {
                System.out.println("The remaining is Zero Dates");
            }

            temp = (int) Math.floor(temp / 2);
    
            for (int j = 0; j < temp; j++) {
                arr[j] = arr[j] + 2;
            }



        } else {
            for (int i = 0; i < totalDate; i++) {
                arr[i] = arr[i] + 1;
            }
            System.out.println("The remaining is Zero Dates");
        }

        return arr;
    }
}