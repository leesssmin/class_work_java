package MyTest;

import java.util.Arrays;
import java.util.Random;

public class Test1_2 {

    final int RANDOM_NUMBER_COUNT = 8;

    public int[] creatNumber() {
        int forcount = 0;

        int[] randomWinNum = new int[RANDOM_NUMBER_COUNT];
        Random random = new Random();

        for (int i = 0; i < randomWinNum.length; i++) {
            randomWinNum[i] = random.nextInt(60) + 1;

            for (int j = 0; j < i; j++) {
                if (randomWinNum[j] == randomWinNum[i]) {
                    i--;
                }


            }
            forcount++;

        }
        System.out.println("outer for 테스트: " + forcount);
        Arrays.sort(randomWinNum);
        return randomWinNum;

    }

    public static void main(String[] args) {
    Test1_2 test1_2 = new Test1_2();
    int[] result = test1_2.creatNumber();
    for(int i = 0; i < result.length; i++){
        System.out.println(result[i]);
    }
    }
}
