package com.airbus.aerothon.repository;

import com.airbus.aerothon.model.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
