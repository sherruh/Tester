package Java3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    User user;

    @BeforeEach
    void setUp() {
        user=new User();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void checkLength() {
        Assertions.assertTrue(user.setLogin("123456dcscscsdcsdscsdcscd").length()<20);
    }

}