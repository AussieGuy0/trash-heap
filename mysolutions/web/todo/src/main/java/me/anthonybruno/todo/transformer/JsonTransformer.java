package me.anthonybruno.todo.transformer;

import com.fasterxml.jackson.databind.ObjectMapper;
import spark.ResponseTransformer;

public class JsonTransformer implements ResponseTransformer {

    @Override
    public String render(Object o) throws Exception {
        return new ObjectMapper().writeValueAsString(o);
    }
}
