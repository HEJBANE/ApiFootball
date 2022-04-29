package classes;

public class Area {
   public int id;
   public String name;
   public String countryCode;

    @Override
    public String toString() {
        return "Area{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", countryCode='" + countryCode + '\'' +
                '}';
    }
}
