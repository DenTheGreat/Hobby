package Hobby;

public class Hobby {
    private int price;
    private short vrm_phases;
    private long year_of_prod;
    private float mb_height_in_cm;
    private double mb_width_in_cm;
    private boolean unlocked_oc;
    private char chipset;
    private String hobby_name;


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public short getVrm_phases() {
        return vrm_phases;
    }

    public void setVrm_phases(short vrm_phases) {
        this.vrm_phases = vrm_phases;
    }

    public long getYear_of_prod() {
        return year_of_prod;
    }

    public void setYear_of_prod(long year_of_prod) {
        this.year_of_prod = year_of_prod;
    }

    public float getMb_height_in_cm() {
        return mb_height_in_cm;
    }

    public void setMb_height_in_cm(float mb_height_in_cm) {
        this.mb_height_in_cm = mb_height_in_cm;
    }

    public double getMb_width_in_cm() {
        return mb_width_in_cm;
    }

    public void setMb_width_in_cm(double mb_width_in_cm) {
        this.mb_width_in_cm = mb_width_in_cm;
    }

    public boolean isUnlocked_oc() {
        return unlocked_oc;
    }

    public void setUnlocked_oc(boolean unlocked_oc) {
        this.unlocked_oc = unlocked_oc;
    }

    public String getHobby_name() {
        return hobby_name;
    }

    public void setHobby_name(String hobby_name) {
        this.hobby_name = hobby_name;
    }

    public char getChipset() {
        return chipset;
    }

    public void setChipset(char chipset) {
        this.chipset = chipset;
    }

    public Hobby(int price, short vrm_phases, long year_of_prod, float mb_height_in_cm, double mb_width_in_cm, boolean unlocked_oc, String hobby_name, char chipset) {
        this.price = price;
        this.vrm_phases = vrm_phases;
        this.year_of_prod = year_of_prod;
        this.mb_height_in_cm = mb_height_in_cm;
        this.mb_width_in_cm = mb_width_in_cm;
        this.unlocked_oc = unlocked_oc;
        this.hobby_name = hobby_name;
        this.chipset = chipset;
    }

    public Hobby() {
        super();
    }

    public Hobby(int price, short vrm_phases, boolean unlocked_oc, char chipset) {
        this.price = price;
        this.vrm_phases = vrm_phases;
        this.unlocked_oc = unlocked_oc;
        this.chipset = chipset;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "price=" + price +
                ", vrm_phases=" + vrm_phases +
                ", year_of_prod=" + year_of_prod +
                ", mb_height_in_cm=" + mb_height_in_cm +
                ", mb_width_in_cm=" + mb_width_in_cm +
                ", unlocked_oc=" + unlocked_oc +
                ", hobby_name='" + hobby_name + '\'' +
                ", chipset=" + chipset +
                '}';
    }
}


