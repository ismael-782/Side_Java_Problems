import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        String FirstChoise;
        String decimal , Binary;

        startPhase();
        System.out.print("||--> ");
        FirstChoise = input.nextLine().trim();
        while (true) {
            if(!FirstChoise.equals("A") && !FirstChoise.equals("B") && !FirstChoise.equals("C")){
                System.out.println("||--> Please enter A or B or C: ");
                System.out.print("||--> ");
            } else {
                break;
            }
            FirstChoise = input.nextLine().trim();
        }

        while (!FirstChoise.equals("C")) {

            if(FirstChoise.equals("A")){
                indentation();
                System.out.print("Enter a decimal number: ");
                decimal = input.nextLine().trim();
                Binary =  DecToBinary(decimal);
                System.out.println("||         | ");
                System.out.println("||          -----> the Binary number for " + decimal + " is " + Binary);
                System.out.println("||");
            } else if (FirstChoise.equals("B")){
                indentation();
                System.out.print("Enter a binary number: ");
                Binary = input.nextLine().trim();
                if (isBinary(Binary)) {
                    decimal = Integer.toString(BinToDecimal(Binary));
                    System.out.println("||         | ");
                    System.out.println("||          -----> the Decimal number for " + Binary + " is " + decimal);
                    System.out.println("||");
                } else {
    
                }
            } else {
                endPhase();
            }
        }
        endPhase();
    }

    // Function for Decimal To Binary Conversion
    public static String DecToBinary(String decimal)throws Exception{

        String result = "";
        int num = Integer.parseInt(decimal);
        while (num != 0) {
            result = Integer.toString(num % 2) + result;
            num = (int) Math.floor(num / 2);
        }
        if (result.length() == 0) {
            result = "0";
        }
        return result;
    }

    public static int BinToDecimal(String binary){

        int decimal = 0;
        int power = 0;

        // Iterate over the binary digits from right to left
        for (int i = binary.length() - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(binary.charAt(i));
            decimal += digit * Math.pow(2, power);
            power++;
        }

        return decimal;
    }


    public static boolean isBinary(String input) {
        // Regular expression to match a binary number
        String binaryPattern = "^[01]+$";
        
        // Check if the input matches the binary pattern
        return input.matches(binaryPattern);
    }


    public static void indentation(){
        System.out.println("||");
        System.out.print("||----------> ");
        
    }

    public static void startPhase(){
        System.out.println("   ================== Welcome to Decimal Binary Converter ===================");
        System.out.println(" //");
        System.out.println("||--> Please Choose the Type of Convergenc: ");
        System.out.println("||");
        System.out.println("||--> (A) Decimal to Binary");
        System.out.println("||--> (B) Binary to Decimal");
        System.out.println("||--> (C) Terminate");
        System.out.println("||");
    }

    public static void endPhase(){
        System.out.println("||");
        System.out.println(" ================== Program Stoped, Thank you for using it ==================");
    }


    
    

}
