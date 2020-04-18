package lambda;

/**
 * @author chenyuhao
 * @version 1.0.0
 * @ClassName Employee.java
 * @Description TODO
 * @createTime 2020年04月16日 09:01:00
 */
public class Employee {
    Integer id;
    String name;
    Integer age;
    Double salary;

    @Override
    public String toString() {
        String res ="";
        res+="id: "+this.id;
        res+=" name: "+this.name;
        res+=" age: "+this.age;
        res+=" salary: "+this.salary;
        return res;
    }

    public Employee(Integer id, String name, Integer age, Double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
