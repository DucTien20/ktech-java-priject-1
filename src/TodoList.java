import java.util.ArrayList;
import java.util.List;

public class TodoList {
    List<Todo> todos;
    public TodoList() {
        this.todos = new ArrayList<Todo>();

    }


    public void add(Todo todo) {
        todos.add(todo);
    }
    public Todo getTodo(int index){
        return todos.get(index);
    }
    public void remove(Todo todo) {
        todos.remove(todo);
    }
    public void removeTodo(int index) {
        todos.remove(index);
    }
    public int size() {
        return todos.size();
    }
    public void printList() {
        for (int i = 0; i < todos.size(); i++) {
            Todo todo = todos.get(i);
            System.out.println((i + 1) + ". " + todo.title + (todo.done ? " (Done)" : ""));
        }
    }
}
