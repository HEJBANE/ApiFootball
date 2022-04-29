package classes;


public class Competition {
   public int id;
   public Area area;
   public String name;
   public String code;
   public String emblemUrl;
   public String plan;
   public Season currentSeason;
   public int numberOfAvailableSeasons;
   public String lastUpdated;

    @Override
    public String toString() {
        return "Competition{" +
                "id=" + id +
                ", area=" + area +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", emblemUrl='" + emblemUrl + '\'' +
                ", plan='" + plan + '\'' +
                ", currentSeason=" + currentSeason +
                ", numberOfAvailableSeasons=" + numberOfAvailableSeasons +
                ", lastUpdated='" + lastUpdated + '\'' +
                '}';
    }
}
