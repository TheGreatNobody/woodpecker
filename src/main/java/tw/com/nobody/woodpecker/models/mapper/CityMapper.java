package tw.com.nobody.woodpecker.models.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tw.com.nobody.woodpecker.models.dto.CityDto;

@Repository
public interface CityMapper {

    @Select("SELECT * FROM CITY WHERE ID = #{id}")
    CityDto findById(@Param("id")Integer id);
}
