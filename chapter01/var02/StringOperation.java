// com.javalab.var02 패키지 선언
package com.javalab.var02;

// StringOperation이라는 이름의 공개 클래스 선언
public class StringOperation {
    // 프로그램의 진입점인 main 메소드 선언
    public static void main(String[] args) {
        // 숫자 연산 후 문자열 연결: 1과 2를 더한 후 "Hello"와 연결
        System.out.println(1 + 2 + "Hello");

        // 문자열이 먼저 나오면 이후 모든 연산자는 문자열 연결로 처리
        System.out.println("Hello" + 1 + 2);

        // 괄호를 사용하여 숫자 연산의 우선순위를 높임
        System.out.println("Hello" + (1 + 2));

        // 문자열로 된 수량을 정수로 변환하여 계산
        String quantity = "5";
        int unitPrice = 1000;
        // Integer.parseInt()를 사용하여 문자열을 정수로 변환 후 계산
        int totalPrice = Integer.parseInt(quantity) * unitPrice;
        System.out.println("총 금액 :  " + totalPrice + "원");

        // 문자열로 된 원주율을 실수로 변환하여 계산
        String piStr = "3.141592";
        // Double.parseDouble()을 사용하여 문자열을 실수로 변환
        double pi = Double.parseDouble(piStr);
        double radius = 10.0;
        // 원의 넓이 계산: π * r^2
        double circleArea = pi * radius * radius;
        System.out.println("원의 넓이 : " + circleArea);
    }
}

// 실행 결과:
// 3Hello
// Hello12
// Hello3
// 총 금액 :  5000원
// 원의 넓이 : 314.1592
