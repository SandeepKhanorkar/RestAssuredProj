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
"de",
"es",
"fr",
"ja",
"it",
"br",
"pt",
"nl",
"hr",
"fa"
})
@JsonIgnoreProperties(ignoreUnknown=true)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class Translations {

@JsonProperty("de")
public String de;
@JsonProperty("es")
public String es;
@JsonProperty("fr")
public String fr;
@JsonProperty("ja")
public String ja;
@JsonProperty("it")
public String it;
@JsonProperty("br")
public String br;
@JsonProperty("pt")
public String pt;
@JsonProperty("nl")
public String nl;
@JsonProperty("hr")
public String hr;
@JsonProperty("fa")
public String fa;

}