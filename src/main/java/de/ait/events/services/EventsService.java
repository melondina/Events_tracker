package de.ait.events.services;

import de.ait.events.dto.EventDto;

import java.util.List;

public interface EventsService {
    List<EventDto> getAllEvents();
}
