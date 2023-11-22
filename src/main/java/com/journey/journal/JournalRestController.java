package com.journey.journal;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.journey.journal.bo.JournalBO;

@RequestMapping("/journal")
@RestController
public class JournalRestController {
	
	@Autowired
	private JournalBO journalBO;
	
	@PostMapping("/create")
	public Map<String, Object> journalCreate(
			@RequestParam("title") String title
			, @RequestParam("body") String body) {
		
		Integer id = journalBO.addJournal(title, body);
		
		Map<String, Object> result = new HashMap<>();
		if (id == null) {
			result.put("code", 500);
			result.put("errorMessage", "Journal 기록에 실패하였습니다.");
		} else {
			result.put("code", 200);
			result.put("result", "Journal create 성공");
		}
		
		return result;
	}
}
