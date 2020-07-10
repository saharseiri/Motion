package com.motion.reporsitory;

import com.motion.data.MovieDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<MovieDomain , Integer> {
}
