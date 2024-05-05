<?php
    //Nomor 4
    if (isset ($_POST['submit_4'])){
        $n_4 = $_POST['n_4'];

        $digit  = 0;

        do {
            $n_4    = $n_4/10;
            $digit  = $digit + 1;
        } while ($n_4 > 1);
        echo "Jumlah digit = " . $digit;
    }
?>