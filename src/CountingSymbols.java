import java.util.ArrayList;

 class CountingSymbols {
    char letter;
    int count;

    public CountingSymbols(char letter, int count) {
        this.letter = letter;
        this.count = count;

    }
@Override
    public String toString() {
        return  letter + " : " + count;
    }

    public static CountingSymbols[] countingSymbols(String x){
        CountingSymbols[] counts = new CountingSymbols[256];
        for ( int i =0; i < x.length(); i++){
            char r = x.charAt(i);
            if (counts[r]==null) {
            counts[r] = new CountingSymbols(r, 1);

            } else {
              counts[r].count++;
            }

        }
        return counts;
    }
    public static void main (String[] args){
        String x = "Guten Morgen!";
        CountingSymbols[] result = countingSymbols(x);
        for ( CountingSymbols counts : result){
            if (counts != null && counts.count>0){
                System.out.println(counts);


            }
        };
    }
}
