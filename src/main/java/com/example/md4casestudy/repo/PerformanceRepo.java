package com.example.md4casestudy.repo;

import com.example.md4casestudy.model.Performance;
import com.example.md4casestudy.model.PlayerStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerformanceRepo extends JpaRepository<Performance, Long> {
}
