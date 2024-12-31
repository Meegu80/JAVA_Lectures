// com.javalab.oper02 패키지 선언
package com.javalab.oper02;

// IfEx01이라는 이름의 공개 클래스 선언
public class IfEx01 {
    // 프로그램의 진입점인 main 메소드 선언
    public static void main(String[] args) {
        // 정수형 변수 a를 선언하고 15로 초기화
        int a = 15;

        // if-else if-else 조건문 시작
        if (a > 0) {
            // a가 0보다 큰 경우 실행되는 코드 블록
            System.out.println("a는 양수입니다.");
        } else if (a < 0) {
            // a가 0보다 작은 경우 실행되는 코드 블록
            System.out.println("a는 음수입니다.");
        } else {
            // a가 0인 경우 실행되는 코드 블록
            System.out.println("a는 0입니다.");
        }
    }
}

// 실행 결과:
// a는 양수입니다.
