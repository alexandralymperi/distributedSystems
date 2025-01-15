package gr.hua.dit.ds.ds2024Team77.service;

import gr.hua.dit.ds.ds2024Team77.entities.Review;
import gr.hua.dit.ds.ds2024Team77.repository.ReviewRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReviewService {

    private ReviewRepository reviewRepository;

    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @Transactional
    public Review getReview(Integer id){return reviewRepository.findById(id).get();}

    @Transactional
    public void saveReview(Review review){
        reviewRepository.save(review);
    }

    @Transactional
    public List<Review> getReviews(){ return reviewRepository.findAll(); }

    @Transactional
    public Optional<Review> getReviewsByReviewee(Integer revieweeId){return reviewRepository.getByReviewee_Id(revieweeId);}

    /*@Transactional
    public boolean deleteRev*/

}
