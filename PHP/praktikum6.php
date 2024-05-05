<?php
    //Nomor1
    if (isset ($_POST['submit_1'])){
        $a = $_POST['a'];
        $b = $_POST['b'];
        $c = $_POST['c'];
        $d = $_POST['d'];

        $jumlah = 0;

        if ($a>0) {
            $jumlah+= $a;
        }
        if ($b>0) {
            $jumlah+= $b;
        }
        if ($c>0) {
            $jumlah+= $c;
        }
        if ($d>0) {
            $jumlah+= $d;
        }
        echo "Jumlah digit penyusunnya = " .$jumlah;
    }

    //Nomor 2
    if (isset ($_POST['submit_2'])){
        $o = $_POST['o'];

        $digit6      = $o%10;
        $digit5      = $o/10%10;
        $digit4      = $o/100%10;
        $digit3      = $o/1000%10;
        $digit2      = $o/10000%10;
        $digit1      = $o/100000%10;
        $hit         = 0;
        $bilGenap    = 0;

        if ($o>=100000 && $o<1000000){
            if ($digit1%2==0){
                echo "Digit genap = " . $digit1 . "<br>";
                $hit        = $hit + 1;
                $bilGenap   = ($bilGenap + $digit1)*10;
            } if ($digit2%2==0){
                echo "Digit genap = " . $digit2 . "<br>";
                $hit        = $hit + 1;
                $bilGenap   = ($bilGenap + $digit2)*10;
            } if ($digit3%2==0){
                echo "Digit genap = " . $digit3 . "<br>";
                $hit        = $hit + 1;
                $bilGenap   = ($bilGenap + $digit3)*10;
            } if ($digit4%2==0){
                echo "Digit genap = " . $digit4 . "<br>";
                $hit        = $hit + 1;
                $bilGenap   = ($bilGenap + $digit4)*10;
            } if ($digit5%2==0){
                echo "Digit genap = " . $digit5 . "<br>";
                $hit        = $hit + 1;
                $bilGenap   = ($bilGenap + $digit5)*10;
            } if ($digit6%2==0){
                echo "Digit genap = " . $digit6 . "<br>";
                $hit        = $hit + 1;
                $bilGenap   = ($bilGenap + $digit6)*10;
            }
            $bilGenap =$bilGenap/10;
            echo "Jumlah digit genap = " . $hit . "<br>";
            echo "Digit baru = ". $bilGenap;
        } else echo "Error";
    }
?>