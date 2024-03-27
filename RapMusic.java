class RapMusic extends music{

    String favRap;

    public RapMusic(String favMusic, String albumName, int yearR, String favRap) {
        super(favMusic, albumName, yearR);
        this.favRap = favRap;
    }

    public String getFavRap() {
        return favRap;
    }

    public void setFavRap(String favRap) {
        this.favRap = favRap;
    }

    @Override
    public String toString() {
        return "RapMusic{" +
                "\n    Favourite Music='" + favMusic + '\'' +
                "\n    Favourite Album='" + albumName + '\'' +
                "\n    Year of release=" + yearR +
                "\n    Singer='" + favRap + '\'' +
                "\n}"+
                "\n - EMINEM IS GOD - ";
    }
}