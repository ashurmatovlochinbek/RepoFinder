package com.lochinbek.taskForSolving.repository;

import com.lochinbek.taskForSolving.entity.Repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoRepository extends JpaRepository<Repo, Long> {
}
