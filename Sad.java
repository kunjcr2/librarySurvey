public class Sad extends music{
    String favSad;

    public Sad(String favMusic, String albumName, int yearR, String favSad) {
        super(favMusic, albumName, yearR);
        this.favSad = favSad;
    }

    public String getFavSad() {
        return favSad;
    }

    public void setFavSad(String favSad) {
        this.favSad = favSad;
    }

    @Override
    public String toString() {
        return "Sad{" +
                "\n    Favourite Music='" + favMusic + '\'' +
                "\n    Favourite Album='" + albumName + '\'' +
                "\n    Year of release=" + yearR +
                "\n    Singer='" + favSad + '\'' +
                "\n}"+
                "\nI like Boywithuke!!!!";
    }
}
