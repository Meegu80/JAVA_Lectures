package com.javalab.var03; // 패키지 선언

import java.util.Scanner; // Scanner 클래스 import

public class ScannerEx02 { // ScannerEx02 클래스 선언
    public static void main(String[] args) { // main 메소드 시작
        Scanner scan = new Scanner(System.in); // Scanner 객체 생성
        String input; // 사용자 입력을 저장할 변수 선언

        while (true) { // 무한 루프 시작
            printMenu(); // 메뉴 출력 메소드 호출
            System.out.print("메뉴를 선택해주세요: "); // 사용자에게 메뉴 선택 요청
            input = scan.nextLine().trim().toLowerCase(); // 사용자 입력 받기 및 전처리

            if (input.equals("q")) { // 'q' 입력 시 프로그램 종료 조건
                System.out.println("프로그램을 종료합니다."); // 종료 메시지 출력
                break; // 루프 탈출
            }

            switch (input) { // 사용자 입력에 따른 분기 처리
                case "1": // 메뉴 1 선택 시
                    System.out.println("메뉴 1을 선택하셨습니다."); // 메뉴 1 선택 메시지 출력
                    break; // switch 문 탈출
                case "2": // 메뉴 2 선택 시
                    System.out.println("메뉴 2를 선택하셨습니다."); // 메뉴 2 선택 메시지 출력
                    break; // switch 문 탈출
                default: // 잘못된 입력 시
                    System.out.println("잘못된 선택입니다. 다시 선택해주세요."); // 오류 메시지 출력
            }
            System.out.println(); // 빈 줄 추가로 가독성 향상
        }
        scan.close(); // Scanner 객체 닫기
    }

    public static void printMenu() { // 메뉴 출력 메소드
        System.out.println("=== 메뉴 ==="); // 메뉴 시작 구분선 출력
        System.out.println("1. 메뉴 1"); // 메뉴 1 항목 출력
        System.out.println("2. 메뉴 2"); // 메뉴 2 항목 출력
        System.out.println("q. 종료"); // 종료 옵션 출력
        System.out.println("==========="); // 메뉴 종료 구분선 출력
    }
}
