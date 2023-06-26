package com.marketingapp.service;

import java.util.List;

import com.marketingapp.entity.Leado;

public interface LeadService {
public void saveLead(Leado lead);
public List<Leado> getAllLeads();
public void deleteById(long id);
public Leado findById(long id);
}
