import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private String name;
    private boolean shared;
    private List<Activity> activities;

    public ToDoList(String name) {
        this.name = name;
        activities = new ArrayList<>();
        shared = false;
    }

    public ToDoList(String name, boolean shared) {
        this(name);
        this.shared = shared;
    }

    public void addActivity(String name, String description) {
        activities.add(new Activity(name, description));
    }

    public void addActivity(String name, String description, LocalDate rememberAt) {
        activities.add(new Activity(name, description, rememberAt));
    }

    public String getName() {
        return name;
    }

    public boolean isShared() {
        return shared;
    }

    public List<Activity> getActivities() {
        return activities;
    }
}