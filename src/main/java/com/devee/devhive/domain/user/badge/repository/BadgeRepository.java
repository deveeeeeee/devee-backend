package com.devee.devhive.domain.user.badge.repository;

import com.devee.devhive.domain.user.badge.entity.Badge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BadgeRepository extends JpaRepository<Badge, Long> {
  boolean existsByName(String name);
}
