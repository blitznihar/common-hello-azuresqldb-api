package com.hello.azuresqldb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hello.azuresqldb.entity.HelloEvent;

/**
 * Hello Event Repository
 * 
 * @author ha0743
 *
 */
@Repository
public interface HelloEventRepository extends JpaRepository<HelloEvent, String> {

  /**
   * Find event by its name and return event entity
   * 
   * @param eventName
   * @return HelloEventEntity
   */
  public HelloEvent findByEventName(String eventName);

}