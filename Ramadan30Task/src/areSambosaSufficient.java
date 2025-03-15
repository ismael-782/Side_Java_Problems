public class areSambosaSufficient {
    public static void main(String[] args) {
        int numGuests = 5;
        int doughSheets = 20; // maked one sumbosa
        int meatGrams = 50; // 5 grams to make one sumbosa
        int Cheese = 17; // halg of a piece is enough for 1 simbosa
        int[][] requests = new int[numGuests][2]; // [meat sambosa][Chees sambosa]
        requests[0][0] = 1;
        requests[0][1] = 1;
        requests[1][0] = 3;
        requests[1][1] = 2;
        requests[2][0] = 2;
        requests[2][1] = 3;
        requests[3][0] = 2;
        requests[3][1] = 1;
        requests[4][0] = 2;
        requests[4][1] = 2;

        if (SambosaSufficient(numGuests, doughSheets, meatGrams, Cheese, requests)) {
            System.out.println("There are sufficint ingrediants");
        } else {
            System.out.println("There are not sufficint ingrediants");
        }
    }

    public static boolean  SambosaSufficient(int numGuests, int doughSheets, int meatGrams, int Cheese, int[][] requests) {

        int totalMeatSambosa = 0;
        int totalCheeseSambosa = 0;
        int neededDoughSheets = 0;
        int needeMeatGrams = 0;
        int neededCheese = 0;

        for (int i = 0; i < numGuests; i++) {
            for (int j = 0; j < 2; j++) {
                if (j == 0) {
                    totalMeatSambosa = totalMeatSambosa + requests[i][j];
                } else {
                    totalCheeseSambosa = totalCheeseSambosa + requests[i][j];
                }
            }
        }

        needeMeatGrams = totalMeatSambosa * 5;
        neededCheese = totalCheeseSambosa * 2;
        neededDoughSheets = totalCheeseSambosa + totalMeatSambosa;

        if (meatGrams < needeMeatGrams || Cheese < neededCheese || doughSheets < neededDoughSheets) {
            return false;
        } else {
            return true;
        }
    }
}