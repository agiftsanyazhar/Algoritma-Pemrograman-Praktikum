<?php
    //Nomor 3
    if (isset ($_POST['submit_3'])){
        $n_3 = $_POST['n_3'];

        for ((int) $i=1; $i<=$n_3 + ($n_3 - 1); $i++){
            echo "<br>";
            for ((int) $j=1; $j<=$n_3; $j++){
                if ($i + $j == $n_3 + 1){
                    echo "*";
                } else if ($i - $j == $n_3 - 1){
                    echo "*";
                } else echo "&nbsp&nbsp&nbsp&nbsp&nbsp";
            }
        }
    }
?>