package repository;


import java.util.*;
import dto.StudentDTO;

public class StudentRepository {


    // 학생정보를 저장할 리스트
    private List<StudentDTO> studentDTOList = new ArrayList<>();
        public boolean save(StudentDTO studentDTO) {
            // id값을 하나씩 증가시켜 함께 저장
            int size = studentDTOList.size();
            studentDTO.setId((long) (size+1));
            // 리스트에 신규학생 추가
            return studentDTOList.add(studentDTO); // add는 boolean타입

//            try {
//                studentDTOList.add(studentDTO);
//                return true;
//            } catch (Exception e){
//                return false;
//            }
//        }

    // 학생정보 리스트
    public List<StudentDTO> findAll(){
            return studentDTOList;
    }

}
