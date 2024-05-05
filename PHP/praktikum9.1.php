<?php
    //Nomor 1
    if (isset ($_POST['submit_1'])){
        $n_1 = $_POST['n_1'];

        for ((int) $i=0; $i<$n_1; $i++){
            for ((int) $j=1; $j<=$n_1; $j++){
                $bil = $i + $j * 2 + (($n_1 - 1)*$i);
                echo ($bil<10?"&nbsp&nbsp":"").$bil."&nbsp&nbsp&nbsp&nbsp&nbsp";
            } echo "<br>";
        }
    }
?>