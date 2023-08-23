package main;

import java.util.Scanner;

public class MainClass {
    // 스캐너를 이용하여
    // 1. 학생등록
    // 2. 학생상세조회
    // 3. 학생목록조회
    // 를 선택하는 코드를 작성합니다.

    // psvm: 메인메서드
    public static void main(String[] args) {

        // new Scanner(System.in) 입력 후 art + enter 하면 좌변을 만들어 줌
        while(true){
            System.out.print("1. 학생등록 2. 학생조회 3. 학색목록 0. 종료 > ");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();

            if(num==0){
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if(num == 1) {
                System.out.println("학생등록입니다.");
            } else if (num == 2) {
                System.out.println("학생상세조회입니다.");
            } else if (num == 3) {
                System.out.println("학생목록조회입니다");
            } else {
                System.out.println("1, 2, 3만 입력가능합니다");
            // ctrl + d 코드복사
            }
        }
    }

}
