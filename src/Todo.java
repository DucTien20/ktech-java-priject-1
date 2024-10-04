public class Todo {
    String title;
    String until;
    boolean done;

    public Todo(String title, String until) {
        this.title = title;
        this.until = until;
        this.done = false;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public String getUntil() {
        return until;
    }

    public void setUntil(String until) {
        this.until = until;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "title='" + title + '\'' +
                ", until='" + until + '\'' +
                ", done=" + done +
                '}';
    }
}
