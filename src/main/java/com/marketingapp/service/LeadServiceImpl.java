package com.marketingapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marketingapp.entity.Leado;
import com.marketingapp.repository.LeadRepository;
@Service
public class LeadServiceImpl implements LeadService {
	
	@Autowired
	private LeadRepository leadRepo;

	@Override
	public void saveLead(Leado lead) {
	leadRepo.save(lead);	

	}

	@Override
	public List<Leado> getAllLeads() {
		List<Leado> leads = leadRepo.findAll();
		return leads;
	}

	@Override
	public void deleteById(long id) {
		leadRepo.deleteById(id);
	}

	@Override
	public Leado findById(long id) {
		Optional<Leado> leado = leadRepo.findById(id);
		return leado.get();
	}

}
