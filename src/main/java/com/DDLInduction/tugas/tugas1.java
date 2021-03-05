package com.DDLInduction.tugas;

public class tugas1 {
    public static void main (String[] args){
        Siswa siswa = new siswa("Anang");
    }
}

class Siswa {
    Database database;
    public Siswa (){
        database = new Database();
    }
    public void add (String data){
        database.cetak(data);
    }
}

class Database {
    public void cetak(String data){
        System.out.println(data);
    }
}