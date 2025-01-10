package gr.hua.dit.ds.ds2024Team77.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import gr.hua.dit.ds.ds2024Team77.entities.report;
import org.springframework.stereotype.Repository;

@Repository
public interface reportRepository extends JpaRepository<report,Integer> {
}
