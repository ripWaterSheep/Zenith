package testers;

public class whatamidoing {
    public static void main(String[] args) {
        double x;
        double biggest = 0;

        do {
            x = Math.random();
            if (x > biggest) {
                System.out.println(x);
                biggest = x;
            }
        } while (!(x > 0.9999999999999999));



        for(int i=0; i<10; i++) System.out.println();
        System.out.println(x);
    }
}
