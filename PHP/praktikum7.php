<?php
    //Nomor 1
    if (isset ($_POST['submit_1'])){
        $n_1 = $_POST['n_1'];

        echo "Output : ";
        for ((int) $i=1; $i<$n_1; $i++){
            if ($n_1 % $i == 0){
                if ($i%2!=0){
                    echo $i . " ";
                }
            }
        }
    }

    //Nomor 2
    if (isset ($_POST['submit_2'])){
        $n_2 = $_POST['n_2'];

        $jumlah = 0;

        echo "Output : ";
        for ((int) $i=1; $i<=$n_2; $i++){
            if ($n_2 % $i == 0){
                echo $i . " ";
                $jumlah = $jumlah + $i;
            }
        }
        echo "<br>";
        echo "Jumlah semua faktor positif dari " . $n_2 . " adalah " . $jumlah;
    }

    //Nomor 3
    if (isset ($_POST['submit_3'])){
        $n_3 = $_POST['n_3'];

        $hasil = 0;

        echo "Output : ";
        for ((int) $i=1; $i<=$n_3; $i++){
            if ($n_3 % $i == 0){
                echo $i . " ";
                $hasil = $hasil + 1;
            }
        }
        echo "<br>";
        echo "Banyaknya faktor dari bilangan " . $n_3 . " adalah " . $hasil;
    }

    //Nomor 4
    if (isset ($_POST['submit_4'])){
        $n_4 = $_POST['n_4'];

        $faktor = 0;

        echo "Output : ";
        for ((int) $i=1; $i<=$n_4; $i++){
            if ($n_4 % $i == 0){
                echo $i . " ";
                $faktor = $faktor + 1;
            }
        } if ($faktor == 2){
            echo "<br>";
            echo $n_4 . " merupakan bilangan prima";
        } else {
            echo "<br>";
            echo $n_4 . " bukan bilangan prima";
        }
    }
?>