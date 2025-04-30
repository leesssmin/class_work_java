package MyTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test1 extends JFrame implements ActionListener {

    private JButton button;

    public Test1(){
        initData();
        setInitLayout();
        addEventListener();
    }

    private void initData(){
        setTitle("랜덤 숫자");
        setSize(700,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button =new JButton("랜덤 숫자 재생하기");
    }

    private void setInitLayout(){
        add(button, BorderLayout.EAST);

        setVisible(true);
    }

    private void addEventListener(){
        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("출력해라");
    }

    // 테스트 코드
    public static void main(String[] args) {
        new Test1();
    }
}
