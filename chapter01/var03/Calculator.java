import java.util.Scanner; // Scanner 클래스를 사용하기 위해 import

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 사용자 입력을 받기 위한 Scanner 객체 생성

        System.out.println("=== 간단한 계산기 ===");
        System.out.print("첫 번째 숫자를 입력하세요: ");
        double num1 = scanner.nextDouble(); // 첫 번째 숫자 입력받기

        System.out.print("연산자를 입력하세요 (+, -, *, /): ");
        char operator = scanner.next().charAt(0); // 연산자 입력받기 (문자 하나만)

        System.out.print("두 번째 숫자를 입력하세요: ");
        double num2 = scanner.nextDouble(); // 두 번째 숫자 입력받기

        double result = 0; // 계산 결과를 저장할 변수
        boolean isValid = true; // 연산의 유효성을 판단하는 변수

        // 연산자에 따라 다른 계산을 수행하는 switch 문
        switch (operator) {
            case '+': // 덧셈 연산
                result = num1 + num2;
                break;
            case '-': // 뺄셈 연산
                result = num1 - num2;
                break;
            case '*': // 곱셈 연산
                result = num1 * num2;
                break;
            case '/': // 나눗셈 연산
                if (num2 != 0) { // 0으로 나누는 경우를 방지
                    result = num1 / num2;
                } else {
                    System.out.println("0으로 나눌 수 없습니다."); // 0으로 나눌 때 오류 메시지 출력
                    isValid = false; // 연산이 유효하지 않음을 표시
                }
                break;
            default: // 잘못된 연산자 입력 시 처리
                System.out.println("잘못된 연산자입니다."); // 오류 메시지 출력
                isValid = false; // 연산이 유효하지 않음을 표시
        }

        // 연산이 유효한 경우 결과를 출력
        if (isValid) {
            System.out.println("결과: " + result);
        }

        scanner.close(); // Scanner 객체 닫기
    }
}
