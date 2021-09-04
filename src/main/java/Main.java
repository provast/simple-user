public class Main {
    public static void main(String[] args) {

        User user1 = new User("supervasya", "qwerty123");
        User user2 = new User("nagibator69", "ghesges35fes");
        User user3 = new User("i.ivanov2020", "Vanya888");

        System.out.println("Все пользователей: " + User.getTotalCounter());

        User[] users = new User[]{user1, user2, user3};

        for (User x : users) {
            System.out.println(x);
        }
    }
}
