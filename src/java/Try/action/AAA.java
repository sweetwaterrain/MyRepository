package Try.action;

import org.springframework.beans.factory.annotation.Autowired;

public class AAA {

    @Autowired
    private Cat cat;
    @Autowired
    private Dog dog;
    private String str;

    public Cat getCat(){
        return cat;
    }
    public Dog getDog(){
        return dog;
    }
    public String getStr(){
        return str;
    }
}
