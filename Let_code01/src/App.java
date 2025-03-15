class Solution {

    public static void main(String[] args) {
        String s = "    day";
        System.out.println("Original String : " + s);
        int a = lengthOfLastWord(s);
        System.out.println("The lengh is: " + a);

    }

    public static int lengthOfLastWord(String s) {
        int count = 0;
        s = s.trim();
        System.out.println(s.length());
        if (s.length() == 1) {
            return 1;
        } else if (s.isEmpty()) {
            return 0;
        } else {
            for (int i = s.length() - 1; i >= 0; i--) {
                if (s.charAt(i) == ' ') {
                    i = 0;
                } else {
                    count++;
                }
            }
        }

        return count;
    }
}