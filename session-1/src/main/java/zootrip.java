import java.util.ArrayList;

public class zootrip {
    public static void main() {
        ArrayList<String> bus = new ArrayList<>();
        bus.add("Ryan");
        bus.add("Brandon");
        bus.add("Rebecca");
        bus.add("Richard");
        bus.add("Jessica");
        bus.add("Brian");
        bus.add("Antoinne");
        bus.add("Grace");
        bus.add("Zee");
        bus.add("Ibrahim");

        bus.remove("Ibrahim");
        bus.add(0,"Ibrahim");
        bus.remove("Rebecca");
        bus.add("Rebecca");
        bus.remove("Richard");
        bus.add(5,"Richard");
        bus.remove("Ryan");
        bus.add(8,"Ryan");

        System.out.println(bus);
    }
}
