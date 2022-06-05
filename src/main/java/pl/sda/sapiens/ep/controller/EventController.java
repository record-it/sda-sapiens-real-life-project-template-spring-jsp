package pl.sda.sapiens.ep.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.sda.sapiens.ep.model.view.EventForm;
import pl.sda.sapiens.ep.service.EventService;
@Controller
public class EventController {

    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping("/event/form")
    public String showEventForm(){
        return "event-form";
    }

    @PostMapping("/event/add")
    public String addEvent(@ModelAttribute EventForm eventForm, Model model){
        //TODO wykonać walidację po stronie serwera eventForm
        eventService.saveEvent(eventForm);
        model.addAttribute("events",eventService.findCurrentEvents());
        return "event-list";
    }
    @GetMapping("/event/list")
    public String currentEventList(Model model){
        model.addAttribute("events",eventService.findCurrentEvents());
        return "event-list";
    }
}
