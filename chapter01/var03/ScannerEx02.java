package com.javalab.var03;

import java.util.Scanner;

public class ScannerEx02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input;

        while (true) {
            printMenu();
            System.out.print("메뉴를 선택해주세요: ");
            input = scan.nextLine().trim().toLowerCase();

            if (input.equals("q")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            switch (input) {
                case "1":
                    System.out.println("메뉴 1을 선택하셨습니다.");
                    break;
                case "2":
                    System.out.println("메뉴 2를 선택하셨습니다.");
                    break;
                default:
                    System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
            }
            System.out.println(); // 빈 줄 추가
        }
        scan.close(); // Scanner 객체 닫기
    }

    private static void printMenu() {
        System.out.println("=== 메뉴 ===");
        System.out.println("1. 메뉴 1");
        System.out.println("2. 메뉴 2");
        System.out.println("q. 종료");
        System.out.println("===========");
    }
}
