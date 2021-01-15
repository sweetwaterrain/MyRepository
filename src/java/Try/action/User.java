package Try.action;

public class User {
    private String name;

    public User() {
//        System.out.println("User的无参构造");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("name:"+name);
    }
}
