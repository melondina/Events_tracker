package de.ait.events.controllers;

import de.ait.events.controllers.api.EventApi;
import de.ait.events.dto.EventDto;
import de.ait.events.services.EventsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class EventsController implements EventApi {

    private final EventsService eventsService;

    @Override
    public List<EventDto> getAllEvents() {
        return eventsService.getAllEvents();
    }
}
