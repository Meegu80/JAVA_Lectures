public class EvenOddSum {
    public static void main(String[] args) {
        int evenSum = 0; // 짝수의 합을 저장할 변수
        int oddSum = 0;  // 홀수의 합을 저장할 변수

        // 1부터 50까지 반복
        for (int i = 1; i <= 50; i++) { // 1부터 50까지 반복
            if (i % 2 == 0) { // i가 짝수일 때
                evenSum += i; // 짝수인 i를 evenSum에 더함
            } else { // i가 홀수일 때
                oddSum += i; // 홀수인 i를 oddSum에 더함
            }
        }

        // 결과 출력
        System.out.println("1에서 50까지 짝수의 합: " + evenSum); // 출력: 650
        System.out.println("1에서 50까지 홀수의 합: " + oddSum);  // 출력: 625
    }
}
