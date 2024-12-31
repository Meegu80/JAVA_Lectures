// com.javalab.oper03 패키지 선언
package com.javalab.oper03;

// Scanner 클래스 import
import java.util.Scanner;

// ForEx01_02 클래스 정의
public class ForEx01_03 {
    // 프로그램의 진입점인 main 메소드
    public static void main(String[] args) {
        // GUGUDAN 메소드 호출
        GUGUDAN();
    }

    // 구구단을 처리하는 GUGUDAN 메소드
    static void GUGUDAN() {
        // Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);
        int dan = 0; // 사용자가 입력할 구구단의 단

        // 올바른 입력을 받을 때까지 반복하는 while 루프
        while (true) {
            // 사용자에게 구구단의 단 입력 요청
            System.out.print("출력할 구구단의 단을 입력하세요 (2-19): ");
            dan = scanner.nextInt(); // 사용자 입력 받기

            // 입력값이 유효한 범위인지 확인
            if (dan >= 2 && dan <= 19) {
                break; // 유효한 입력이면 루프 탈출
            } else {
                // 유효하지 않은 입력에 대한 오류 메시지 출력
                System.out.println("2에서 19 사이의 숫자를 입력해주세요.");
            }
        }

        // 선택된 단의 구구단 출력 시작
        System.out.println(dan + "단 구구단:");
        // 1부터 9까지 곱하는 for 루프
        for (int i = 1; i <= 9; i++) {
            int result = dan * i; // 곱셈 결과 계산
            // 구구단 한 줄 출력
            System.out.println(dan + " * " + i + " = " + result);
        }

        // Scanner 객체 닫기
        scanner.close();
    }
}
