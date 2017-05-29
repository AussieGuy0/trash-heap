package me.anthonybruno.todo.util;


import me.anthonybruno.todo.BasicPojo;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class JsonUtilsTest {

    @Test
    public void convertStringToObject() {
        BasicPojo pojo = JsonUtils.convertStringToObject(BasicPojo.class, "{\"id\":200,\"name\":\"Bob\",\"hasCar\":false,\"numbers\":[0,1,2]}");
        assertEquals(200, pojo.getId());
        assertEquals("Bob", pojo.getName());
        assertEquals(false,pojo.isHasCar());
        assertArrayEquals(new int[]{0,1,2}, pojo.getNumbers());
    }

    @Test
    public void convertBadStringToObject() {
        BasicPojo pojo = JsonUtils.convertStringToObject(BasicPojo.class, "{\"UUID\":200,\"hasCar\":false}");
    }

}
