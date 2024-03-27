public class Other extends music{

    String favOther;

    public Other(String favMusic, String albumName, int yearR, String favOther) {
        super(favMusic, albumName, yearR);
        this.favOther = favOther;
    }
    @Override
    public String toString() {
        return "Other{" +
                "\n    Favourite Music='" + favMusic + '\'' +
                "\n    Favourite Album='" + albumName + '\'' +
                "\n    Year of release=" + yearR +
                "\n    Singer='" + favOther + '\'' +
                "\n}";
    }
}
