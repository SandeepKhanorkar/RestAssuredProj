
package DemoProject.MyCountryProject;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)

@JsonIgnoreProperties(ignoreUnknown=true)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class CountryVO {

@JsonProperty("name")
public String name;
@JsonProperty("topLevelDomain")
public List<String> topLevelDomain = null;
@JsonProperty("alpha2Code")
public String alpha2Code;
@JsonProperty("alpha3Code")
public String alpha3Code;
@JsonProperty("callingCodes")
public List<String> callingCodes = null;
@JsonProperty("capital")
public String capital;
@JsonProperty("altSpellings")
public List<String> altSpellings = null;
@JsonProperty("region")
public String region;
@JsonProperty("subregion")
public String subregion;
@JsonProperty("population")
public Integer population;
@JsonProperty("latlng")
public List<Integer> latlng = null;
@JsonProperty("demonym")
public String demonym;
@JsonProperty("area")
public Integer area;
@JsonProperty("gini")
public Float gini;
@JsonProperty("timezones")
public List<String> timezones = null;
@JsonProperty("borders")
public List<String> borders = null;
@JsonProperty("nativeName")
public String nativeName;
@JsonProperty("numericCode")
public String numericCode;
@JsonProperty("currencies")
public List<Currency> currencies = null;
@JsonProperty("languages")
public List<Language> languages = null;
@JsonProperty("translations")
public Translations translations;
@JsonProperty("flag")
public String flag;
@JsonProperty("regionalBlocs")
public List<RegionalBloc> regionalBlocs = null;
@JsonProperty("cioc")
public String cioc;

}


