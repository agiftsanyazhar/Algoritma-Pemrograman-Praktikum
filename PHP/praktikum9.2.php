<?php
    //Nomor 2
    if (isset ($_POST['submit_2'])){
        $n_2 = $_POST['n_2'];

        for ((int) $i=1; $i<=$n_2; $i++){
            for ((int) $j=$n_2 - ($n_2 - $i); $j<=$n_2; $j++){
                $bil = 3 * $j;
                echo ($bil<10?"&nbsp&nbsp":"").$bil."&nbsp&nbsp&nbsp&nbsp&nbsp";
            } echo "<br>";
        }
    }
?>