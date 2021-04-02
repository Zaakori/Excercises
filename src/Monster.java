import java.util.ArrayList;
import java.util.List;

public class Monster implements Saveable {

    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public List<String> write() {

        List<String> list = new ArrayList<>();

        list.add(name);
        list.add(String.valueOf(hitPoints));
        list.add(String.valueOf(strength));

        return list;

    }

    @Override
    public void read(List<String> list) {

        if(list == null || list.size() <= 0){
            return;
        }

        name = list.get(0);
        hitPoints = Integer.parseInt(list.get(1));
        strength = Integer.parseInt(list.get(2));

    }

    @Override
    public String toString(){

        return "Monster{name='" + name + "', hitPoints=" + hitPoints + ", strength=" + strength + "}";

    }


}
