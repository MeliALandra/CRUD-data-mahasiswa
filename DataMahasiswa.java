package com.meli.cruddatamahasiswa;

public class dataMahasiswa {
    private String ID;
    private String NAMA;
    private String NIM;
    private String JURUSAN;
    private String ALAMAT;

    public dataMahasiswa() {
    }

    public dataMahasiswa(String ID, String NAMA, String NIM, String JURUSAN, String ALAMAT) {
        this.ID = ID;
        this.NAMA = NAMA;
        this.NIM = NIM;
        this.JURUSAN = JURUSAN;
        this.ALAMAT = ALAMAT;
    }

    public String getId() {
        return ID;
    }

    public void setId(String id) {
        this.ID = id;
    }

    public String getNama() {
        return NAMA;
    }

    public void setNama(String nama) {
        this.NAMA = nama;
    }

    public String getNim() {
        return NIM;
    }

    public void setNim(String nim) {
        this.NIM = nim;
    }

    public String getJurusan() {
        return JURUSAN;
    }

    public void setJurusan(String jurusan) {
        this.JURUSAN = jurusan;
    }

    public String getAlamat() {
        return ALAMAT;
    }

    public void setAlamat(String alamat) {
        this.ALAMAT = alamat;
    }
}
