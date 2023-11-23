package com.journey.journal.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.journey.journal.entity.JournalEntity;
import com.journey.journal.repository.JournalRepository;

@Service
public class JournalBO {
	
	@Autowired
	private JournalRepository journalRepository;
	
	public Integer addJournal(String title, String body) {
		JournalEntity journalEntity = journalRepository.save(
				JournalEntity.builder()
				.userId(1)
				.title(title)
				.body(body)
				.build());
		return journalEntity == null ? null : journalEntity.getId();
	}
	
	public List<JournalEntity> getJournalList() {
		return journalRepository.findAll();
	}
}
