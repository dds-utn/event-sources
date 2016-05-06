package toshiba;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ToshibaEventSource {

  public List<ToshibaEvent> eventsSince(LocalDateTime from) {
    return Arrays.asList(//
        newRandomEvent(), //
        newRandomEvent(), //
        newRandomEvent(), //
        newRandomEvent());
  }

  private ToshibaEvent newRandomEvent() {
    return new ToshibaEvent(//
        LocalDateTime.now(), //
        new Random().nextBoolean() ? "persona-violenta" : "incendio", //
        "bar");
  }

}
