<?php
    //Nomor 1
    if (isset ($_POST['submit_1'])){
        $a = $_POST['a'];
        $b = $_POST['b'];
        $c = $_POST['c'];

        $hit = 0;

        if ($a>10 && $a<20){
            $hit = $hit + 1;
        } if ($b>10 && $b<20){
            $hit = $hit + 1;
        } if ($c>10 && $c<20){
            $hit = $hit + 1;
        } echo "Banyaknya bilangan di antara 10 dan 20 adalah " . $hit;
    }

    //Nomor 2
    if (isset ($_POST['submit_2'])){
        $n = $_POST['n'];

        if ($n==1){
            echo "Hari ke-".$n." adalah Senin";
        } else if ($n==2){
            echo "Hari ke-".$n." adalah Selasa";
        } else if ($n==3){
            echo "Hari ke-".$n." adalah Rabu";
        } else if ($n==4){
            echo "Hari ke-".$n." adalah Kamis";
        } else if ($n==5){
            echo "Hari ke-".$n." adalah Jumat";
        } else if ($n==6){
            echo "Hari ke-".$n." adalah Sabtu";
        } else if ($n==7){
            echo "Hari ke-".$n." adalah Ahad";
        } else echo "Error";
    }
?>