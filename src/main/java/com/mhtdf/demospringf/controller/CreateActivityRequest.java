package com.mhtdf.demospringf.controller;

import com.mhtdf.demospringf.model.Habit;
import jakarta.persistence.criteria.CriteriaBuilder;

public record CreateActivityRequest(Integer habitId) {}
