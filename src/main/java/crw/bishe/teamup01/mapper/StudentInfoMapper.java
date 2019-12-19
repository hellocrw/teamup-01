package crw.bishe.teamup01.mapper;

import crw.bishe.teamup01.entity.StudentInfo;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.Mapping;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface StudentInfoMapper extends Mapper<StudentInfo> {
    @Select("select * from student_info")
    List<StudentInfo> selectStu();
    @Select("select * from student_info where id = #{id}")
    StudentInfo getById(int id);
}
