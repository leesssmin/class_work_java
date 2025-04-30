package my;

import java.util.Random;

public class Array {

    public static void main(String[] args) {
        Random random = new Random();

        int[] intBoxes = new int[6];
        for(int i=0; i < intBoxes.length; i++ ){
            intBoxes[i] = random.nextInt(42) +1;
            System.out.println(intBoxes[i]);
        }

    }
}
