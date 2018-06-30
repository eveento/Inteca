package data.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@RequestMapping
@RestController
public class ViewsController {

	 @RequestMapping(value="/index", method=RequestMethod.GET)
	    public String home(){
	        return "index";
	    }
}
