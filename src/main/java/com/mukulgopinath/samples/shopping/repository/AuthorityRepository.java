package com.mukulgopinath.samples.shopping.repository;

import com.mukulgopinath.samples.shopping.domain.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
