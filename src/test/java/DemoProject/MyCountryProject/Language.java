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
"iso639_1",
"iso639_2",
"name",
"nativeName"
})
@JsonIgnoreProperties(ignoreUnknown=true)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class Language {

@JsonProperty("iso639_1")
public String iso6391;
@JsonProperty("iso639_2")
public String iso6392;
@JsonProperty("name")
public String name;
@JsonProperty("nativeName")
public String nativeName;

}



