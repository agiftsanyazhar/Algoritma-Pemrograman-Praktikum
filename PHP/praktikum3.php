<?php
    //Nomor 1
    if (isset ($_POST['submit_1'])){
        $jam_1          = $_POST['jam_1'];
        $menit_1        = $_POST['menit_1'];
        $menitKemudian  = $_POST['menitKemudian'];

        $mTemp          = $menit_1 + $menitKemudian;

        if ($mTemp>=60){
            $menit_1     = $mTemp%60;
            $jTemp       = $mTemp/60;
            $jHasil      = $jam_1 + $jTemp;

            if ($jHasil>=24){
                $jFinal = $jHasil%24;
                echo "Jam " . $jFinal . "." . $menit_1;
            } else echo "Jam " . (int)$jHasil . "." . $menit_1;
        } else if ($jam_1>=24){
            $jFinal = $jam_1%24;
            echo "Jam " . (int)$jFinal . "." . $menit_1;
        } else echo "Jam " . (int)$jam_1 . "." . $mTemp;
    }

    //Nomor 2
    if (isset ($_POST['submit_2'])){
        $jam_2          = $_POST['jam_2'];
        $menit_2        = $_POST['menit_2'];
        $menitLalu      = $_POST['menitLalu'];

        $minTemp    = $menit_2 - $menitLalu;

        if ($jam_2>24){
            $jam_2 = $jam_2%24;
        } if ($minTemp<0){
            $minHasil = $minTemp%60+60;
            if ($minHasil>=60){
                $minHasil = 0;
            }
            $hTemp    = $minTemp/60-1;
            $hHasil   = $jam_2 + $hTemp + 1;

            if ($hHasil<0){
                $hFinal = $hHasil%24;
                $jNow   = 24 + $hFinal - 1;
                echo "Jam " . (int)$jNow . "." . $minHasil;
            } else {
                echo "Jam " . (int)$hHasil . "." . $minHasil;
            }
        } else {
            echo "Jam " . (int)$jam_2 . "." . $minTemp;
        }
    }
?>