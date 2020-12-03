package gaba.DAO;

import java.util.List;

import gaba.entity.user;

public interface personDAO {
	
public List<user> getPersons();

public void saveBuddy(user user);

public user getUserID(int userID);

public void deleteUser(int userID);
}
