package gr.hua.dit.ds.ds2024Team77.repository;
import gr.hua.dit.ds.ds2024Team77.entities.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Integer> {
    List<Review> getByReviewee(Integer revieweeId);

}
