package com._static;

public class Card {
    private int id;

    public static int cardNumber;

    public Card(int id) {
        this.id = id;
        this.cardNumber = 1;
    }

    public void cardNumber() {
        System.out.println(id + "이 카드의 번호는 : " + cardNumber);
        cardNumber++;
    }

    //메인 함수
    public static void main(String[] args) {
        //코드 테스트는 여기서 해주세요
        int a = 10;

        Card c1 = new Card(1);
        Card c2 = new Card(2);

        c1.cardNumber();
        c2.cardNumber();
        c1.cardNumber();
        c2.cardNumber();
        c1.cardNumber();
    }
}
