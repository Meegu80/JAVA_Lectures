// com.javalab.oper03 패키지 선언
package com.javalab.oper03;

// Scanner 클래스 import
import java.util.Scanner;

// ForEx01 클래스 정의
public class ForEx01_02 {
    // 프로그램의 진입점인 main 메소드
    public static void main(String[] args) {
        // GUGUDAN 메소드 호출
        GUGUDAN();
    }

    // 구구단을 처리하는 GUGUDAN 메소드
    static void GUGUDAN() {
        // Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);
        int dan;

        // 사용자로부터 유효한 입력을 받을 때까지 반복
        do {
            System.out.print("출력할 구구단의 단을 입력하세요 (2-19): ");
            // 사용자 입력 받기
            dan = scanner.nextInt();
            // 입력값이 범위를 벗어나면 오류 메시지 출력
            if (dan < 2 || dan > 19) {
                System.out.println("2에서 19 사이의 숫자를 입력해주세요.");
            }
        } while (dan < 2 || dan > 19);

        // 선택된 단의 구구단 출력
        System.out.println(dan + "단 구구단:");
        for (int i = 1; i <= 9; i++) {
            int result = dan * i;
            System.out.println(dan + " * " + i + " = " + result);
        }

        // Scanner 객체 닫기
        scanner.close();
    }
}
