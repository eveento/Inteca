package data.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import data.domain.Children;
import data.service.ChildrenService;


@RestController
@RequestMapping(value = "/child")
public class ChildController {

	@Autowired
    ChildrenService childrenService;

    @RequestMapping(value="", method=RequestMethod.POST)
    public Children createChild(@RequestBody Children children){
        return childrenService.createChild(children);
    }

    @RequestMapping(value="", method=RequestMethod.GET)
    public List<Children> getAllChildren(){
        return childrenService.getAllChildren();
    }

    @RequestMapping(value="/name/{name}")
    public List<Children> getChildByName(@PathVariable String name){
        return childrenService.getChildByName(name);
    }

    @RequestMapping(value="/surname/{surname}")
    public List<Children> getChildBySurname(@PathVariable String surname){
        return childrenService.getChildBySurname(surname);
    }
    
    @RequestMapping(value="/findbyfamily/{family}")
    public List<Children> getChildrenByFamily(@PathVariable int family){
        return childrenService.getChildrenByFamily(family);
    }
    
    @RequestMapping(value="/findbypesel/{pesel}")
    public Children getChildByPesel(@PathVariable String pesel){
        return childrenService.getChildByPesel(pesel);
    }

    @RequestMapping(value="/data/{data}")
    public List<Children> getChildByData(@PathVariable String data){
        return childrenService.getChildByData(data);
    }
    
    @RequestMapping(value="/sex/{sex}")
    public List<Children> getChildBySex(@PathVariable String sex){
        return childrenService.getChildBySex(sex);
    }
}
