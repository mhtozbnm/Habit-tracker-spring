package com.mhtdf.demospringf.repository;

import com.mhtdf.demospringf.model.Habit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HabitRepository extends JpaRepository<Habit, Integer> {}
