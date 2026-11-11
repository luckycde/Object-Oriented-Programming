<div align="center">
  
# TUGAS UTS PEMROGRAMAN BERBASIS OBJEK
### Lucky Nurdiansayah
### (2520097)

</div>

---
 1. **Membuat program dengan bahasa pemrograman Java untuk menampilkan bilangan genap antara 1 sampai 100 dengan menggunakan konsep looping**

```java
// (2520097)

public class Bil_Genap {

    public static void main(String[] args) {

        System.out.println("Bilangan Genap 1 sampai 100 menggunakan for loop\n");

        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n---------------------=---------------------\n");

        System.out.println("Bilangan Genap 1 sampai 100 menggunakan while loop\n");
        int i = 2;

        while (i <= 100) {
            System.out.print(i + " ");
            i += 2;
        }
    }
}
```

#### Penjelasan Program

Program Java ini digunakan untuk menampilkan bilangan genap dari 1 sampai 100 menggunakan dua metode perulangan, yaitu `for loop` dan `while loop`.

1. `System.out.println()` digunakan untuk menampilkan judul program.
2. `for (int i = 2; i <= 100; i += 2)` melakukan perulangan dari 2 sampai 100 dengan kenaikan 2.
3. `System.out.print(i + " ")` digunakan untuk menampilkan angka dalam satu baris.
4. `System.out.println("\n\n---------------------=---------------------\n")` digunakan untuk membuat garis pemisah antara kedua metode.
5. `int i = 2` menentukan nilai awal pada perulangan `while`.
6. `while (i <= 100)` melakukan perulangan selama nilai `i` tidak lebih dari 100.
7. `i += 2` menambah nilai sebanyak 2 setiap perulangan.

**Kesimpulan:** Kedua metode menghasilkan output yang sama, yaitu bilangan genap dari 2 sampai 100. Perbedaannya terletak pada cara penulisan dan pengaturan perulangannya.

#### Output yg dihasilkan

**For Loop**

```text
Bilangan Genap 1 sampai 100 menggunakan for loop

2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40
42 44 46 48 50 52 54 56 58 60 62 64 66 68 70 72 74 76 78 80
82 84 86 88 90 92 94 96 98 100
```

**While Loop**

```text
Bilangan Genap 1 sampai 100 menggunakan while loop

2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40
42 44 46 48 50 52 54 56 58 60 62 64 66 68 70 72 74 76 78 80
82 84 86 88 90 92 94 96 98 100
```
#
#

2. **Buatlah dalam program, bahasa Java untuk menghitung luas persegi panjang jika diketahui panjang =5 dan lebar = 8 !**

```java

public class LuasPersegiPanjang {

    public static void main(String[] args) {

        int panjang = 5;
        int lebar = 8;

        int luas = panjang * lebar;

        System.out.println("Menghitung Luas Persegi Panjang");
        System.out.println("------------------------------");
        System.out.println("Panjang : " + panjang);
        System.out.println("Lebar   : " + lebar);
        System.out.println("------------------------------");
        System.out.println("Luas    : " + luas);
    }
}
```
#### Penjelasan Program

Program Java ini digunakan untuk menghitung luas persegi panjang dengan panjang 5 dan lebar 8.

1. `int panjang = 5` menentukan nilai panjang.
2. `int lebar = 8` menentukan nilai lebar.
3. `int luas = panjang * lebar` menghitung luas dengan mengalikan panjang dan lebar.
4. `System.out.println()` digunakan untuk menampilkan panjang, lebar, dan hasil perhitungan.

#### Hasil Output

```text
Menghitung Luas Persegi Panjang
------------------------------
Panjang : 5
Lebar   : 8
------------------------------
Luas    : 40
```

#
#
3. **Gunakan If Else untuk membuat program menghitung nilai sesuai dengan kriteria dibawah ini ke dalam clas hiung_nilai !**
Nilai di antara 90 hingga 100 output Grade = A
Nilai di antara 81 hingga 90 output Grade = B
Nilai di antara 71 hingga 80 output Grade = C
Nilai di antara 61 hingga 70 output Grade = D
Nilai di bawah 60, output Grade = E**

```java

public class Hitung_Nilai {

    public static void main(String[] args) {
        int Nilai = 50;
        char Grade;

        if (Nilai >= 85 && Nilai <= 100) {
            Grade = 'A';
        } else if (Nilai >= 75 && Nilai < 85) {
            Grade = 'B';
        } else if (Nilai >= 60 && Nilai < 75) {
            Grade = 'C';
        } else if (Nilai >= 35 && Nilai < 60) {
            Grade = 'D';
        } else {
            Grade = 'E';
        }

        System.out.println("Nilai=" + Nilai);
        System.out.println("Grade Anda=" + Grade);
    }
}
```
#### Penjelasan Program

Program Java ini digunakan untuk menentukan grade berdasarkan nilai yang diperoleh menggunakan percabangan `if else`.

1. `int Nilai = 50` menentukan nilai yang akan diperiksa.
2. `char Grade` digunakan untuk menyimpan hasil grade.
3. `if` digunakan untuk memeriksa apakah nilai masuk kategori A.
4. `else if` digunakan untuk memeriksa kategori B, C, dan D.
5. `else` digunakan untuk memberikan grade E jika tidak memenuhi kondisi sebelumnya.
6. `System.out.println()` digunakan untuk menampilkan nilai dan grade.

#### Hasil Output

```text
Nilai=50
Grade Anda=D
```