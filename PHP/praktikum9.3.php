<?php
    //Nomor 3
    if (isset ($_POST['submit_3'])){
        $n_3 = $_POST['n_3'];

        for ((int) $i=0; $i<$n_3; $i++){
            for ((int) $j=1; $j<=$n_3-($n_3 - ($i + 1)); $j++){
                $bil = 2 * ($j + $i);
                echo ($bil<10?"&nbsp&nbsp":"").$bil."&nbsp&nbsp&nbsp&nbsp&nbsp";
            } echo "<br>";
        }
    }
?>