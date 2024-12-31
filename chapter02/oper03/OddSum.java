public class OddSum {
    public static void main(String[] args) {
        int sum = 0; // 합을 저장할 변수

        // 1부터 50까지 반복
        for (int i = 1; i <= 50; i += 2) { // 홀수만 나오도록 i를 2씩 증가시킴
            sum += i; // 홀수인 i를 sum에 더함
        }

        // 결과 출력
        System.out.println("1에서 50까지 홀수의 합: " + sum); // 출력: 625
    }
}
