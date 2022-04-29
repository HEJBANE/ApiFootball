package classes;

public class Season {
    public int id;
    public String startDate;
    public String endDate;
    public int currentMarchday;
    public Object winner;

    @Override
    public String toString() {
        return "Season{" +
                "id=" + id +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", currentMarchday=" + currentMarchday +
                ", winner=" + winner +
                '}';
    }
}
