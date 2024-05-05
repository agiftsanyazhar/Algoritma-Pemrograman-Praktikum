<?php
    //Nomor 6
    if (isset ($_POST['submit_6'])){
        $n = $_POST['n_6'];

        $digit3   = 0;
        $digit2_2 = 0;

        $bil3 = $n;

        function pangkat (int $n ,int $k){
            (int) $hasil = 1;
            for ((int) $i=0; $i<$k; $i++){
                $hasil = $hasil * $n;
            }
            return $hasil;
        }
        
        while ((int)$bil3!=0){
            $bil3    = $bil3/10;
            $digit3  = $digit3+1;
        }
        
        $digit1   = (int)($n/(pangkat(10, $digit3-1)));
        $n        = (int)($n-$digit1*(int)(pangkat(10, $digit3-1)));
        $digit2_2 = (int)($n/(pangkat(10, $digit3-2)));
        $n        = (int)($n-$digit2_2*(int)(pangkat(10, $digit3-2)));
        
        $baru     = $digit1*(int)(pangkat(10, $digit3-2)) + 
                $digit2_2*(int)(pangkat(10, $digit3-1)) + $n;

        echo "Hasil = " . $baru;
    }
?>