package array;

import java.util.Random;

public class Array3 {

    public static void main(String[] args) {

        // 난수 발생 기능 - 랜덤한 숫자를 하나 만들어 주는 도구
        // 자바 개발자들이 미리 만들어 준 기능
        //Random random; = new Random();
        // 문서 <-- 구글링 <--- chatGPT
        // 0~44 까지 랜덤한 숫자를 하나 발생해 준다.
        // 1~45

        //배열과 for 문을 활용해서 코드 수정


        Random random = new Random();

        // 배열 규칙 - 배열을 미리 사용할 공간, 크기를 정해줘야 한다.
        int[] intBoxes = new int[6];
        // xxx.length 를 활용해 크기를 알 수 있다.
        for(int i =0; i < intBoxes.length ; i++){
            intBoxes[i] = random.nextInt(45) + 1;
            System.out.println(intBoxes[i]);
        }

    }
}
