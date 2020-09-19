package JavaStuff2;

public class NestedLoop {
    public static void main(String[] args) {
        
        for (int pp = 1; pp <= 5; pp++)
        {
            for (int jj = 1; jj <= pp; jj++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}