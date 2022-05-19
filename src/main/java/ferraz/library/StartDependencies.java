package ferraz.library;

public class StartDependencies {
    public static void main(String[] args) {

        String arrayString[][] = new String[10][10];
        int[] ints = {0,1,2,3,4,5,6,7,8,9};

        for (int x : ints){
            for (String j : arrayString[x]) {
                j = "A";
                System.out.println(j);
            }
        }


    }
}