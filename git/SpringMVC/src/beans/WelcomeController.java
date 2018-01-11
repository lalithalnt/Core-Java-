package beans;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	@RequestMapping("/welcomelink")
	public ModelAndView display()
	
	{
		return new ModelAndView("welcome","msgkey","Hai Welcome....");
		
	}
}
