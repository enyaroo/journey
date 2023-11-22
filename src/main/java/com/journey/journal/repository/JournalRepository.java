package com.journey.journal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.journey.journal.entity.JournalEntity;

public interface JournalRepository extends JpaRepository<JournalEntity, Integer> {

}
