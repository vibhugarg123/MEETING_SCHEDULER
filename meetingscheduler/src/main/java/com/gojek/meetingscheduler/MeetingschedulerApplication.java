package com.gojek.meetingscheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.gojek.meetingscheduler")
@EnableJpaRepositories("com.gojek.meetingscheduler")
@EntityScan("com.gojek.meetingscheduler")
public class MeetingschedulerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MeetingschedulerApplication.class, args);
    }

}
