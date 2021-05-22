package com.airbus.aerothon;

import com.airbus.aerothon.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApplicationController {

    private final ApplicationService service;

    @Autowired
    public ApplicationController(ApplicationService service) {
        this.service = service;
    }

    @GetMapping(path = "feedback")
    public List<Feedback> getFeedbacks() {
        return service.getFeedbacks();
    }

    @GetMapping(path = "bugs")
    public List<Bug> getBugs() {
        return service.getBugs();
    }

    @GetMapping(path = "notifications")
    public List<Notification> getNotifications() {
        return service.getNotifications();
    }

    @GetMapping(path = "performance")
    public Performance getPerformance() {
        return service.getPerformance();
    }

    @GetMapping(path = "customerSupport")
    public CustomerSupport getCustomerSupport() {
        return service.getCustomerSupport();
    }

    @PostMapping(path = "bugs")
    public Bug reportBug(@RequestBody Bug bug) {
        return service.reportBug(bug);
    }

    @PostMapping(path = "feedback")
    public Feedback postFeedback(@RequestBody Feedback feedback) {
        return service.postFeedback(feedback);
    }

    @PostMapping(path = "notification")
    public Notification newNotification(@RequestBody Notification notification) {
        return service.newNotification(notification);
    }

}
