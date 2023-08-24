import java.util.ArrayList;
import java.util.List;
import java.util.Set;;
import java.util.Collections;

public class KeepTheChange {
    //returns the list of coins that compose the change.
    public static List<Integer> computeChange(int amount, Set<Integer> coins) {

        List<Integer> change = new ArrayList<>();

        //sort the coins from biggest to smallest
        List<Integer> coinss = new ArrayList<>(coins);
        Collections.sort(coinss, Collections.reverseOrder());

        //now i have a list of coins

        //loop: take the amount - biggest, put the result into the list of integer, if the result < biggest, move to the second biggest, do it until the result reaches 0
        for (int coin : coinss) {
            while (amount >= coin) {
                change.add(coin);
                amount -= coin;
            }
        }

        return change;
        //return list

    }
}