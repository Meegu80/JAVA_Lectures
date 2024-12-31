// com.javalab.oper03 패키지 선언
package com.javalab.oper03;

// ForEx01이라는 이름의 공개 클래스 선언
public class ForEx01 {
    // 프로그램의 진입점인 main 메소드 선언
    public static void main(String[] args) {
        // GUGUDAN 메소드 호출, 인자로 2를 전달 (2단 출력)
        GUGUDAN(2);
    }

    // GUGUDAN 메소드 정의
    // 정적(static) 메소드로, 특정 단의 구구단을 출력
    static void GUGUDAN(int dan) {
        // for 루프: i는 1부터 9까지 반복
        for (int i = 1; i <= 9; i++) {
            // 현재 단(dan)과 i를 곱한 결과를 result에 저장
            int result = dan * i;
            // 구구단 형식으로 결과 출력
            System.out.println(dan + " * " + i + " = " + result);
        }
    }
}

// 실행 결과:
// 2 * 1 = 2
// 2 * 2 = 4
// 2 * 3 = 6
// 2 * 4 = 8
// 2 * 5 = 10
// 2 * 6 = 12
// 2 * 7 = 14
// 2 * 8 = 16
// 2 * 9 = 18
