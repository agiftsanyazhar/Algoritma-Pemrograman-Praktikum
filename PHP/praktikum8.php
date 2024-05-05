<?php
    //Nomor 1
    if (isset ($_POST['submit_1'])){
        $n_1 = $_POST['n_1'];

        echo "Output : ";
        for ((int) $i=1; $i<$n_1; $i++){
            if ($i % 2 == 0){
                echo $i . " ";
            }
        }
    }

    //Nomor 2
    if (isset ($_POST['submit_2'])){
        $n_2 = $_POST['n_2'];

        echo "Output : ";
        for ((int) $i=1; $i<$n_2; $i++){
            if ($i % 4 == 0 && $i % 3 != 0){
                echo $i . " ";
            }
        }
    }

    //Nomor 3
    if (isset ($_POST['submit_3'])){
        $n_3 = $_POST['n_3'];

        $hit_1 = 0;

        echo "Output : ";
        for ((int) $i=1; $i<$n_3; $i++){
            if ($i % 4 == 0 && $i % 3 != 0){
                echo $i . " ";
                $hit_1 = $hit_1 + $i;
            }
        }
        echo "<br>";
        echo "Output : " . $hit_1;
    }

    //Nomor 4
    if (isset ($_POST['submit_4'])){
        $n_4 = $_POST['n_4'];

        $hit_2 = 0;

        echo "Output : ";
        for ((int) $i=1; $i<$n_4; $i++){
            if ($i % 4 == 0 && $i % 3 != 0){
                echo $i . " ";
                $hit_2 = $hit_2 + 1;
            }
        }
        echo "<br>";
        echo "Output : " . $hit_2;
    }

    //Nomor 5
    if (isset ($_POST['submit_5'])){
        $n_5 = $_POST['n_5'];

        $hit_3 = 0;
        $cek_1 = 0;

        echo "Output : ";
        for ((int) $i=1; $i<$n_5; $i++){
            if ($i % 4 == 0 && $i % 3 != 0){
                echo $i . " ";
                $hit_3 = $hit_3 + 1;
            }
        }
        echo "<br>";
        $bagi = $hit_3/2;
        for ((int) $j=1; $j<=$n_5; $j++){
            if ($j % 4 == 0 && $j % 3 != 0){
                $cek_1 = $cek_1 + 1;
                if ($cek_1 == (int) $bagi){
                    echo "Output : " . $j;
                }
            }
        }
    }

    //Nomor 6
    if (isset ($_POST['submit_6'])){
        $n_6 = $_POST['n_6'];

        $jumlah = 0;
        $cek_2  = 0;
        $megan  = 0;
        $megen  = 0;
        $bil_1  = 0;
        $bil_2  = 0;
        $a      = 0;
        $b      = 0;

        echo "Output : ";
        for ((int) $i=1; $i<$n_6; $i++){
            if ($i % 4 == 0 && $i % 3 != 0){
                echo $i . " ";
                $jumlah = $jumlah + 1;
            }
        }

        echo "<br>";
        if ($jumlah % 2 != 0){
            $megan  = ($jumlah+1)/2;

            for ((int) $j=1; $j<$n_6; $j++){
                if ($j % 4 == 0 && $j % 3 != 0){
                    $cek_2 = $cek_2 + 1;
                    if ($cek_2 == $megan){
                        echo "Median ganjil = " . $j;
                    }
                }
            }
        } else {
            $bil_1  = $jumlah/2;
            $bil_2  = $bil_1+1;

            for ((int) $j=1; $j<$n_6; $j++){
                if ($j % 4 == 0 && $j % 3 != 0){
                    $cek_2 = $cek_2 + 1;

                    if ($cek_2 == $bil_1){
                        $a      = $a + $j;
                    } if ($cek_2 == $bil_2){
                        $b      = $b + $j;
                    }
                }
            }
            $megen  = ($a + $b)/2;
            echo "Median genap = " . $megen;
        }
    }
?>