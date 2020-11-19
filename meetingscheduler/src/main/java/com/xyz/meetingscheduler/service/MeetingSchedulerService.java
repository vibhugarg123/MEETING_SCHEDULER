package com.gojek.meetingscheduler.service;

import com.gojek.meetingscheduler.entity.MeetingRoom;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public interface MeetingSchedulerService {
    MeetingRoom findMeetingRoom(Date startDate, Date endDate);

    MeetingRoom createReservation(Date startDate, Date endDate);
}
