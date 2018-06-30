package data.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import data.domain.Family;
import data.domain.Person;
import data.service.FamilyService;

@RestController
@RequestMapping(value = "/family")
@CrossOrigin(origins="*")
public class FamilyController {

	@Autowired
    FamilyService familyService;

    @RequestMapping(value="", method=RequestMethod.POST)
    public Family createFamily(@RequestBody Family family){
        return familyService.createFamily(family);
    }
    
    @RequestMapping(value="/{id}")
    public List<Person> getAllFromOneFamily(@PathVariable int id){
        return familyService.getAllFromOneFamily(id);
    }

    
}
