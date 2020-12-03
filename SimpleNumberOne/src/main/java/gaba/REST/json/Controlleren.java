package gaba.REST.json;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gaba.entity.user;
import gaba.service.personService;

@RestController
@RequestMapping("/test")
public class Controlleren {

@Autowired
private personService Pservice;

@GetMapping("/persons")
public List<user> getListOfPersons(){
return Pservice.getPersons();
}

@RequestMapping("/persons/{Index}")
public user Hey(@PathVariable int Index) {
if( (Index>Pservice.getPersons().size() ) || (Index<=0) ) {
throw new personNotFoundException("Student id: "+Index+" nemohlo byt nalezeno");
}
return Pservice.getUserID(Index);
}
@PostMapping
public user saveUser(@RequestBody user User) {
Pservice.saveBuddy(User);
return User;
}
}
