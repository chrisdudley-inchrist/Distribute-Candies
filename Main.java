import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(distributeCandies(10, 3));
    }

    public static int[] distributeCandies(int candies, int num_people) {
        int[] dist = new int[num_people];
        int candyDist = 1;

        while (candies >= 1) {
            for (int i = 0; i < num_people; i++) {
                if (candies - candyDist >= 0) {
                    dist[i] += candyDist;
                    candies -= candyDist;
                    candyDist++;
                } else {
                    break;
                }
            }
        }

        return dist;
    }
}





