package mock;

import java.util.stream.Stream;

public class DoorPanelMock extends DoorPanel {
    void close() {
        Stream.of("East Door", "West Door", "North Door", "South Door")
            .forEach((door) -> {
                System.out.println(door + "is closed");
            });
    }
}
