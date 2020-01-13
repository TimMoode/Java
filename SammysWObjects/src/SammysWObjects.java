public class SammysWObjects {
    private String name;
    private String phone;
    private int totMinutes;
    private int hours;
    private int extraMinutes;
    private double cost;

    private static final int RATE = 40;

    public String getName(){
        return name;
    }

    public String getPhone(){
        return phone;
    }

    public int getTotMinutes() {
        return totMinutes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public void setTotMinutes(int totMinutes) {
        this.totMinutes = totMinutes;
    }

    public SammysWObjects(String name, String phone, int totMinutes) {


    }
}
