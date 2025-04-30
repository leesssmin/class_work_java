package exercise;

public class Exercise4 {

    public static void main(String[] args) {

        // 원래 가격 59.99
        //30% 할인된 가격을 출력

        // 1.
        final double ORIGINAL_PRICE = 59.99;
        final double DISCOUNT_RATE = 0.30;

        // 2.
        // 할인된 가격 식: 원가 * (1- 할인율)
        double discountPrice = ORIGINAL_PRICE * (1- DISCOUNT_RATE);

        //3.
        System.out.println("최종 가격:" +(int) discountPrice);
    } // end of main
} //enf of class
