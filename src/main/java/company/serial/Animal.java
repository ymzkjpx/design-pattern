package company.serial;

import java.io.Serializable;

public class Animal implements Serializable {
    // serialVersionUIDはIntellij IDEAの機能を使って生成する
    private static final long serialVersionUID = -1903001089791975133L;
    private final int age;
    private final String name;
    private final String nickname;
    private final transient String park = "茶臼山動物園";

    public Animal(int age, String name, String nickname) {
        this.age = age;
        this.name = name;
        this.nickname = nickname;
    }

    public int age() {
        return age;
    }

    public String name() {
        return name;
    }

    public String nickname() {
        return nickname;
    }

    public String park() {
        return park;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                ", park='" + park + '\'' +
                '}';
    }
}
