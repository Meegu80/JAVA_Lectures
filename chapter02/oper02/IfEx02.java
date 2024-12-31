package com.javalab.oper02;

public class IfEx02 {
    public static void main(String[] args) {
        // 1부터 6까지의 랜덤 값을 생성
        int dv = (int)(Math.random() * 6) + 1; // Math.random()은 0과 1 사이의 랜덤 실수, * 6을 해서 0~5 사이의 값, + 1로 1~6 사이의 값으로 만듬
        System.out.println("주사위의 값 = " + dv); // 주사위 값 출력

        // dv가 1일 때
        if (dv == 1) {
            System.out.println("1번이 나왔습니다."); // 1번이 나왔을 때 출력
        }
        // dv가 2일 때
        else if (dv == 2) {
            System.out.println("2번이 나왔습니다."); // 2번이 나왔을 때 출력
        }
        // dv가 3일 때
        else if (dv == 3) {
            System.out.println("3번이 나왔습니다."); // 3번이 나왔을 때 출력
        }
        // dv가 4일 때
        else if (dv == 4) {
            System.out.println("4번이 나왔습니다."); // 4번이 나왔을 때 출력
        }
        // dv가 5일 때
        else if (dv == 5) {
            System.out.println("5번이 나왔습니다."); // 5번이 나왔을 때 출력
        }
        // dv가 6일 때
        else if (dv == 6) {
            System.out.println("6번이 나왔습니다."); // 6번이 나왔을 때 출력
        }
    }
}
