package com.nipun.curdapp.run;

import javax.xml.stream.Location;
import java.time.LocalDateTime;

public record run(
        Integer id,
        String title,
        LocalDateTime startedOn,
        LocalDateTime completedOn,
        Integer miles,
        Location location
) {
}
