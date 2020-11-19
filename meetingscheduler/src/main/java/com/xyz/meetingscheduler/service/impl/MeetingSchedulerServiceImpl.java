package com.gojek.meetingscheduler.service.impl;

import com.gojek.meetingscheduler.entity.MeetingRoom;
import com.gojek.meetingscheduler.entity.Reservations;
import com.gojek.meetingscheduler.repository.MeetingRoomRepository;
import com.gojek.meetingscheduler.repository.ReservationsRepository;
import com.gojek.meetingscheduler.service.MeetingSchedulerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Slf4j
@Component
public class MeetingSchedulerServiceImpl implements MeetingSchedulerService {

    @Autowired
    private MeetingRoomRepository meetingRoomRepository;

    @Autowired
    private ReservationsRepository reservationsRepository;

    @Override
    @Transactional
    public MeetingRoom findMeetingRoom(Date startDate, Date endDate) {
        List<MeetingRoom> meetingRoomList = meetingRoomRepository.findMeetingRoom(startDate, endDate);
        return (meetingRoomList != null && !meetingRoomList.isEmpty()) ? meetingRoomList.get(0) : null;
    }

    @Override
    @Transactional
    public MeetingRoom createReservation(Date startDate, Date endDate) {
        List<MeetingRoom> meetingRoomList = meetingRoomRepository.findMeetingRoom(startDate, endDate);
        if (meetingRoomList != null && !meetingRoomList.isEmpty()) {
            Reservations reservations = new Reservations();
            reservations.setRoomId(meetingRoomList.get(0).getId());
            reservations.setDateBegin(startDate);
            reservations.setDateEnd(endDate);
            reservationsRepository.save(reservations);
            return meetingRoomList.get(0);
        } else {
            System.out.println("Resource Not Found");
            return null;
        }
    }
}
