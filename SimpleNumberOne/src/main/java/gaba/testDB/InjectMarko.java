package gaba.testDB;

import org.springframework.beans.factory.annotation.Autowired;

public class InjectMarko{

@Autowired
Marko marko=new Marko();

public String moma() {
return marko.Millenium();
}
}
