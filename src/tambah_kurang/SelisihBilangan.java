package tambah_kurang;

/**
 * @author
 * NAMA     : Anggawan Ridho
 * KELAS    : IF 10K
 * NIM      : 10119909
 */

public class SelisihBilangan extends Bilangan {
    public void tampilSelisih(){
        int hitungSelisih = getX() - getY();
        System.out.println("Hasil selisih " + getX() + " - " + getY() + " = " + hitungSelisih);
    }
}
