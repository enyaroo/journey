package com.journey.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.journey.journal.mapper.JournalMapper;

@Controller
public class TestController {
	
	@Autowired
	JournalMapper journalMapper;
	
	@RequestMapping("/test1")
	@ResponseBody
	public String test1() {
		return "hello world";
	}
	
	@ResponseBody
	@GetMapping("/test2")
	public Map<String, Object> test2() {
		Map<String, Object> map = new HashMap<>();
		map.put("a", 1);
		map.put("b", 2);
		return map;
	}
	
	@ResponseBody
	@GetMapping("/test4")
	public List<Map<String, Object>> test4() {
		return journalMapper.selectJournalList();
	}
	
}
