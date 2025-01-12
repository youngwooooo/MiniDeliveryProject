package org.minideliveryproject.application.domain.repository;

import org.minideliveryproject.application.domain.entity.StoreMst;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StoreMstRepositoryImpl extends JpaRepository<StoreMst, Long> {

    public StoreMst findBySeq(Long seq);                         // 아이템 seq 조회
    public StoreMst findByStoreName(String storeName);

    @Query("SELECT sm FROM StoreMst sm WHERE sm.storeName LIKE %?1%")
    public List<StoreMst> findByStoreNameLike(String storeName);
}
