package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.PetModel;

import com.example.demo.service.PetService;

@RestController
public class PetController {

	@Autowired
    PetService sser;
    
    @PostMapping("save")
    public PetModel add(@RequestBody PetModel  ss)
    {
 	   return sser.saveinfo(ss);
    }
    @PostMapping("addnpet")
    public List<PetModel> addndetails(@RequestBody List<PetModel> ss)
    {
   	 return sser.savedetails(ss);
    }
    @GetMapping("show")
    public List<PetModel >show()
    {
 	   return sser.showinfo();
    }
    @PutMapping("update")
    public PetModel modify(@RequestBody PetModel ss)
    {
   	 return sser.changeinfo(ss);
    }
    @DeleteMapping("delete")
    public  String del(@RequestBody PetModel ss)
    {
   	  sser.deleteinfo(ss);
   	  return "deleted successfully";
    }
    @GetMapping("get/{id}")
    public Optional<PetModel>getinfo(@PathVariable int id)
    {
 	   return sser.showinfId(id);
    }
    @PutMapping("update/{id}")
    public String modifybyid(@PathVariable int id,@RequestBody PetModel ss)
	{
		return sser.changeinfoid(id,ss);
	}
    @DeleteMapping("delete/{id}")
    public  void deletemyid(@PathVariable int id)
    {
   	  sser.deleteid(id);
    }
}
