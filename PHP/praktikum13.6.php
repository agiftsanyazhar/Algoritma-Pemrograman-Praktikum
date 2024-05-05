<!DOCTYPE html>
<html>
    <head>
        <meta charset="windows-1252">
        <title>
            Praktikum 13
        </title>
    </head>
    <body>
        <pre>
            <?php
                //Nomor 6
                function hasilKali($x, int $n){
                    echo "["."  ";
                    for((int) $i=0; $i<$n; $i++){
                        $x[$i]  = rand(1,100);
                        echo $x[$i]."   ";
                    }  echo "]";

                    $hasilKali  = 1;

                    for((int) $i=0; $i<$n; $i++){
                        $hasilKali  = $hasilKali*$x[$i];
                    }
                    return $hasilKali;
                }

                if (isset ($_POST['submit_6'])){
                    $n = $_POST['x_1'];

                    $x = array();

                    echo "<br>";
                    echo "Banyak array adalah ".$n."<br>";
                    echo "Nilai array adalah ";
                    echo "<br>Hasil semua perkalian bilangan array = ".hasilKali($x, $n);
                }
            ?>
        </pre>
    </body>
</html>