package com.mhtdf.demospringf.repository;

import com.mhtdf.demospringf.model.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityRepository extends JpaRepository<Activity, Integer> {
}
