package ch03;

/**
 * 논리 연산자 복습
 */
public class Operation6 {

    // 메인 함수(코드의 진입점)
    public static void main(String[] args) {

        // 쇼핑몰 회원 정보를 설정

        int userAge = 22;  // 사용자 나이
        int cartTotal = 50_000; //장바구니 총액 (원)
        //System.out.println(cartTotal);
        boolean isMember = true;  //회원 여부
        int couponCount = 2;  //보유 쿠폰 개수

        // 1. 무료 배송 조건 : 장바구니 총액이 3만원 이상이고 회원이어야 한다.
        boolean freeShipping = (cartTotal >= 30_000) && isMember;
        System.out.println("무료 배송 가능 여부: " + freeShipping);

        // 2. 할인 조건: 나이가 19세 이상이거나 쿠폰이 1개 이상 있어야 함.
        boolean canDiscount = (userAge >= 19) || (couponCount > 0);
        System.out.println("할인 여부: " + canDiscount);

        // 3. 구매 제한 조건 : 나이가 만 19세미만이고 회원이 아닌경우 ->&&
        boolean purchaseRestricted = (userAge < 19) && !isMember;

        // 4. 이벤트 참여 조건 : 장바구니 총액이 5만원 미만이거나 쿠폰이 3개미만 참여 가능
        boolean canJoinEvent = (cartTotal < 50000) || (couponCount < 3);
        System.out.println("이벤트 참여 가능 여부: " + canJoinEvent);

        //연습문제
        // 직접 문제 만들고 식을 세워서 출력
        // 파티에 입장 할수 있는 나이는 20살 이상이고 남자는 키 170 이상 여자는 160이상만 출입가능하다
        int partyAge = 21;
        int manCm = 179;
        int womenCm =161;

        // 1. 남자 입장 조건
        boolean manOk = (partyAge >=20) && (manCm >= 170);
        System.out.println("남자 입장 여부: " + manOk);

        // 2. 여자 입장 조건


    } //end of main
} //end of class
