<?php
    //Nomor1
    if (isset ($_POST['submit_1'])){
        $n = $_POST['n'];

        if ($n>0 && $n<100000){
            if ($n>0 && $n<10){
                echo "Jumlah digit penyusunnya = " . $n;
            } else if ($n>=10 && $n<100){
                $b      = $n%10;
                $a      = $n/10%10;
                $hasil  = $a + $b;
                echo "Jumlah digit penyusunnya = " . $hasil;
            } else if ($n>=100 && $n<1000){
                $c      = $n%10;
                $b      = $n/10%10;
                $a      = $n/100%10;
                $hasil  = $a + $b + $c;
                echo "Jumlah digit penyusunnya = " . $hasil;
            } else if ($n>=1000 && $n<10000){
                $d      = $n%10;
                $c      = $n/10%10;
                $b      = $n/100%10;
                $a      = $n/1000%10;
                $hasil  = $a + $b + $c + $d;
                echo "Jumlah digit penyusunnya = " . $hasil;
            } else if ($n>=10000 && $n<100000){
                $e      = $n%10;
                $d      = $n/10%10;
                $c      = $n/100%10;
                $b      = $n/1000%10;
                $a      = $n/10000%10;
                $hasil  = $a + $b + $c + $d + $e;
                echo "Jumlah digit penyusunnya = " . $hasil;
            }
        } else echo "Error";
    }

    //Nomor 2
    if (isset ($_POST['submit_2'])){
        $o = $_POST['o'];

        $hit = 0;

        if ($o>=10000 && $o<100000){
            $digit5      = $o%10;
            $digit4      = $o/10%10;
            $digit3      = $o/100%10;
            $digit2      = $o/1000%10;
            $digit1      = $o/10000%10;

            if ($digit1%2==0){
                $hit = $hit + 1;
            } if ($digit2%2==0){
                $hit = $hit + 1;
            }if ($digit3%2==0){
                $hit = $hit + 1;
            }if ($digit4%2==0){
                $hit = $hit + 1;
            }if ($digit5%2==0){
                $hit = $hit + 1;
            } echo "Jumlah digit genap = " . $hit;
        } else echo "Error";
    }

    //Nomor 3
    if (isset ($_POST['submit_3'])){
        $p = $_POST['p'];

        $d5      = $p%10;
        $d4      = $p/10%10;
        $d3      = $p/100%10;
        $d2      = $p/1000%10;
        $d1      = $p/10000%10;

        if ($p>10000 && $p<100000){
            if ($d1==$d2){
                echo "Ada digit yang kembar";
            } else if ($d1==$d2){
                echo "Ada digit yang kembar";
            } else if ($d1==$d3){
                echo "Ada digit yang kembar";
            } else if ($d1==$d4){
                echo "Ada digit yang kembar";
            } else if ($d1==$d5){
                echo "Ada digit yang kembar";
            } else if ($d2==$d3){
                echo "Ada digit yang kembar";
            } else if ($d2==$d4){
                echo "Ada digit yang kembar";
            } else if ($d2==$d5){
                echo "Ada digit yang kembar";
            } else if ($d3==$d4){
                echo "Ada digit yang kembar";
            } else if ($d3==$d5){
                echo "Ada digit yang kembar";
            } else if ($d4==$d5){
                echo "Ada digit yang kembar";
            } else echo "Tidak ada digit yang kembar";
        } else echo "Error";
    }
?>