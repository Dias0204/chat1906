package kz.aitu.chat1906.repository;

import kz.aitu.chat1906.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository <Message, Long> {
}
