package pl.sda.sapiens.ep.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.sda.sapiens.ep.model.view.EventForm;

@Controller
public class EventController {

    @GetMapping("/event/form")
    public String showEventForm(){
        return "event-form";
    }

    @PostMapping("/event/add")
    public String addEvent(@ModelAttribute EventForm eventForm){
        System.out.println(eventForm);
        return "event-form";
    }
}
