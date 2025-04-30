package com.association;

public class Player {

    private String name;
    private BaseBallTeam baseBallTeam;

    public Player(String name) {
        this.name = name;
    }
    //경기를 하다
    public void play(BaseBallTeam baseBallTeam) {
        this.baseBallTeam = baseBallTeam;
        System.out.println(name + "가" + baseBallTeam.getName() + "경기를 합니다");
    }

    //야구팀의 현재 경기 상태를 보여주는 기능
    public void showBaseballTeam() {
        if (this.baseBallTeam != null) {
            System.out.println(name + "이(가)" + this.baseBallTeam.getName() + "경기 중");
        } else {
            System.out.println("진행중인 경기가 없습니다");
        }
    }
}



