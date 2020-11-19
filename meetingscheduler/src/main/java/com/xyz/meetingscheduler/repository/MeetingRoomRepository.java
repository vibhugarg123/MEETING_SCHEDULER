package com.gojek.meetingscheduler.repository;

import com.gojek.meetingscheduler.entity.MeetingRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface MeetingRoomRepository extends JpaRepository<MeetingRoom, Integer> {
    @Query(value = "SELECT * FROM MEETING_ROOM where ID NOT IN " +
            "(" +
            "SELECT ROOM_ID FROM RESERVATIONS WHERE ((?1>=date_begin AND ?1<date_end) OR (?2>=date_begin AND ?2<date_end))" +
            ")", nativeQuery = true)
    List<MeetingRoom> findMeetingRoom(Date startTime, Date endTime);
}
