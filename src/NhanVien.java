public class NhanVien {
    private String name;
    private int bornD;
    private int bornM;
    private int bornY;
    private boolean isMale;

    public NhanVien(String name, int bornD, int bornM, int bornY, boolean isMale) {
        this.name = name;
        this.bornD = bornD;
        this.bornM = bornM;
        this.bornY = bornY;
        this.isMale = isMale;
    }

    public String getName() {
        return name;
    }

    public int getBornD() {
        return bornD;
    }

    public int getBornM() {
        return bornM;
    }

    public int getBornY() {
        return bornY;
    }

    public boolean isMale() {
        return isMale;
    }
}
