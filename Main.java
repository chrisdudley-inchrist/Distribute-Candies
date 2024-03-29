/**
 * Given an integer array with even length, where different numbers
 * in this array represent different kinds of candies. Each number
 * means one candy of the corresponding kind. You need to distribute
 * these candies equally in number to brother and sister. Return the
 * maximum number of kinds of candies the sister could gain.
 * <p>
 * Example 1:
 * <p>
 * Input: candies = [1,1,2,2,3,3]
 * Output: 3
 * Explanation:
 * There are three different kinds of candies (1, 2 and 3), and two
 * candies for each kind.
 * Optimal distribution: The sister has candies [1,2,3] and the
 * brother has candies [1,2,3], too.
 * The sister has three different kinds of candies.
 * <p>
 * Example 2:
 * <p>
 * Input: candies = [1,1,2,3]
 * Output: 2
 * Explanation: For example, the sister has candies [2,3] and the
 * brother has candies [1,1].
 * The sister has two different kinds of candies, the brother has
 * only one kind of candies.
 * <p>
 * Note:
 * <p>
 * The length of the given array is in range [2, 10,000], and
 * will be even.
 * <p>
 * The number in given array is in range [-100,000, 100,000].
 */

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


