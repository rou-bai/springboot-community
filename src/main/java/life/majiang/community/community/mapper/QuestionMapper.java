package life.majiang.community.community.mapper;

import life.majiang.community.community.model.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface QuestionMapper {
    @Insert("insert into question(title, tag, description, createtime, modifytime, creator) values(#{title}, #{tag}, #{description}, #{createTime}, #{modifyTime}, #{creator})")
    void create(Question question);

    @Select("select * from question limit #{limit} offset #{offset}")
    List<Question> findAll(@Param(value="offset") Integer offset, @Param(value="limit") Integer limit);

    @Select("select count(1) from question")
    Integer countAll();
}
