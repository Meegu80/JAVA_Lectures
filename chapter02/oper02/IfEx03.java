package com.javalab.oper02;

public class IfEx03 {
    public static void main(String[] args) {
        // 1부터 6까지의 랜덤 값을 생성
        int dv = (int)(Math.random() * 6) + 1; // Math.random()은 0과 1 사이의 랜덤 실수, * 6을 해서 0~5 사이의 값, + 1로 1~6 사이의 값으로 만듬
        System.out.println("주사위의 값 = " + dv); // 주사위 값 출력

        // switch-case 구문을 사용하여 주사위 값에 따른 메시지 출력
        switch (dv) {
            case 1:
                System.out.println("1번이 나왔습니다."); // 1번이 나왔을 때 출력
                break;
            case 2:
                System.out.println("2번이 나왔습니다."); // 2번이 나왔을 때 출력
                break;
            case 3:
                System.out.println("3번이 나왔습니다."); // 3번이 나왔을 때 출력
                break;
            case 4:
                System.out.println("4번이 나왔습니다."); // 4번이 나왔을 때 출력
                break;
            case 5:
                System.out.println("5번이 나왔습니다."); // 5번이 나왔을 때 출력
                break;
            case 6:
                System.out.println("6번이 나왔습니다."); // 6번이 나왔을 때 출력
                break;
            default:
                System.out.println("유효하지 않은 값입니다."); // default는 예외 처리를 위해 추가
        }
    }
}
