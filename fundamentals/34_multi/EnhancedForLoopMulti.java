public class EnhancedForLoopMulti {
    public static void main(String[] args) {
        int[][] lottogroups = {{1111, 2222, 3333, 4444}, {6666, 7777, 8888, 9999}, {11111, 121212, 131313}};

        int i = 0;
        for (int[] group : lottogroups) {
            System.out.println("Group: " + i);
            
            int j = 0;
            for (int value : group) {
                System.out.println("  Value " + j + " = " + value);
                j++;
            }
            
            i++;
        }
    }
}

    

