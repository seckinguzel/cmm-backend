package com.marubeni.cmmbackend.repository.abstracts;

import com.marubeni.cmmbackend.entity.concretes.Information;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InformationRepository extends JpaRepository<Information, Integer> {
}
