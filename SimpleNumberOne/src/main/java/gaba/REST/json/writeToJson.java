package gaba.REST.json;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class writeToJson {

	public static void main(String[] args) {
	try {
	ObjectMapper mapper = new ObjectMapper();
	Person thePerson=mapper.readValue(new File("jsonData/infos.json"), Person.class);
	System.out.println(thePerson.getAge());
	System.out.println(thePerson.getName());
	  }
	catch(Exception e) {
	e.printStackTrace();
	  }
	}
}
