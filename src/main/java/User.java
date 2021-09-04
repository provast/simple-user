public class User {
    private static int counter;
    private int id;
    private String login;
    private String password;

    public User(String login, String password) {
        this.id = ++counter;
        this.login = login;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public static int getTotalCounter() {
        return counter;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                '}';
    }
}
