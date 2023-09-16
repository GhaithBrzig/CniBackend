package com.cni.eagleye.dao.repository;


import com.cni.eagleye.dao.entities.CsvFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository

public interface CsvfileRepository extends JpaRepository<CsvFile, Long> {
}
