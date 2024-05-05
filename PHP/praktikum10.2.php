<?php
    //Nomor 2
    if (isset ($_POST['submit_2'])){
        $n_2 = $_POST['n_2'];

        for ((int) $i=1; $i<=$n_2; $i++){
            echo "<br>";
            for ((int) $j=1; $j<=$n_2 + ($n_2 - 1); $j++){
                if ($i + $j == $n_2 + 1){
                    echo "*";
                } else if ($j - $i == $n_2 - 1){
                    echo "&nbsp&nbsp&nbsp";
                    echo "*";
                } else echo "&nbsp&nbsp&nbsp&nbsp&nbsp";
            }
        }
    }
?>