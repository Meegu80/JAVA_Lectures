// com.javalab.var03 패키지 선언
package com.javalab.var03;

// Scanner 클래스를 사용하기 위한 import 문
import java.util.Scanner;

// ScannerEx라는 이름의 공개 클래스 선언
public class ScannerEx {
    // 프로그램의 진입점인 main 메소드 선언
    public static void main(String[] args) {
        // 메뉴 옵션 출력
        System.out.println("메뉴1");
        System.out.println("메뉴2");
        System.out.println("종료(q)");

        // Scanner 객체 생성 (사용자 입력을 받기 위함)
        Scanner scan = new Scanner(System.in);
        System.out.println("메뉴를 선택해주세요");
        String data;

        // 무한 루프 시작
        while(true){
            // 사용자로부터 한 줄 입력 받기
            data = scan.nextLine();
            // 입력값이 'q'인 경우 루프 종료
            if (data.equals("q")) {
                System.out.println("종료합니다");
                break;
            }
            // 'q'가 아닌 경우 선택한 메뉴 출력
            System.out.println("선택한 메뉴 : " + data);
        }
    }
}
