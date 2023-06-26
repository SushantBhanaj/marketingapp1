package com.marketingapp.scontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.marketingapp.entity.Leado;
import com.marketingapp.service.LeadService;

@Controller
public class LeadController {
	@Autowired
	private LeadService leadService;
	
	//http://localhost:8080/create4
    @RequestMapping("/create4")
	public String viewCreateLead() {
		return "create_leado";
		
	}
    @RequestMapping("/saveLeado")
    public String saveLead(Leado lead,Model model) {
    	leadService.saveLead(lead);
   model.addAttribute("msg","Reg saved!..");
		return "create_leado";	
    }
    @RequestMapping("/listAll1")
    public String getAllLeads(Model model) {
    	List<Leado> leads = leadService.getAllLeads();
    	model.addAttribute("leads",leads);
        return "serch_result";
    	
    }
    //http://localhost:8080/delete1/
    @RequestMapping("/delete1")
    public String deleteById(@RequestParam("id") long id,Model model) {
    	leadService.deleteById(id);
    	List<Leado> leads = leadService.getAllLeads();
    	model.addAttribute("leads",leads);
		return "serch_result";
    	
    }
    @RequestMapping("/update")
    public String getLeadoById(@RequestParam("id")long id,Model model) {
    	Leado lead = leadService.findById(id);
    	model.addAttribute("lead", lead);
		return "update_lead";
    }
    @RequestMapping("/updateLead")
    public String updateDaru(LeadDto dto,Model model) {
    	Leado lead=new Leado();
    	lead.setFirstName(dto.getFirstName());
    	lead.setLastName(dto.getLastName());
    	lead.setEmail(dto.getEmail());
    	lead.setMobile(dto.getMobile());
    	leadService.findById(2);
    	List<Leado> leads = leadService.getAllLeads();
    	model.addAttribute("leads", leads);
		return "update_lead";
    	
    }
}
