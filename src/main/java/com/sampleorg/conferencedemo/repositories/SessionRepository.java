package com.sampleorg.conferencedemo.repositories;

import com.sampleorg.conferencedemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {

}
