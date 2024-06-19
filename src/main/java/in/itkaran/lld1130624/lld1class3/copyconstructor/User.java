package in.itkaran.lld1130624.lld1class3.copyconstructor;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class User {
    private String name;
    private int age;
    private List numList;

    // As soon as we write one or more constructor(s)
    // the default constructor provided by Java
    // is not no longer available
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Java does not provide any default copy copy constructor
    public User (User user) {
        this.name = user.name;
        this.age = user.age;
        this.numList = user.numList;
    }
}
