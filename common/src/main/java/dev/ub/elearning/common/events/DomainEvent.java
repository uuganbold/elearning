package dev.ub.elearning.common.events;

import java.time.Instant;
import java.util.UUID;

public interface DomainEvent {
    
    UUID eventId();

    Instant occurredOn();
}
