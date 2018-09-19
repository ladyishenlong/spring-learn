package com.ladyishenlong.client1.repository;

import com.ladyishenlong.client1.bean.Good;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional//使用sql语句查询
@Repository
public interface GoodRepository extends JpaRepository<Good, Integer> {


    Good getGoodById(int id);


//    @Modifying
//    @Query("update Good  good set good.name=:name where good.id =:id")
//    int update(@Param("id") int id, @Param("name") String name);


}
