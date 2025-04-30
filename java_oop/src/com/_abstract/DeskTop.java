package com._abstract;

public abstract class DeskTop extends Computer {

    public void Desktop(){
        System.out.println("디스플레이");
    }
    @Override
    public void typing() {
        System.out.println("타자를 칩니다");
    }
}
