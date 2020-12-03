package gaba.service;

import java.util.List;

import gaba.entity.user;

public interface personService{

List<user> getPersons();

public void saveBuddy(user User);

public user getUserID(int userID);

public void deleteUser(int userID);

}
