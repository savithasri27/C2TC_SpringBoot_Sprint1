package com.tnisf.Spring_DataReportAndProcessing;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
  
}
