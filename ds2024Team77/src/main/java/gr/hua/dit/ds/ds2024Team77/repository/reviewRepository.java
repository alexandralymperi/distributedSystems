package gr.hua.dit.ds.ds2024Team77.repository;
import gr.hua.dit.ds.ds2024Team77.entities.review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface reviewRepository extends JpaRepository<review, Integer> {
}
