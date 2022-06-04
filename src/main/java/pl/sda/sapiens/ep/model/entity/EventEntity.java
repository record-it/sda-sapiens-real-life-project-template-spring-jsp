package pl.sda.sapiens.ep.model.entity;

import lombok.*;
import pl.sda.sapiens.ep.model.domain.User;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class EventEntity {
    @EqualsAndHashCode.Include
    private long id;
    private String title;
    private String description;
    private LocalDateTime start;
    private LocalDateTime end;
    private List<String> tags;
    private User publisher;
}
