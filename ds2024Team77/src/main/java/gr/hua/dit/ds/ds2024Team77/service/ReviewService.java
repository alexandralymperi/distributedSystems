package gr.hua.dit.ds.ds2024Team77.service;

import gr.hua.dit.ds.ds2024Team77.entities.Review;
import gr.hua.dit.ds.ds2024Team77.repository.ReviewRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public List<Review> getReviewsByReviewee(Integer revieweeId){return reviewRepository.getByReviewee(revieweeId);}

}
