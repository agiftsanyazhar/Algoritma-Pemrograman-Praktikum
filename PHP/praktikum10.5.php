<?php
    //Nomor 5
    if (isset ($_POST['submit_5'])){
        $n_5 = $_POST['n_5'];

        for ((int) $i=1; $i<=$n_5; $i++){
            echo "<br>";
            for ((int) $j=1; $j<=$n_5 + ($n_5 - 1); $j++){
                if ($i + $j == $n_5 + 1){
                    echo "*";
                } else if ($j - $i == $n_5 - 1){
                    echo "&nbsp&nbsp&nbsp";
                    echo "*";
                } else echo "&nbsp&nbsp&nbsp&nbsp&nbsp";
            }
        }

        for ((int) $i=1; $i<=$n_5; $i++){
            echo "<br>";
            for ((int) $j=1; $j<=$n_5 + ($n_5 - 1); $j++){
                if ($i == $j){
                    echo "*";
                } else if ($i + $j == $n_5 * 2){
                    echo "&nbsp&nbsp&nbsp";
                    echo "*";
                } else echo "&nbsp&nbsp&nbsp&nbsp&nbsp";
            }
        }
    }
?>