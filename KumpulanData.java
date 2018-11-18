package id.go.februrian.membuatrecyclerview;

import android.media.Image;
import android.widget.ImageView;

public class KumpulanData {
    String judul,isi;


    public KumpulanData() {
    }


    public KumpulanData(String judul, String isi) {
        this.judul = judul;
        this.isi = isi;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getIsi() {
        return isi;
    }

    public void setIsi(String isi) {
        this.isi = isi;
    }
}
