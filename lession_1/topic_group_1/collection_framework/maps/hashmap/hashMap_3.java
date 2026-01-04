package lession_1.topic_group_1.collection_framework.maps.hashmap;

import java.util.HashMap;
import java.util.Objects;

public class hashMap_3 {
    public static void main(String[] args) {
        HashMap<Studenst, String> map = new HashMap<>();
        Studenst s1 = new Studenst("krishna", 789);
        Studenst s3 = new Studenst("krishna", 789);
        Studenst s2 = new Studenst("tonny", 789);

        map.put(s1, "pgl hai");
        map.put(s3, "intelligent hai");
        map.put(s2, "tagda");
        System.out.println(map);


    }

}

class Studenst {

    private String Name;
    private int id;

    public Studenst(String Name, int id) {
        this.Name = Name;
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "ye id: " + id + "ye value: " + Name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, id);
    }
}
