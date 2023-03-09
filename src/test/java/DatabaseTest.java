import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseTest {

    @Test
    public void mustReturnDriverClassName() {
        Database.getInstance().setDriverClassName("com.mysql.cj.jdbc.Driver");
        assertEquals("com.mysql.cj.jdbc.Driver", Database.getInstance().getDriverClassName());
    }

    @Test
    public void mustReturnDatabaseUrl() {
        Database.getInstance().setUrl("jdbc:mysql://localhost:3306/scp");
        assertEquals("jdbc:mysql://localhost:3306/scp", Database.getInstance().getUrl());
    }

    @Test
    public void mustReturnUsername() {
        Database.getInstance().setUsername("root");
        assertEquals("root", Database.getInstance().getUsername());
    }

    @Test
    public void mustReturnPassword() {
        Database.getInstance().setPassword("1234");
        assertEquals("1234", Database.getInstance().getPassword());
    }
}