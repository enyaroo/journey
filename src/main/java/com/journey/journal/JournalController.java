package com.journey.journal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.journey.journal.bo.JournalBO;
import com.journey.journal.entity.JournalEntity;

@RequestMapping("/journal")
@Controller
public class JournalController {
	
	@Autowired
	private JournalBO journalBO;
	
	@GetMapping("/journal-create-view")
	public String journalCreateView() {
		return "journal/journalCreate";
	}
	
	@GetMapping("/journal-list-view")
	public String journalListView(Model model) {
		List<JournalEntity> journalList = journalBO.getJournalList();
		
		model.addAttribute("journalList", journalList);
		return "journal/journalList";
	}
	
}
