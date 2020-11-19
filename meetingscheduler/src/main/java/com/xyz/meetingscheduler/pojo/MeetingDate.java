package com.gojek.meetingscheduler.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class MeetingDate {
    private Date meetingStartDate;
    private Date meetingEndDate;
}
