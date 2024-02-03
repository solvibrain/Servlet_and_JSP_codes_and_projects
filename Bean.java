import java.io.Serializable;
public class Bean implements Serializable{
    private String name;
    private int age;

    public Bean(String name, int age){
        this.age= age;
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public static void main(String[] args) {
        Bean bean1=new Bean("Rupesh",45);
        System.out.println("Before setting the values:");
        System.out.println("Name:"+bean1.getName());
        System.out.println("Age:"+bean1.getAge());
        System.out.println("\nAfter setting the values:");
        bean1.setName("John Doe");
        bean1.setAge(25);
        System.out.println("Name:"+bean1.getName());
        System.out.println("Age:"+bean1.getAge());
        
    }
}
