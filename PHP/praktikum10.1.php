<?php
    //Nomor 1
    if (isset ($_POST['submit_1'])){
        $n_1 = $_POST['n_1'];

        for ((int) $i=1; $i<=$n_1 + ($n_1 - 1); $i++){
            echo "<br>";
            for ((int) $j=1; $j<=$n_1; $j++){
                if ($i == $j){
                    echo "*";
                } else if ($i + $j == $n_1 * 2){
                    echo "*";
                } else echo "&nbsp&nbsp&nbsp&nbsp&nbsp";
            }
        }
    }
?>