package ch03;

/**
 * 비교 연산자2
 * 연산의 결과값은 true, false 로 반환 된다.
 */
public class Operation4 {

    // 메인 함수(코드의 진입점)
    public static void main(String[] args) {

        // 게임 캐릭터의 상태를 설정
        int playerH = 50; //플레이어의 체력
        int playerL = 10; //플레이어 레벨
        int enemyH = 30; //적 체력
        int reqireredL =15; //특정 퀘스트를 수행하기 위한 최소레벨

        // 1. 플레이어의 체력이 적 체력보다 높은지 확인 -> true, false
        boolean isStronger = playerH > enemyH ;

        //2. 플레이어의 체력이 위험 수준(20이하) 인지 확인
        boolean isInDanger = playerH <= 20;
        System.out.println("플레이어가 위험 상태이다 : " + isInDanger);

        //3. 플레이어 레벨이 퀘스트 수행 가능한 레벨 이상인지 확인
        boolean canDoQuest = playerL >= reqireredL;
        System.out.println("퀘스트를 수행할 수 있다: " + canDoQuest);

        // 4. 플레이어와 적의 체력이 같은지 확인 (비교연산자)
        boolean isSame = playerH == enemyH;
        System.out.println("체력이 같다:" + isSame);

        // 5. 플레이어 레벨이 특정 레벨과 같은지 확인(10) (비교연산자)
        boolean isLevelSame = playerL == 10;
        System.out.println("특정 레벨과 같다: " + isLevelSame);

        // 6. 플레이어 레벨이 특정 레벨과 다른지 확인(10) (비교연산자)
        boolean isLevelError = playerL != 10;
        System.out.println("특정 레벨과 다르다: " + isLevelError);


    } //end of main
} //end of class
