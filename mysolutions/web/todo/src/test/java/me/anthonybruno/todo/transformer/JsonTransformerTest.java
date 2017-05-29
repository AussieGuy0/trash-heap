package me.anthonybruno.todo.transformer;

import org.junit.Test;
import spark.ResponseTransformer;

import static org.junit.Assert.assertEquals;

public class JsonTransformerTest {

    @Test
    public void basicTransformerTest() {
        ResponseTransformer transformer = new JsonTransformer();
        BasicPojo basicPojo = new BasicPojo(200, "Bob", false, new int[] { 0, 1, 2});
        try {
            assertEquals("{\"id\":200,\"name\":\"Bob\",\"hasCar\":false,\"numbers\":[0,1,2]}", transformer.render(basicPojo));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
