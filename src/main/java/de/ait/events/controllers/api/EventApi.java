package de.ait.events.controllers.api;

import de.ait.events.dto.EventDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/events")
public interface EventApi {

    @GetMapping
    List<EventDto> getAllEvents();
}
