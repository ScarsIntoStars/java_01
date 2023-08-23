package service;

import dto.StudentDTO;
import org.w3c.dom.ls.LSOutput;
import repository.StudentRepository;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {
    StudentRepository studentRepository = new StudentRepository();
    Scanner scanner = new Scanner(System.in);
    // 학생 등록 메서드
    // 매개변수 없음
    // 리턴 없음
    // 메서드 이름: save()
    // 실행내용
    // 스캐너로 이름(studentName), 학과(studentMajor), 전화번호(studentMobile)를 입력받고
    // 입력값을 DTO객체에 담아서 StudentRepository의 save()매서드로 전달

    public void save() {
        System.out.print("이름을 입력하세요 >");
        String studentName = scanner.next();
        System.out.print("전공을 입력하세요 >");
        String studentMajor = scanner.next();
        System.out.print("전화번호를 입력하세요 >");
        String studentMobile = scanner.next();

        // DTO객체
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setStudentName(studentName);
        studentDTO.setStudentMajor(studentMajor);
        studentDTO.setStudentMobile(studentMobile);

        // DTO객체를 StudentRepository의 save()매서드로 전달하여 리턴을 boolean으로 받음
        boolean result = studentRepository.save(studentDTO);
        // repository의 save() 내용
        // 넘겨받은 dto 객체를 리스트에 추가하고, 추가하면 true 리턴

        if (result) {
            System.out.println("등록성공");
        } else {
            System.out.println("등록실패");
        }

    }

    /*
        findAll() 메서드
        Main에서 3번 선택시 호출되는 메서드
        매개변수, 리턴 없음
        실행내용
        - Repository의 findAll메서드를 호출하여 리스트를 리턴받음
        - 리턴받은 리스트에 담긴 데이터를 for문을 이용하여 출력함.
    */

    public void findAll() {
        List<StudentDTO> list = studentRepository.findAll();

        for (StudentDTO dto : list) {
            System.out.println(dto.toString());
        }
    }


}




