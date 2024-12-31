package com.javalab.oper03;

public class ForEx02 {
    public static void main(String[] args) {
        // 2단부터 9단까지 출력하는 중첩된 for문
        for (int i = 2; i <= 9; i++) { // 2부터 9까지의 곱셈 단
            for (int j = 1; j <= 9; j++) { // 1부터 9까지 곱할 값
                int result = i * j; // 곱셈 결과 계산
                System.out.printf(i + " * " + j + " = %2d  ", result); // 결과 출력, %2d는 2자리로 맞춰서 출력
            }
            System.out.println(); // 한 단이 끝나면 줄바꿈
        }
    }
}
