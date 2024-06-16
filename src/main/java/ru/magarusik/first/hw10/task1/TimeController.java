package ru.magarusik.first.hw10.task1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.*;
import java.util.Set;

@RestController
@RequestMapping("/time")
public class TimeController {
    private static final Set<String> zoneIds;

    static {
        zoneIds = ZoneId.getAvailableZoneIds();
    }

    @GetMapping("/{town}")
    public ZoneOffset getTime(@PathVariable String town) {
        var findTown = town.toLowerCase();

        var townTimeZone = zoneIds.stream()
                .filter(id -> id.toLowerCase().contains(findTown))
                .map(ZoneId::of)
                .findFirst()
                .orElse(ZonedDateTime.now().getZone());

        return townTimeZone.getRules()
                .getOffset(LocalDateTime.now());
    }

    @GetMapping()
    public String getCurrentTime() {
        var zoneDateTime = ZonedDateTime.now();
        return """
                Current time: is: %s \t
                Date: %s \t
                Time zone: %s \t
                OffSet: %s
                """.formatted(LocalTime.now(),
                LocalDateTime.now(),
                zoneDateTime.getZone(),
                zoneDateTime.getZone().getRules().getOffset(LocalDateTime.now()));
    }
}
