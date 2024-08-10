package tw.com.nobody.woodpecker.api.ao;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SampleRespAo {

    @JsonProperty("Name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String name;

    @JsonProperty("Age")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer age;

    @JsonProperty("Address")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String address;

    @JsonProperty("Sex")
    private String sex;

    @JsonIgnore
    private String job;
}
