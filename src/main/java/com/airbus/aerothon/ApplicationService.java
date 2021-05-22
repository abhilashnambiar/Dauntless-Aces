package com.airbus.aerothon;

import com.airbus.aerothon.model.*;
import com.airbus.aerothon.repository.BugRepository;
import com.airbus.aerothon.repository.FeedbackRepository;
import com.airbus.aerothon.repository.NotificationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationService {

    private final BugRepository bugRepository;
    private final FeedbackRepository feedbackRepository;
    private final NotificationRepository notificationRepository;

    public ApplicationService(BugRepository bugRepository, FeedbackRepository feedbackRepository, NotificationRepository notificationRepository) {
        this.bugRepository = bugRepository;
        this.feedbackRepository = feedbackRepository;
        this.notificationRepository = notificationRepository;
    }

    public List<Feedback> getFeedbacks() {
        return feedbackRepository.findAll();
    }

    public List<Bug> getBugs() {
        return bugRepository.findAll();
    }

    public List<Notification> getNotifications() {
        return notificationRepository.findAll();
    }

    public Performance getPerformance() {
        return new Performance();
    }

    public CustomerSupport getCustomerSupport() {
        return new CustomerSupport();
    }

    public Bug reportBug(Bug bug) {
        bugRepository.save(bug);
        return bug;
    }

    public Feedback postFeedback(Feedback feedback) {
        feedbackRepository.save(feedback);
        return feedback;
    }

    public Notification newNotification(Notification notification) {
        notificationRepository.save(notification);
        return notification;
    }
}
