public class Old extends music{

    String favOld;

    public Old(String favMusic, String albumName, int yearR, String favOld) {
        super(favMusic, albumName, yearR);
        this.favOld = favOld;
    }

    public String getFavOld() {
        return favOld;
    }

    public void setFavOld(String favOld) {
        this.favOld = favOld;
    }

    @Override
    public String toString() {
        return "Old{" +
                "\n    Favourite Music='" + favMusic + '\'' +
                "\n    Favourite Album='" + albumName + '\'' +
                "\n    Year of release=" + yearR +
                "\n    Singer='" + favOld + '\'' +
                "\n}" +
                "\n I like 'I just called to Say I love you'!";
    }
}
