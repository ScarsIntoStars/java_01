package repository;

import dto.StudentDTO;
import service.StudentService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentRepository {
    // 학생정보를 저장할 리스트
    private List<StudentDTO> studentDTOList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public boolean save(StudentDTO studentDTO) {
        // id 값을 하나씩 증가시켜 함께 저장
        // (현재 리스트에 저장된 학생수 가져오고 1증가하여 저장)
        int size = studentDTOList.size();
        studentDTO.setId((long) (size + 1));
        // 리스트에 신규학생 추가
        return studentDTOList.add(studentDTO);
    }

    public List<StudentDTO> findAll() {
        return studentDTOList;
    }

    // 학생정보조회
    public StudentDTO findById(long id) {
        // foreach
        for (StudentDTO studentDTO : studentDTOList) {
            // id와 일치하는 결과를 찾으면 해당 DTO 객체를 리턴
            if (id == studentDTO.getId()) {
                return studentDTO;
            }
        }

        // for
//       for(int i =0; i<studentDTOList.size(); i++){
//            if(id == studentDTOList.get(i).getId()) {
//                return studentDTOList.get(i);
//            }
//        }

        // 반복문을 돌려서 일치하는 결과가 없으면 null리턴
        return null;
    }

    // 학생정보수정
    public void update(StudentDTO studentDTO) {
        for (StudentDTO studentDTO1 : studentDTOList) {
            if (studentDTO.getId() == studentDTO1.getId()) {
                studentDTO1.setStudentName(studentDTO.getStudentName());
                studentDTO1.setStudentMajor(studentDTO.getStudentMajor());
                studentDTO1.setStudentMobile(studentDTO.getStudentMobile());

            }
        }
    }
}








