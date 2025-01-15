package gr.hua.dit.ds.ds2024Team77.repository;
import gr.hua.dit.ds.ds2024Team77.entities.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Integer> {
    Optional<Review> getByReviewee_Id(Integer revieweeId);

}
