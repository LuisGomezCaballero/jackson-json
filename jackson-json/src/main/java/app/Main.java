package app;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper mapper = new ObjectMapper();

		String jsonInputString = "{\"myString\":\"abc\", \"myInt\":123}";
		MyObject myObject = mapper.readValue(jsonInputString, MyObject.class);
		System.out.println("Java Object: " + myObject);

		String jsonOutputString = mapper.writeValueAsString(myObject);
		System.out.println("String: " + jsonOutputString);

	}

}
