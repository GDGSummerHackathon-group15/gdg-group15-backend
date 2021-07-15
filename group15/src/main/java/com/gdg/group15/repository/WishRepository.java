package com.gdg.group15.repository;

import com.gdg.group15.domain.Wish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface WishRepository extends JpaRepository<Wish, Long> {

    @Modifying
    @Query("delete from Wish wish where wish.book.id=:bookId")
    void deleteWishByBookId(Long bookId);
}
