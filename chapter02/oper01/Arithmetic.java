package com.javalab;

public class Arithmetic {
    public static void main(String[] args) {
        int a = 10; // 첫 번째 정수 변수
        int b = 20; // 두 번째 정수 변수

        // 덧셈 연산
        int c = a + b;
        System.out.println("Sum: " + c);

        // 뺄셈 연산
        int d = a - b;
        System.out.println("Difference: " + d);

        // 곱셈 연산
        int e = a * b;
        System.out.println("Product: " + e);

        // 나눗셈 연산 (결과를 double로 캐스팅)
        double f = (double) a / b;
        System.out.println("Quotient: " + f);

        // 나머지 연산
        int g = a % b;
        System.out.println("Remainder: " + g);

        System.out.println("======================================");

        int h = 5; // 변수 h를 5로 초기화

        // 후위 증가: 먼저 h의 값을 출력하고, 이후 h를 1 증가시킴
        System.out.println("h = " + h++);

        // 증가된 후 h의 값을 출력
        System.out.println("h = " + h);

        // 전위 증가: 먼저 h를 1 증가시키고, 증가된 값을 출력
        System.out.println("h = " + ++h);

        // 증가된 후 h의 값을 출력
        System.out.println("h = " + h);

        int i = 10; // 변수 i를 10으로 초기화

        // 후위 감소: 먼저 i의 값을 출력하고, 이후 i를 1 감소시킴
        System.out.println("i = " + i--);

        // 감소된 후 i의 값을 출력
        System.out.println("i = " + i);

        // 전위 감소: 먼저 i를 1 감소시키고, 감소된 값을 출력
        System.out.println("i = " + --i);

        // 감소된 후 i의 값을 출력
        System.out.println("i = " + i);
    }
}

// 실행 결과:
// Sum: 30
// Difference: -10
// Product: 200
// Quotient: 0.5
// Remainder: 10
// ======================================
// h = 5
// h = 6
// h = 7
// h = 7
// i = 10
// i = 9
// i = 8
// i = 8
