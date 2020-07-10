package com.motion.reporsitory;

import com.motion.data.MusicDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicRepository extends JpaRepository<MusicDomain , Integer> {
}
