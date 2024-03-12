public class Task {
    private String name;
    private String description;
    private String deadline;

    public Task(String name, String description, String deadline) {
        this.name = name;
        this.description = description;
        this.deadline = deadline;
    }

    // getter
    public String getName() { return name; }
    public String getDescription() { return description; }
    public String getDeadline() { return deadline; }
}
