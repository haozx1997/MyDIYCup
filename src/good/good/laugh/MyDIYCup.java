package good.good.laugh;

/**
 * @author zixiao.hao
 * @date 2019/9/6
 */
public class MyDIYCup {
    private static final int ONE_HOUR = 1;

    private void drink() {
    }

    private void drinkAll() {
    }

    private boolean isEmpty() {
        return false;
    }

    private int lastDrinkTime() {
        return 0;
    }

    private static int now() {
        return 0;
    }

    private void refill() {
    }

    private boolean hasBeenSeen() {
        return false;
    }

    public static void main(String[] args) {
        boolean working = true;
        MyDIYCup myDIYCup = new MyDIYCup();
        while (working) {
            if (myDIYCup.hasBeenSeen()) {
                if (myDIYCup.isEmpty()) {
                    myDIYCup.refill();
                }
                myDIYCup.drink();
            } else {
                if (myDIYCup.lastDrinkTime() - now() > ONE_HOUR) {
                    myDIYCup.drinkAll();
                }
            }
        }
    }
}
