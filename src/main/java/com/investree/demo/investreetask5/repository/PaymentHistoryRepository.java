package com.investree.demo.investreetask5.repository;

import com.investree.demo.investreetask5.model.PaymentHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PaymentHistoryRepository extends JpaRepository<PaymentHistory, Long> {
    @Query(
            nativeQuery = true,
            value = "SELECT \n" +
                    "count(*) \n" +
                    "FROM payment_history ph\n" +
                    "WHERE transaction_id = ?1;"
    )
    Optional<Integer> countTransactionPaymentHistory(Long transactionId);
}
