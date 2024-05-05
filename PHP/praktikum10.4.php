<?php
    //Nomor 4
    if (isset ($_POST['submit_4'])){
        $n_4 = $_POST['n_4'];

        for ((int) $i=1; $i<=$n_4; $i++){
            echo "<br>";
            for ((int) $j=1; $j<=$n_4 + ($n_4 - 1); $j++){
                if ($i == $j){
                    echo "*";
                } else if ($i + $j == $n_4 * 2){
                    echo "&nbsp&nbsp&nbsp";
                    echo "*";
                } else echo "&nbsp&nbsp&nbsp&nbsp&nbsp";
            }
        }
    }
?>