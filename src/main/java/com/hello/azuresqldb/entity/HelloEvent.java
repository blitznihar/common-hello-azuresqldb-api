package com.hello.azuresqldb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Domain representation of HelloEventEntity
 *
 */
@Entity
@Table(name = "event", schema = "dbo")
public class HelloEvent {

  public HelloEvent() {
    // left intentionally
  }

  @Id
  @Column(name = "event_id")
  private String eventId;

  @Column(name = "event_name")
  private String eventName;

  @Column(name = "event_time")
  private String eventTime;

  @Column(name = "created_by")
  private String createdBy;

  @Column(name = "created_on")
  private String createdOn;

  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public String getEventName() {
    return eventName;
  }

  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

  public String getEventTime() {
    return eventTime;
  }

  public void setEventTime(String eventTime) {
    this.eventTime = eventTime;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public String getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(String createdOn) {
    this.createdOn = createdOn;
  }

}