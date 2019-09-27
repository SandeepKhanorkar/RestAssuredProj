package DemoProject.MyCountryProject;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import DemoProject.MyCountryProject.CountryVO.CountryVOBuilder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"acronym",
"name",
"otherAcronyms",
"otherNames"
})
@JsonIgnoreProperties(ignoreUnknown=true)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class RegionalBloc {

@JsonProperty("acronym")
public String acronym;
@JsonProperty("name")
public String name;
@JsonProperty("otherAcronyms")
public List<Object> otherAcronyms = null;
@JsonProperty("otherNames")
public List<Object> otherNames = null;

}



