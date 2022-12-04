package com.investree.demo.investreetask5.model;
import lombok.Data;
import javax.persistence.*;

@Entity
@Data
public class Transaction extends BaseModel{
    private int tenor;

    private Double total_loan;

    private Double percent_interest;

    @Enumerated(EnumType.STRING)
    private TransactionStatus status = TransactionStatus.berjalan;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "peminjam_id")
    private Users peminjam;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "meminjam_id")
    private Users meminjam;
}
