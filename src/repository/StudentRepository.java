package repository;

import dto.StudentDTO;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    // 학생정보를 저장할 리스트
    private List<StudentDTO> studentDTOList = new ArrayList<>();

    public boolean save(StudentDTO studentDTO) {

        return studentDTOList.add(studentDTO);
    }

    public List<StudentDTO> findAll() {
        return studentDTOList;
    }

    public StudentDTO findById(long id) {
        // foreach
        for (StudentDTO studentDTO : studentDTOList) {
            // id와 일치하는 결과를 찾으면 해당 DTO 객체를 리턴
            if (id == studentDTO.getId()) {
                return studentDTO;
            }
        }

        // for
//        for(int i = 0; i< studentDTOList.size(); i++) {
//            if (id == studentDTOList.get(i).getId()) {
//                return studentDTOList.get(i);
//            }
//        }

        // 반복문을 돌려서 일치하는 결과가 없으면 null 리턴
        return null;
    }

    public void delete(long id) {
//        for (int i = 0; i < studentDTOList.size(); i++) {
//            if (id == studentDTOList.get(i).getId()) {
//                studentDTOList.remove(i);
//            }
//        }
        for (StudentDTO studentDTO : studentDTOList) {
            if (id == studentDTO.getId()) {
                studentDTOList.remove(studentDTO);
            }
        }
    }

    public void update(long id, String updateMobile) {
        for (StudentDTO studentDTO : studentDTOList) {
            if (id == studentDTO.getId()) {
                studentDTO.setStudentMobile(updateMobile);
            }
        }
    }
}