package ru.magarusik.first.hw10.spring_boot.task1;

import org.springframework.web.bind.annotation.*;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Set;

/**
 * Контроллер для определения текущего времени по часовому поясу для каждого города.
 */
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

    /**
     * Запрос на получение текущего времени по часовому поясу для города.
     * Если такого города нет в названии, то выбрасывается исключение и
     * возвращается ошибка.
     *
     * @param town Название города.
     * @return Время в городе.
     * @throws RuntimeException Если города нет в названии часового пояса.
     */
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

    /**
     * Запрос для получения текущего времени по часовому поясу.
     *
     * @return Текущее время.
     */
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

    /**
     * Обрабатывает исключения выбрасываемые в других методах
     *
     * @param exception Выброшенное исключение
     * @return Сообщение об ошибке
     */
    @ExceptionHandler(value = RuntimeException.class)
    public String getError(RuntimeException exception) {
        return exception.getMessage();
    }
}
