// com.javalab.var01 패키지 선언
package com.javalab.var01;

// Scope01이라는 이름의 공개 클래스 선언
public class Scope01 {
    // 프로그램의 진입점인 main 메소드 선언
    public static void main(String[] args) {
        // 정수형 변수 x를 선언하고 10으로 초기화
        int x = 10;

        // if 문 시작 (항상 true이므로 무조건 실행됨)
        if(true){
            // if 블록 내에서 x 값을 출력
            System.out.println("x = " + x);
        }

        // if 블록 외부에서 x 값을 출력
        System.out.println("x = " + x);
    }
}
