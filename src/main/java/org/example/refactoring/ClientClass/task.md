## Task: Is this code will work? How many transactions will be opened? If it won't work, make code review.

```java
public final class Client {
    public long id;
    public String name;
    public static ArrayList<String> roles = new ArrayList<>();

    private Client(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        Client client = (Client) o;
        return id == client.id && name == client.name;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
```
solution: Read more [here](./task_solution.md)