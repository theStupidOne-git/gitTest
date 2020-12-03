package gaba.Controller;

import java.util.logging.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controllere {
Logger logger= Logger.getAnonymousLogger();
	
@RequestMapping("/")
public String land() {
return "land";
}
@RequestMapping("/LandingPage")
public String pageOne() {
return "LandingPage";
}
}
