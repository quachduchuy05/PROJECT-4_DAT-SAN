package com.example.demo.qdhRepository;

import com.example.demo.qdhEntity.QDHDonDatSan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface QDHDonDatSanRepository extends JpaRepository<QDHDonDatSan, Long> {

    boolean existsBySanConIdAndNgayDatAndKhungGioId(
            Long sanConId,
            LocalDate ngayDat,
            Long khungGioId
    );

    List<QDHDonDatSan> findBySanConId(Long sanConId);
}