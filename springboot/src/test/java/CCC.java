import com.zfq.springboot.AAA;

import java.util.Comparator;

public class CCC{
    private static boolean bChanged;
    public static void main(String[] args) {
        System.out.println(bChanged);
        for (;;) {
            if (bChanged == !bChanged) {
                System.out.println("!=");
                System.exit(0);
            }
        }
    }

}