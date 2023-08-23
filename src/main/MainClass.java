package main;

import service.StudentService;

import java.util.Scanner;

public class MainClass {
    // 스캐너를 이용하여
    // 1. 학생등록
    // 2. 학생상세조회
    // 3. 학생목록조회
    // 를 선택하는 코드를 작성합니다.

    // psvm: 메인메서드
    public static void main(String[] args) {
        StudentService studentService = new StudentService();

        // new Scanner(System.in) 입력 후 art + enter 하면 좌변을 만들어 줌
        while(true){
            System.out.print("1. 학생등록 2. 학생조회 3. 학색목록 0. 종료 > ");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();

            if(num==0){
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if(num == 1) {
                System.out.println("학생등록 메뉴입니다.");
                studentService.save();
            } else if (num == 2) {
                System.out.println("학생상세조회입니다.");
                /*
                service의 findById
                - id값을 입력받고, repository의 findById로 id값을 넘김
                - 입력받은 id에 해당하는 학생 데이터를 리턴받음(일치하는 것 찾기)
                - 리턴받은 값을 출력함
                 */
            } else if (num == 3) {
                System.out.println("학생목록조회입니다!");
                studentService.findAll();
            } else {
                System.out.println("1, 2, 3만 입력가능합니다!");
            // ctrl + d 코드복사
            }
        }
    }

}
