package samsung;

import java.time.LocalDateTime;
import java.util.Random;

public class SamsungEventSource {

  public SamsungEvent nextEvent() {
    return new SamsungEvent(//
        LocalDateTime.now(), //
        new Random().nextBoolean() ? "persona-violenta" : "incendio", //
        "bar");
  }

}
