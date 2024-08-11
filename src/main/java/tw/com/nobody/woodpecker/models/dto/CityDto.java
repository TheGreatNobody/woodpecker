package tw.com.nobody.woodpecker.models.dto;

import lombok.Data;
import org.springframework.stereotype.Repository;

@Data
@Repository
public class CityDto {

    private Integer id;

    private String name;

    private String CountryCode;

    private String District;

    private Integer Population;
}
