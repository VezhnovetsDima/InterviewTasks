## Task: make code review

```java
import lombok.Getter;
import lombok.Setter;

public final class Client {
    
    @Getter
    @Setter
    private long id;
    
    @Getter
    @Setter
    public String name;//ask about synchronyzed, why, for what, but we did atomic operation when setName, so it is useless
    
    private static ArrayList<String> roles = new ArrayList<>();

    private Client(long id) {
        this.id = id;
    }

    public static void addRole(String role) {
        roles.add(role);
    }

    public static List<String> getRoles() {
        return Collections.unmodifiableList(roles);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Check for self-reference
        if (o == null || getClass() != o.getClass()) return false; // Null/type check
        Client client = (Client) o;
        return id == client.id && Objects.equals(name, client.name);
    }


    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
```