package ternaryoperator;

public class TernaryOperator {
    public static void main(String[] args) {
        String gradeNilaiPbo = "A";
        String hasil = gradeNilaiPbo.equals("A") ?  "Lulus" : "tidaklulus";

        String OutputHasil = "Hasil ujian: ";
        System.out.println(OutputHasil + hasil);

    }
}
