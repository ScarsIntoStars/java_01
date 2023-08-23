package repository;


import java.util.*;
import dto.StudentDTO;

public class StudentRepository {
    // 학생정보를 저장할 리스트

    private List<StudentDTO> studentDTOList = new ArrayList<>();
        public boolean save(StudentDTO studentDTO) {

            try {
                studentDTOList.add(studentDTO);
                return true;
            }catch (Exception e){
                return false;
            }
        }




}
