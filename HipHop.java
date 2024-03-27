class HipHop extends music{

    String favHipHop;

    public HipHop(String favMusic, String albumName, int yearR, String favHipHop) {
        super(favMusic, albumName, yearR);
        this.favHipHop = favHipHop;
    }

    public String getFavHipHop() {
        return favHipHop;
    }

    public void setFavHipHop(String favHipHop) {
        this.favHipHop = favHipHop;
    }

    @Override
    public String toString() {
        return "HipHop{" +
                "\n    Favourite Music='" + favMusic + '\'' +
                "\n    Favourite Album='" + albumName + '\'' +
                "\n    Year of release=" + yearR +
                "\n    Singer='" + favHipHop + '\'' +
                "\n}"+
                "\nNope, not " +favHipHop;
    }
}