package gift.wishlist.repository;

import gift.wishlist.model.Wish;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WishRepository extends JpaRepository<Wish, Long> {
    List<Wish> findByMemberId(Long memberId);
    Optional<Wish> findByProductId(Long productId);
    boolean exists(Long memberId, Long productId);
}
