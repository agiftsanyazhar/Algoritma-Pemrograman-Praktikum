<!DOCTYPE html>
<html>
    <head>
        <meta charset="windows-1252">
        <title>
            Praktikum 14
        </title>
    </head>
    <body>
        <?php
            //Nomor 5
            function bunny(int $n){
                (int ) $telinga = 0;
                
                if ($n%2==0){
                    if ($n==0){
                        return 0;
                    }
                    $telinga    = bunny($n-1)+3;
                } else {
                    if ($n==0){
                        return 0;
                    } $telinga  = bunny($n-1)+2;
                }
                return $telinga;
            }

            if (isset ($_POST['submit_5'])){
                $n = $_POST['n_5'];

                echo "<br>";
                echo "Jumlah semua telinga kelinci = ".bunny($n);
            }
        ?>
    </body>
</html>