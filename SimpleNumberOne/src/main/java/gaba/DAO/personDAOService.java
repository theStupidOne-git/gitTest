package gaba.DAO;

import java.util.List;

import javax.persistence.Query;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import gaba.entity.user;

@Repository
public class personDAOService implements personDAO {

@Autowired
private SessionFactory sessionFactory;

private static org.apache.log4j.Logger log = Logger.getLogger(personDAOService.class); 

@Override
@Transactional
public List<user> getPersons() {
log.info("Inside of getPerson()");

Session currentSession = sessionFactory.getCurrentSession();
Query theQuery = 
				currentSession.createQuery("from user order by id",
											user.class);
List<user> result = theQuery.getResultList();
return result;
}

@Override
@Transactional
public void saveBuddy(user User) {
log.info("Inside of saveBuddy()");
Session currentSession = sessionFactory.getCurrentSession();
currentSession.saveOrUpdate(User);
}

@Override
public user getUserID(int userID) {
log.info("Inside of getUserID()");
Session currentSession = sessionFactory.getCurrentSession();
user getUser = currentSession.get(user.class, userID);
return getUser;
}

@Override
public void deleteUser(int userID) {
log.info("Inside of deleteUser()");
Session currentSession = sessionFactory.getCurrentSession();
user deleteUser = currentSession.get(user.class, userID);
currentSession.delete(deleteUser);
}
}
