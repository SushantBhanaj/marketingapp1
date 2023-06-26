package com.marketingapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marketingapp.entity.Leado;
import com.marketingapp.repository.LeadRepository;
import com.marketingapp.scontroller.LeadDto;
//http://localhost:8080/api/leado
@RestController
@RequestMapping("/api/leado")
public class LeadRestController {
	
	@Autowired
	private LeadRepository leadRepo;
	
    @GetMapping
	public List<Leado> getAllLeads(){
    	List<Leado> leads = leadRepo.findAll();
		return leads;
		
	}
    @PostMapping
    public void createLead(@RequestBody Leado lead) {
    	leadRepo.save(lead);
    }
    //http://localhost:8080/api/leado/8
    @DeleteMapping("/{id}")
    public void deleteLead(@PathVariable("id")long id) {
    leadRepo.deleteById(id);	
    }
    @PutMapping("/{id}")
    public void updateLead(@RequestBody LeadDto dto,@PathVariable("id")long id) {
    Leado l=new Leado();
    l.setId(id);
    l.setFirstName(dto.getFirstName());
    l.setLastName(dto.getLastName());	
    l.setEmail(dto.getEmail());
    l.setMobile(dto.getMobile());
    leadRepo.save(l);
    }
}
