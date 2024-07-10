package com.adrianobarbosa.magalums.repository;

import com.adrianobarbosa.magalums.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
