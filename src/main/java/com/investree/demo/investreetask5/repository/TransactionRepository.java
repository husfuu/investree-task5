package com.investree.demo.investreetask5.repository;

import com.investree.demo.investreetask5.model.Transaction;
import com.investree.demo.investreetask5.model.TransactionStatus;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    @Query(value = "SELECT * FROM transaction t WHERE t.status=?1", nativeQuery = true)
    Page<Transaction> findAllByStatus(TransactionStatus status, Pageable pageable);
}
