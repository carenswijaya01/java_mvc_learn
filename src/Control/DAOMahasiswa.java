package Control;

import Model.Mahasiswa;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DAOMahasiswa {

    File f = null;
    FileReader fRead = null;
    BufferedReader bRead = null;

    FileWriter fWrite = null;
    BufferedWriter bWrite = null;

    Mahasiswa m;

    public DAOMahasiswa() {
        f = new File("D:\\mahasiswa.txt");
    }

    public List<Mahasiswa> getAll() {
        List<Mahasiswa> list = new ArrayList<Mahasiswa>();
        try {
            fRead = new FileReader(f);
            bRead = new BufferedReader(fRead);
            String x = bRead.readLine();
            while (x != null) {
                m = new Mahasiswa();
                String[] temp = x.split("#");
                m.setNim(temp[0]);
                m.setNama(temp[1]);
                m.setUmur(Integer.parseInt(temp[2]));
                m.setGender(temp[3].charAt(0));
                list.add(m);
                x = bRead.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File Not Found!");
        } catch (IOException ex) {
            System.out.println("Inputan Eror");
        } finally {
            try {
                fRead.close();
                bRead.close();
            } catch (IOException ex) {
            }
            return list;
        }
    }

    public void updateMhs(List<Mahasiswa> ls) {
        try {
            fWrite = new FileWriter(f);
            bWrite = new BufferedWriter(fWrite);
            for (Mahasiswa mhs : ls) {
                String temp = "";
                temp += mhs.getNim();
                temp += "#" + mhs.getNama();
                temp += "#" + mhs.getUmur();
                temp += "#" + mhs.getGender()+ "\n";
                bWrite.write(temp);
            }
            bWrite.close();
        } catch (IOException ex) {
            System.out.println("Eror");
        }
    }
}