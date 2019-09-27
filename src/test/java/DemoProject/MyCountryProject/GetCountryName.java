package DemoProject.MyCountryProject;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.with;
import static org.hamcrest.CoreMatchers.instanceOf;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class GetCountryName {
	public static RequestSpecification requestSpecification;
    public static Response response;

	@Test()
	public void getName() throws Exception {
		System.out.println("Hello");

		//logger.info("Get User Status Api call");
		//Response coiuntries = getCountry();
		requestSpecification = getBaseURI();
		CountryVO[] c = getCountry();
		
		
		//CountryVO[] c = coiuntries.jsonPath().getObject("", CountryVO[].class);
		System.out.println(c.length);
		
		writeToFile(c);
		//return response;

	}
	
	public RequestSpecification getBaseURI()
	{
		//requestSpecification = SerenityRest.rest();
        String baseUri = "https://restcountries.eu";
        requestSpecification=with().baseUri(baseUri);
        System.out.println(baseURI);
        return requestSpecification;
	}
	
	public CountryVO[] getCountry()
	{
		//final Response response
		Response response=   given(requestSpecification)
				//                .pathParam("productId", productId)
				//                .queryParam("userid",queryParam.get("userid"))
				//                .contentType(ContentType.JSON)
				.log().all()
				.get("/rest/v2/all");
		//response.prettyPrint();
		return response.as(CountryVO[].class);
	}
	public void writeToFile(CountryVO[] country)
	{
		try {
            FileWriter writer = new FileWriter("countries.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for(int i=0;i<country.length;i++)
            {
            	
            	String name = country[i].getName();
            	System.out.println(name);
            	bufferedWriter.write(country[i].getName());
            	bufferedWriter.newLine();
            	//filewriter.write("\r\n");
            }
            
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        } 
	}
}
