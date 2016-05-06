package samsung;

import java.time.LocalDateTime;

public class SamsungEvent {

  private LocalDateTime time;
  private String message;
  private String body;

  public SamsungEvent(LocalDateTime time, String message, String body) {
    this.time = time;
    this.message = message;
    this.body = body;
  }

  public LocalDateTime getTime() {
    return time;
  }

  public String getMessage() {
    return message;
  }

  public String getBody() {
    return body;
  }

}
