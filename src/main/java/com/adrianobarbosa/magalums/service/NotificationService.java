package com.adrianobarbosa.magalums.service;

import com.adrianobarbosa.magalums.dto.ScheduleNotificationDto;
import com.adrianobarbosa.magalums.repository.NotificationRepository;

public class NotificationService {

    private final NotificationRepository notificationRepository;

    public NotificationService(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    public void scheduleNotification(ScheduleNotificationDto dto) {
        notificationRepository.save(dto.toNotification());
    }
}

