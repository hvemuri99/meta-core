package com.meta.web.repo;

import com.meta.web.domain.MetaInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MetaInfoRepository extends JpaRepository<MetaInfoEntity, Integer> {
}
