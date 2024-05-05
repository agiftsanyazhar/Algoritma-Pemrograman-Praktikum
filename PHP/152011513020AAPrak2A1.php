<?php
    echo "===============================<br/>";
    echo "Praktikum 2<br/>";
    echo "===============================<br/>";
    echo "<br/>";

    echo "===============================<br/>";
    echo "Nomor 1 Luas Segitiga<br/>";
    echo "===============================<br/>";
    $a = 12;
    $t = 4;

    $luassegitiga = 0.5*$a*$t;

    echo "Luas segitiga = " . $luassegitiga;
    echo "<br/>";

    echo "<br/>";
    echo "===============================<br/>";
    echo "Nomor 2 Hasil Bagi<br/>";
    echo "===============================<br/>";
    $n = 3;
    $m = 5;

    if ($m!=0){
        $hasil = $n/$m;
    } else "Tidak terdefinisi";
    echo "Hasil bagi = " . $hasil;
    echo "<br/>";

    echo "<br/>";
    echo "===============================<br/>";
    echo "Nomor 3 Keliling Lingkaran<br/>";
    echo "===============================<br/>";
    $r1   = 35;
    $phi  = 3.14;

    $kelilinglingkaran = 2*$phi*$r1;
    echo "Keliling lingkaran = " . $kelilinglingkaran;
    echo "<br/>";

    echo "<br/>";
    echo "===============================<br/>";
    echo "Nomor 4 Luas Lingkaran<br/>";
    echo "===============================<br/>";
    $r2   = 21;
    $phi  = 3.14;

    $luaslingkaran = $phi*$r2*$r2;
    echo "Luas lingkaran = " . $luaslingkaran;
    echo "<br/>";

?>