class music{

    String favMusic;
    String albumName;
    int yearR;

    public music(String favMusic, String albumName, int yearR) {
        this.favMusic = favMusic;
        this.albumName = albumName;
        this.yearR = yearR;
    }

    public String getFavMusic() {
        return favMusic;
    }

    public void setFavMusic(String favMusic) {
        this.favMusic = favMusic;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public int getYearR() {
        return yearR;
    }

    public void setYearR(int yearR) {
        this.yearR = yearR;
    }

}