package com.javalab.var03;

import java.util.Scanner;

public class InStream {
    public static void main(String[] args) {
        // 입력 스트림 준비
        Scanner scan = new Scanner(System.in, "UTF-8");

        System.out.println("문자열을 입력해주세요."); // 한글 입력 안내
        // 한글입력시 UTF-8 세팅해둘것, 중요합니다

        // 사용자로부터 한 줄 입력 받기
        String inputString = scan.nextLine();
        System.out.println("입력한 문자열 : " + inputString); // 입력된 문자열 출력

        scan.close(); // Scanner 닫기
    }
}
