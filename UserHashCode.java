import java.util.*;

public class UserHashCode {
    String name;

    public UserHashCode(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof UserHashCode))
            return false;

        UserHashCode other = (UserHashCode) o;
        return Objects.equals(name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}