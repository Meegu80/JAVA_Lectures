// com.javalab.var02 패키지 선언
package com.javalab.var02;

// printExample이라는 이름의 공개 클래스 선언
public class printExample {
    // 프로그램의 진입점인 main 메소드 선언
    public static void main(String[] args) {
        // 정수형 변수 value를 선언하고 1234로 초기화
        int value = 1234;

        // 기본 출력 형식
        System.out.printf("상품의 가격 :%d원\n", value);

        // 6자리 고정 너비로 오른쪽 정렬하여 출력
        System.out.printf("상품의 가격 :%6d원\n", value);

        // 6자리 고정 너비로 왼쪽 정렬하여 출력
        System.out.printf("상품의 가격 :%-6d원\n", value);

        // 6자리로 출력하되, 빈 자리는 0으로 채움
        System.out.printf("상품의 가격 :%06d원\n", value);

        // 천 단위 구분 기호(,)를 사용하여 출력
        System.out.printf("상품의 가격 :%,d원\n", value);
    }
}

// 실행 결과:
// 상품의 가격 :1234원
// 상품의 가격 :  1234원
// 상품의 가격 :1234  원
// 상품의 가격 :001234원
// 상품의 가격 :1,234원
