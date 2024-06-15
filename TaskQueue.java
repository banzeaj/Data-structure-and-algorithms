import java.util.LinkedList;
import java.util.Queue;

// Class to represent a project task
class Task {
    private String name;

    public Task(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}

// Class to manage the queue of project tasks
class TaskQueue {
    private Queue<Task> taskQueue;

    public TaskQueue() {
        taskQueue = new LinkedList<>();
    }

    // Function to add a new task to the queue
    public void addTask(Task task) {
        taskQueue.offer(task);
        System.out.println("Added task: " + task);
    }

    // Function to remove the completed task from the queue
    public void completeTask() {
        Task completedTask = taskQueue.poll();
        if (completedTask != null) {
            System.out.println("Completed task: " + completedTask);
        } else {
            System.out.println("No tasks to complete.");
        }
    }

    // Function to view current tasks in the queue
    public void viewTasks() {
        if (taskQueue.isEmpty()) {
            System.out.println("No tasks in the queue.");
        } else {
            System.out.println("Current tasks in the queue:");
            for (Task task : taskQueue) {
                System.out.println(task);
            }
        }
    }

    public static void main(String[] args) {
        // Test scenario
        TaskQueue taskQueue = new TaskQueue();

        // Adding tasks to the queue
        taskQueue.addTask(new Task("Design Database Schema"));
        taskQueue.addTask(new Task("Implement User Authentication"));
        taskQueue.addTask(new Task("Develop Frontend UI"));

        // Viewing current tasks
        taskQueue.viewTasks();

        // Completing tasks
        taskQueue.completeTask();
        taskQueue.completeTask();

        // Viewing current tasks after some tasks are completed
        taskQueue.viewTasks();

        // Adding more tasks to the queue
        taskQueue.addTask(new Task("Integrate Payment Gateway"));
        taskQueue.addTask(new Task("Deploy Application"));

        // Viewing final list of tasks
        taskQueue.viewTasks();
    }
}
