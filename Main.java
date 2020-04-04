import koneksi.Database;
import model.MataKuliah;
import model.Dosen;
import model.Mahasiswa;

public class Main{
    public static void main(String [] args){
        System.out.println("Ini program main");
        Database.hubungkan();
        Dosen.tampilanInfo();
        Mahasiswa.tampilanInfo();
        MataKuliah.tampilanInfo();
    }
}
