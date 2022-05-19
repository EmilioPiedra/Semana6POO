import java.time.LocalDate;
import java.time.LocalDateTime;

public class Activity {
    private String name;
    private String description;
    private LocalDateTime createdAt;
    private LocalDate rememberAt;
    private boolean completed;

    public Activity(String name, String description) {
        this.name = name;
        this.description = description;
        this.createdAt = LocalDateTime.now();
    }

    public Activity(String name, String description, LocalDate rememberAt) {
        this(name, description);
        this.rememberAt = rememberAt;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDate getRememberAt() {
        return rememberAt;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public void  setcompleted () {
        return  ;
    }
}
