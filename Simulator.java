package Jamsibuk;

public class Simulator {

	    public static void main(String[] args) {
	        Asdos asdos1 = new Asdos("Fairuzikun", 5, 3);
	        System.out.println(asdos1);

	        Dosen dosen1 = new Dosen("Raja OP Damanik", 5);
	        System.out.println(dosen1);

	        Asdos asdos2 = new Asdos("Angel-chan", 4, 4);
	        System.out.println(asdos2);

	        Mahasiswa mahasiswa1 = new Mahasiswa("Firman", 3);
	        System.out.println(mahasiswa1);

	        Mahasiswa mahasiswa2 = new Mahasiswa("Nid to pass this sem", 3);
	        System.out.println(mahasiswa2);

	        Dosen dosen2 = new Dosen("Nivotko", 2);
	        System.out.println(dosen2);

	        int totalJamSibuk = asdos1.getJamSibuk() + asdos2.getJamSibuk() + mahasiswa1.getJamSibuk()
	        + mahasiswa2.getJamSibuk() + dosen1.getJamSibuk() + dosen2.getJamSibuk();
	        System.out.println("Total jam sibuk elemen Fasilkom adalah " + totalJamSibuk);
	    }
	}


