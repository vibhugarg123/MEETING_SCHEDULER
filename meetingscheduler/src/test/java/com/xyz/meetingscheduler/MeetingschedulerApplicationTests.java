package com.gojek.meetingscheduler;

import com.gojek.meetingscheduler.entity.MeetingRoom;
import com.gojek.meetingscheduler.service.MeetingSchedulerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Calendar;
import java.util.Date;

@SpringBootTest
class MeetingschedulerApplicationTests {

    @Autowired
    private MeetingSchedulerService meetingSchedulerService;

    @Test
    void contextLoads() {
    }

    @Test
    void createReservation(){
        Date startTime=new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(startTime);
        calendar.add(Calendar.MINUTE, 20);
        Date endTime=calendar.getTime();
        System.out.println(startTime+" "+endTime);
        MeetingRoom meetingRoom=meetingSchedulerService.createReservation(startTime,endTime);
        System.out.println(meetingRoom.toString());
        assert(meetingRoom!=null);
    }
}
