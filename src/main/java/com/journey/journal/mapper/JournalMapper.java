package com.journey.journal.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public interface JournalMapper {
	
	public List<Map<String, Object>> selectJournalList();
}
