package serialization.object;

import java.io.Serializable;

/**
 * Created by zhengyong on 17/5/27.
 */
public class Person implements Serializable {

    private static final long serialVersionUID = -1675192573963239698L;

    private Integer           id;
    private String            name;
    private String            email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name='" + name + '\'' + ", email='" + email + '\'' + '}';
    }

}
