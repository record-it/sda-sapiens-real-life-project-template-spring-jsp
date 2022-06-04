package pl.sda.sapiens.ep.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.sda.sapiens.ep.model.entity.EventEntity;
import pl.sda.sapiens.ep.model.view.EventForm;
import pl.sda.sapiens.ep.repository.EventRepository;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
public class EventController {

    final EventRepository eventRepository;

    public EventController(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @GetMapping("/event/form")
    public String showEventForm(){
        return "event-form";
    }

    @PostMapping("/event/add")
    public String addEvent(@ModelAttribute EventForm eventForm, Model model){
        System.out.println(eventForm);
        //TODO zdefiniować mapper z EventForm na Event
        //TODO zdefiniwać mapper z Event na EventEntity
        final EventEntity entity = EventEntity.builder()
                .title(eventForm.getTitle())
                .description(eventForm.getDescription())
                .start(LocalDateTime.parse(eventForm.getStart(), DateTimeFormatter.ISO_DATE_TIME))
                .end(LocalDateTime.parse(eventForm.getEnd(), DateTimeFormatter.ISO_DATE_TIME))
                .tags(eventForm.getTags())
                .build();
        eventRepository.save(entity);
        model.addAttribute("events",eventRepository.findAllEventEntity());
        return "event-list";
    }
}
