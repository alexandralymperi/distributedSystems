package gr.hua.dit.ds.ds2024Team77.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import gr.hua.dit.ds.ds2024Team77.entities.Report;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ReportRepository extends JpaRepository<Report,Integer> {
    List<Report> findByStatus(String status);
}
