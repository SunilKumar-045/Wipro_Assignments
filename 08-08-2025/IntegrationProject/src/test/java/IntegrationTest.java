package test.java;

import user.java.User;
import user.java.UserRepository;
import user.java.UserService;

import java.io.IOException;
import java.util.List;

public class IntegrationTest {
    public static void main(String[] args) throws IOException {

        String testFilePath = "test_users.txt";
        UserRepository repo = new UserRepository(testFilePath);
        repo.clear();
        UserService service = new UserService(repo);
        service.registerUser("1", "Sunil");
        service.registerUser("2", "Yogi");
        List<User> users = service.getAllUsers();
        assert users.size() == 2 : "Expected 2 users";
        assert users.get(0).getName().equals("Sunil");
        assert users.get(1).getName().equals("Yogi");
        System.out.println("Integration test passed!");
        repo.clear();

    }
}
