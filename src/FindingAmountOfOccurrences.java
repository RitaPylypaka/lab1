public class FindingAmountOfOccurrences {
    public static String[][] Matrix() {
        String[][] matrix = {{"rrr", "ccc"}, {"ccc", "mmm"}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        return matrix;
    }
    public static int CountOccurrences(String[][] matrix, String substring) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                String elem = matrix[i][j];
                int index = elem.indexOf(substring);
                while (index != -1) {
                    count++;
                    index = elem.indexOf(substring, index + substring.length());
                }
            }
        }
        return count;
    }
    public static void main (String[] args){
        String[][] matrix = Matrix();
        String substring = "ccc";
        int occurrences = CountOccurrences(matrix, substring);
        System.out.println("Amount of occurrences : " + occurrences);
    }
}
