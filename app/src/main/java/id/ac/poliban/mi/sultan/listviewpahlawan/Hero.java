package id.ac.poliban.mi.sultan.listviewpahlawan;

public class Hero {
    private String gambar;
    private String heroName;
    private String heroDesc;

    public Hero(String gambar, String heroName, String heroDesc) {
        this.gambar = gambar;
        this.heroName = heroName;
        this.heroDesc = heroDesc;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getHeroDesc() {
        return heroDesc;
    }

    public void setHeroDesc(String heroDesc) {
        this.heroDesc = heroDesc;
    }

    @Override
    public String toString() {
        return String.format("%30s", getHeroName());
    }
}
