package communication.entities;

import java.util.HashMap;
import java.util.Map;

/**
 * 学生Java类
 */
public class Student {

    private String id;

    private String name;

    private String character;

    /*
    private volatile static Student student = null;
    private Student(){}
    public static  Student getInstance(){
        if(student == null) {                         //Single Checked
            synchronized (Student.class) {
                if (student == null) {                 //Double Checked
                    student = new Student();
                }
            }
        }
        return student ;
    }
    */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public Map getMap(){
        Map<String,Object> map =new HashMap<String,Object>();
        map.put("id",id);
        map.put("name",name);
        map.put("character",character);
        return map;
    }

    @Override
    public String toString(){
        return "student";
    }

}
