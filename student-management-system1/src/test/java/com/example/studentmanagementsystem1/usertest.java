package com.example.studentmanagementsystem1;
import com.example.studentmanagementsystem1.model.Student;
import org.apache.catalina.User;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.skyscreamer.jsonassert.JSONAssert.assertEquals;

public class usertest {



       @Test
        public void testGetRegistrationnumber() {
            Student user = new Student();
            user.setRegistrationnumber("D/BSE/21/0003");
            assertEquals("D/BSE/21/0003", user.getRegistrationnumber());
        }

        @Test
        public void testGetFirstname() {
            User user = new User();
            user.setFirstname("Gayashani");
            assertEquals("Gayashani", user.getFirstname());
        }

        @Test
        public void testGetLastname() {
            User user = new User();
            user.setLastname("Divynjalee");
            assertEquals("Divyanjalee", user.getLastname());
        }

        @Test
        public void testGetEmail() {
            User user = new User();
            user.setEmail("gayaherath9468@gmail.com");
            assertEquals("gayaherath9468@gmail.com", user.getEmail());
        }

        @Test
        public void testGetId() {
            User user = new User();
            user.setId(1L);
            assertEquals(1L, user.getId().longValue());
    }





    }
