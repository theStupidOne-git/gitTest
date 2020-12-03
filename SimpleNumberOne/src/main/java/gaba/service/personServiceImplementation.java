package gaba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import gaba.DAO.personDAO;
import gaba.entity.user;


@Service
public class personServiceImplementation implements personService {
	
@Autowired
private personDAO persondao;


@Override
@Transactional
public List<user> getPersons() {
return persondao.getPersons();
}


@Override
@Transactional
public void saveBuddy(user User) {
persondao.saveBuddy(User);
}


@Override
@Transactional
public user getUserID(int userID) {
return persondao.getUserID(userID);
}


@Override
@Transactional
public void deleteUser(int userID) {
persondao.deleteUser(userID);
}





}
