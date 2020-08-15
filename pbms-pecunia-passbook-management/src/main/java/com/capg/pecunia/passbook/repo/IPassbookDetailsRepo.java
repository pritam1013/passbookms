package com.capg.pecunia.passbook.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.pecunia.passbook.model.PassbookDetails;

public interface IPassbookDetailsRepo extends JpaRepository<PassbookDetails, Long> {

}
