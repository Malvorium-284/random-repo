package StillJavaThngs;

public class sample {
    public static void main(String[] args) {
        int bucky[] = {3, 4, 5, 6, 7};
        changeMe(bucky);

        for(int bb: bucky) {
            System.out.println(bb);
        }

       

    }

    static void changeMe(int x[]) {
        for (int y = 0; y < x.length; y++) {
            x[y]+=5;
        }
    }
}
