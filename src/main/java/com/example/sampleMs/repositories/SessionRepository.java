package com.example.sampleMs.repositories;

import com.example.sampleMs.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;
public interface SessionRepository extends JpaRepository<Session,  Long> {

}
