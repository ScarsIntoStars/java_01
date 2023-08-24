package service;

import dto.StudentDTO;
import repository.StudentRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService {


    Scanner scanner = new Scanner(System.in);
    StudentRepository studentRepository = new StudentRepository();


    // 학생등록
    // 학생등록 메서드
    // 매개변수 없음.
    // 리턴 없음.
    // 메서드 이름: save()
    // 실행내용
    // 스캐너로 이름(studentName), 학과(studentMajor), 전화번호(studentMobile)를 입력받고
    // 입력값을 DTO객체에 담아서 StudentRepository의 save() 메서드로 전달
    public void save() {
        System.out.println("이름: ");
        String studentName = scanner.next();
        System.out.println("학과: ");
        String studentMajor = scanner.next();
        System.out.println("전화번호: ");
        String studentMobile = scanner.next();
        // DTO 객체
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setStudentName(studentName);
        studentDTO.setStudentMajor(studentMajor);
        studentDTO.setStudentMobile(studentMobile);

        // DTO 객체를 StudentRepository의 save() 메서드로 전달하여 리턴을 boolean으로 받음.
        boolean result = studentRepository.save(studentDTO);
        // repository의 save() 내용
        // 넘겨받은 dto 객체를 리스트에 추가하고 추가하면 true 리턴
        if (result) {
            System.out.println("등록 성공");
            System.out.println(studentRepository.findAll());
        } else {
            System.out.println("등록 실패");
        }
    }

    // 학생목록출력
    public void findAll() {
        // - Repository의 findAll 메서드를 호출하여 리스트를 리턴받음.
        List<StudentDTO> studentDTOList = studentRepository.findAll();
        for (StudentDTO studentDTO : studentDTOList) {
            System.out.println("studentDTO = " + studentDTO);
        }
//        for (int i=0; i<studentDTOList.size(); i++) {
//            System.out.println(studentDTOList.get(i));
//        }
    }

    /*
        findAll() 메서드
        Main에서 3번 선택시 호출되는 메서드
        매개변수 리턴 없음.
        실행내용
          - Repository의 findAll 메서드를 호출하여 리스트를 리턴받음.
          - 리턴받은 리스트에 담긴 데이터를 for문을 이용하여 출력함.
     */

    // 학생정보조회
    public void findById() {
        System.out.println("StudentService.findById");

        // 조회기능 선택 시 목록을 먼저 보여줌
        // 서비스클래스에서 정의한 findAll 호출
        findAll();

        System.out.print("수정 할 학생의 Id를 입력하시오 > ");
        long id = scanner.nextLong();
        // 입력받은 id를 repository로 넘겨서 DTO객체를 리턴받음
        StudentDTO studentDTO = studentRepository.findById(id);
        // 조회결과 출력
        if (studentDTO == null) {
            System.out.println("찾는 정보가 없읍니다.");
        } else {
            // 조회 결과 출력
            System.out.println("조회학생 정보 : " + studentDTO);
        }

    }

    public void update() {
        System.out.print("수정 할 id를 입력하시오 > ");
        long id = scanner.nextLong();
        boolean nofind = true;
        for (StudentDTO studentDTO : studentRepository.findAll()) {
            if (id == studentDTO.getId()) {
                System.out.print("수정할 이름 입력 > ");
                String newName = scanner.next();
                studentDTO.setStudentName(newName);
                System.out.print("수정할 전공 입력 > ");
                String newMajor = scanner.next();
                studentDTO.setStudentMajor(newMajor);
                System.out.print("수정할 전화번호 입력 > ");
                String newMobile = scanner.next();
                studentDTO.setStudentMobile(newMobile);
                studentRepository.update(studentDTO);

                findAll();
            } else { // 0번 인덱스가 들어갈 때 없다고 뜸 수정해야됨

            }
        }

    }

    // 학생 삭제
    pubilc void delete(){

    }

}






