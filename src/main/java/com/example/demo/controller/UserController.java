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

import com.example.demo.model.UserModel;
import com.example.demo.service.UserService;
@RestController

public class UserController 
{
	@Autowired
	UserService sser;
	@PostMapping("saveuser")
    public UserModel add(@RequestBody  UserModel  ss)
    {
 	   return sser.saveinfo(ss);
    }
    @PostMapping("addnuser")
    public List< UserModel> addndetails(@RequestBody List< UserModel> ss)
    {
   	 return sser.savedetails(ss);
    }
    @GetMapping("showuser")
    public List< UserModel >show()
    {
 	   return sser.showinfo();
    }
    @PutMapping("updateuser")
    public  UserModel modify(@RequestBody  UserModel ss)
    {
   	 return sser.changeinfo(ss);
    }
    @DeleteMapping("deleteuser")
    public  String del(@RequestBody  UserModel ss)
    {
   	  sser.deleteinfo(ss);
   	  return "deleted successfully";
    }
    @GetMapping("getuser/{id}")
    public Optional< UserModel>getinfo(@PathVariable int id)
    {
 	   return sser.showinfId(id);
    }
    @PutMapping("updateuser/{id}")
    public String modifybyid(@PathVariable int id,@RequestBody  UserModel ss)
	{
		return sser.changeinfoid(id,ss);
	}
    @DeleteMapping("deletebyid/{id}")
    public  void deletemyid(@PathVariable int id) 
    {
   	  sser.deleteid(id);
    }
}
