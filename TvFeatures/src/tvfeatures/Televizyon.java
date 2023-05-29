package oop_giris;

public class Televizyon {
    private int kanal;
    private int sesSeviyesi;
    private boolean acik;

    public void setKanal(int kanal) {
        if(acik && kanal>0 && kanal<500) {
            this.kanal=kanal;
        }else {
            System.out.println("Televizyon kapali veya yanlis bir kanal degeri girdiniz");
        }

    }
    public int getKanal() {
        return kanal;
    }

    public int getSesSeviyesi() {
        return sesSeviyesi;
    }

    public void setSesSeviyesi(int sesSeviyesi) {
        if (acik && sesSeviyesi>0 && sesSeviyesi<25) {
            this.sesSeviyesi = sesSeviyesi;
        }else {
            this.sesSeviyesi=1;
        }


    }

    public boolean isAcik() {
        return acik;
    }

    public void setAcik(boolean acik) {
        this.acik = acik;
    }

    public void ac() {
        if(acik) {
            System.out.println("televizyon zaten acik");
        }else {
            System.out.println("Televizyon aciliyor");
            acik=true;
        }
    }
    public void kapat() {
        if (acik==false) {
            System.out.println("Televizyon zaten kapali");
        }else {
            System.out.println("Televizyon kapatiliyor");
            acik=false;

        }
    }
    public void goster() {
        System.out.println("Tv acik = " + acik + " Ses Seviyesi = " + sesSeviyesi + "Kanal = " + kanal);
    }
}
