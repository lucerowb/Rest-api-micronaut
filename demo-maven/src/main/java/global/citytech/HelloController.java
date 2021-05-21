package global.citytech;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;

@Controller("/hello")
public class HelloController {

    @Get
    public String hello(){
        return "Hello World";
    }

/*
    @Post("post")
    public String post(String name){
        return "Hello "+name;
    }
*/
}
