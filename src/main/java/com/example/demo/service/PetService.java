package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.PetModel;
import com.example.demo.repository.PetRepo;



@Service
public class PetService {
	@Autowired
	PetRepo sr;
	
	public PetModel saveinfo(PetModel ss)
	{
		return sr.save(ss);
	}
	public List<PetModel>savedetails(List<PetModel> ss)
	{
		return (List<PetModel>)sr.saveAll(ss);
	}
	public List<PetModel> showinfo()
	{
		return sr.findAll();
	}
	public PetModel changeinfo(PetModel ss)
    {
   	 return sr.saveAndFlush(ss);
    }
	 public void deleteinfo(PetModel ss)
	    {
	   	  sr.delete(ss);
	    }
	public Optional<PetModel> showinfId(int id)
	{
		return sr.findById(id);
	}
	public String changeinfoid(int id,PetModel ss)
	{
		sr.saveAndFlush(ss);
		if(sr.existsById(id))
		{
			return "Updated";
		}
		else
		{
			return "Enter valid Id";
		}
	}
	public void deleteid(int id)
	{
		sr.deleteById(id);
	}
	public void deletepid(int id)
	{
		sr.deleteById(id);
	}
}
