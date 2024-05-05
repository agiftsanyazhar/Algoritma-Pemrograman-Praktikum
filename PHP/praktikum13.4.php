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
                //Nomor 4
                function displayNilaiArray(int $n){
                    echo "["."  ";
                    for((int) $i=0; $i<$n; $i++){
                        $x[$i]  = rand(1,100);
                        echo $x[$i]."   ";
                    }  echo "]";
                }
                
                if (isset ($_POST['submit_4'])){
                    $n = $_POST['x_1'];

                    $x = array();

                    echo "<br>";
                    echo "Banyak array adalah ".$n."<br>";
                    echo "Nilai array adalah ";
                    echo displayNilaiArray($n);
                }
            ?>
        </pre>
    </body>
</html>