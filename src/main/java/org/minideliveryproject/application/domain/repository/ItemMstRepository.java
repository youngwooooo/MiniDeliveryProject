package org.minideliveryproject.application.domain.repository;

import org.minideliveryproject.application.domain.entity.ItemMst;
import org.minideliveryproject.application.domain.entity.StoreMst;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

@Repository
public interface ItemMstRepository extends JpaRepository<ItemMst, Long> {

    public ItemMst findBySeq(Long seq);                           // 아이템 seq 조회
    public Optional<ItemMst> findByItemName(String itemName);           // 아이템 명 조회
    public Optional<ItemMst> findByItemCategory(String itemCategory);   // 아이템 카테고리 조회
}