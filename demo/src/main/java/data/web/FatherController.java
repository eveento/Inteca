package data.web;

import java.util.List;

import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import data.domain.Father;
import data.service.FatherService;

@RestController
@RequestMapping("/father")
@CrossOrigin(origins="*")
public class FatherController {
	
	@Autowired
    private FatherService fatherService;

    @RequestMapping(value="", method=RequestMethod.POST)
    public void createFather(@RequestBody Father father){
    	List<Father> fathersList = fatherService.getAllFathers();
    	for	(int i = 0; i < fathersList.size(); i++)
    	{
    		if(fathersList.get(i).getFamily() == father.getFamily())
    		{
    			return;
    		}
    	}
         fatherService.createFather(father);
    }

    @RequestMapping(value="", method=RequestMethod.GET)
    public List<Father> getAllFathers(){
        return fatherService.getAllFathers();
    }

    @RequestMapping(value="/name/{name}")
    public List<Father> getFatherByName(@PathVariable String name){
        return fatherService.getFatherByName(name);
    }

    @RequestMapping(value="/surname/{surname}")
    public List<Father> getFatherBySurname(@PathVariable String surname){
        return fatherService.getFatherByName(surname);
    }
    
    @RequestMapping(value="/findbyfamily/{family}")
    public List<Father> getFatherByFamily(@PathVariable int family){
        return fatherService.getFatherByFamily(family);
    }
    
    @RequestMapping(value="/findbypesel/{pesel}")
    public Father getFatherByPasel(@PathVariable String pesel){
        return fatherService.getFatherByPesel(pesel);
    }

    @RequestMapping(value="/data/{data}")
    public List<Father> getFatherByFamily(@PathVariable String data){
        return fatherService.getFatherByData(data);
    }
}
