package com.adrianobarbosa.magalums.service;

import com.adrianobarbosa.magalums.controller.dto.ScheduleNotificationDto;
import com.adrianobarbosa.magalums.entity.Notification;
import com.adrianobarbosa.magalums.repository.NotificationRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class NotificationService {

    private final NotificationRepository notificationRepository;

    public NotificationService(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    public void scheduleNotification(ScheduleNotificationDto dto) {
        notificationRepository.save(dto.toNotification());
    }

    public Optional<Notification> findById(Long notificationId) {
        return notificationRepository.findById(notificationId);
    }
}

