package com.gdg.group15.repository;

import com.gdg.group15.domain.MainCategory;
import com.gdg.group15.domain.SubCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MainCategoryRepository extends JpaRepository<MainCategory, Long> {
    Optional<MainCategory> findByTitle(String title);
}
