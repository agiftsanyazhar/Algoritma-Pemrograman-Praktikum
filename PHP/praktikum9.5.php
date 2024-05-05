<?php
    //Nomor 5
    if (isset ($_POST['submit_5'])){
        $n_5 = $_POST['n_5'];

        $bil_2    = $n_5;
        $digit_2  = 0;

        function pangkat (int $n ,int $k){
            (int) $hasil = 1;
            for ((int) $i=0; $i<$k; $i++){
                $hasil = $hasil * $n;
            }
            return $hasil;
        }

        while ((int)$bil_2 != 0) {
            $bil_2    = $bil_2/10;
            $digit_2  = $digit_2 + 1;
        }

        while ((int)$digit_2 != 0) {
            $bil_2    = (int)($n_5/(int)pangkat(10, $digit_2-1)) * ((int)pangkat(10, $digit_2-1));
            $digit_2  = $digit_2 - 1;
            $n_5      = $n_5 - $bil_2;
            echo "Hasil = " . (int)$bil_2 . "<br>";
        } 
    }
?>