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
                //Nomor 5
                function minimum($x, int $n){
                    echo "["."  ";
                    for((int) $i=0; $i<$n; $i++){
                        $x[$i]  = rand(1,100);
                        echo $x[$i]."   ";
                    }  echo "]";

                    $minimum    = $x[0];

                    for((int) $i=0; $i<$n; $i++){
                        if ($x[$i]<$minimum){
                            $minimum    = $x[$i];
                        }
                    }
                    return $minimum;
                }

                if (isset ($_POST['submit_5'])){
                    $n = $_POST['x_1'];

                    $x = array();

                    echo "<br>";
                    echo "Banyak array adalah ".$n."<br>";
                    echo "Nilai array adalah ";
                    echo "<br>Nilai minimum = ".minimum($x, $n);
                }
            ?>
        </pre>
    </body>
</html>