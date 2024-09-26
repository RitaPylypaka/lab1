public class FizzBuzz {
    public static String FizzBuzz(int c) {
        if (c % 3 == 0 && c % 5 == 0) {
            return "FizzBuzz";
        }
        else if (c % 3 == 0) {
            return "Fizz";
        }
        else if (c % 5 == 0) {
            return "Buzz";
    }
        else {
        return  Integer.toString(c);
        }
    }
    public static void main (String[] args){
        final int[] r = new int[100];
        for (int i = 1; i<= r.length; i++){
            System.out.println(FizzBuzz(i));
        }
    }
}
