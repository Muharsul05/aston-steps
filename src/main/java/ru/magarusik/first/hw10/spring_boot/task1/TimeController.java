package ru.magarusik.first.hw10.spring_boot.task1;

import org.springframework.web.bind.annotation.*;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Set;

@RestController
@RequestMapping("/time")
public class TimeController {
    private static final Set<String> zoneIds;
    private static final Instant INSTANT;
    private static final DateTimeFormatter FORMATTER;
    private static final DateTimeFormatter TIME_FORMATTER;
    private static final DateTimeFormatter DATE_FORMATTER;

    static {
        zoneIds = ZoneId.getAvailableZoneIds();
        INSTANT = Instant.now();
        FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss OOOO");
        TIME_FORMATTER = DateTimeFormatter.ofPattern("HH:mm:ss");
        DATE_FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    }

    @GetMapping("/{town}")
    public String getTime(@PathVariable String town) {
        var findTown = town.toLowerCase();

        var townTimeZone = zoneIds.stream()
                .filter(id -> id.toLowerCase().contains(findTown))
                .map(ZoneId::of)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Города в названии тайм зоны нет"));

        return "Время в городе " + town + ": " + INSTANT.atZone(townTimeZone).format(FORMATTER);
    }

    @GetMapping()
    public String getCurrentTime() {
        var zoneDateTime = ZonedDateTime.now();
        return """
                Current time: is: %s
                Date: %s
                Time zone: %s
                OffSet: %s
                """.formatted(LocalTime.now().format(TIME_FORMATTER),
                LocalDateTime.now().format(DATE_FORMATTER),
                zoneDateTime.getZone(),
                zoneDateTime.getZone().getRules().getOffset(LocalDateTime.now()));
    }

    @ExceptionHandler(value = RuntimeException.class)
    public String getError(RuntimeException e) {
        return e.getMessage();
    }
}
