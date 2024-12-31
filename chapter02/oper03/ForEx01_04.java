// com.javalab.oper03 패키지 선언
package com.javalab.oper03;

// Scanner 클래스 import
import java.util.Scanner;

// ForEx01_04 클래스 정의
public class ForEx01_04 {
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

        // 최대 3번의 입력 기회를 주는 for 루프
        for (int attempt = 1; attempt <= 3; attempt++) {
            // 사용자에게 구구단의 단 입력 요청
            System.out.print("출력할 구구단의 단을 입력하세요 (2-19): ");
            dan = scanner.nextInt(); // 사용자 입력 받기
            
            // 입력값이 유효한 범위인지 확인
            if (dan >= 2 && dan <= 19) {
                break; // 유효한 입력이면 루프 탈출
            } else {
                // 유효하지 않은 입력에 대한 오류 메시지 출력
                System.out.println("2에서 19 사이의 숫자를 입력해주세요.");
                // 3번째 시도에서도 실패하면 프로그램 종료
                if (attempt == 3) {
                    System.out.println("3번의 기회를 모두 사용하셨습니다. 프로그램을 종료합니다.");
                    scanner.close(); // Scanner 객체 닫기
                    return; // 메소드 종료
                }
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
