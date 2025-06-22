public class TaskManager {
    private class Node {
        Task task;
        Node next;

        Node(Task task) {
            this.task = task;
            this.next = null;
        }
    }

    private Node head;

    public TaskManager() {
        head = null;
    }

    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println("Task added: " + task);
    }

    public void searchTask(int taskId) {
        Node temp = head;
        while (temp != null) {
            if (temp.task.getTaskId() == taskId) {
                System.out.println("Task found: " + temp.task);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Task with ID " + taskId + " not found.");
    }

    public void listTasks() {
        if (head == null) {
            System.out.println("No tasks found.");
            return;
        }
        Node temp = head;
        System.out.println("Task List:");
        while (temp != null) {
            System.out.println(temp.task);
            temp = temp.next;
        }
    }

    public void deleteTask(int taskId) {
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }

        if (head.task.getTaskId() == taskId) {
            System.out.println("Task deleted: " + head.task);
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.task.getTaskId() == taskId) {
                System.out.println("Task deleted: " + current.next.task);
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }

        System.out.println("Task with ID " + taskId + " not found.");
    }

    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        Task t1 = new Task(1, "Design UI", "Pending");
        Task t2 = new Task(2, "Implement Backend", "In Progress");
        Task t3 = new Task(3, "Testing", "Not Started");

        manager.addTask(t1);
        manager.addTask(t2);
        manager.addTask(t3);

        manager.listTasks();

        manager.searchTask(2);
        manager.deleteTask(2);
        manager.listTasks();
    }
}
