package gaba.REST.json;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class readFromJson {

	public static void main(String[] args) {
    try {
    ObjectMapper mapper = new ObjectMapper();
    Person thePerson=mapper.readValue(new File("jsonData/infos.json"), Person.class);
    System.out.println("Jmeno: "+thePerson.getName());
    System.out.println("Roky: "+thePerson.getAge());
    System.out.println("Jatra: "+thePerson.getOrgans().getLiver());
    System.out.println("Srdce: "+thePerson.getOrgans().getHearth());
    System.out.println("Ledviny: "+thePerson.getOrgans().getKidneys());
    }
    catch(Exception e) {
    e.printStackTrace();
    }
	}

}
