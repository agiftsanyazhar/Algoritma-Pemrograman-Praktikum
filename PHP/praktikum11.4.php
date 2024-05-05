<!DOCTYPE html>
<html>
    <head>
        <meta charset="windows-1252">
        <title>
            Praktikum 11
        </title>
    </head>
    <body>
        <pre>
            <?php
                //Nomor 4
                if (isset ($_POST['submit_4'])){
                    $n = $_POST['n_4'];

                    for ((int) $i=0; $i<$n ; $i++){
                            echo '
                                <form method = "POST">
                                    Masukkan X['.$i.'] : <input type = "number" name="x['.$i.']" required="required"/>
                            ';
                    }
                    echo '
                                    <input type="hidden" name="n1" value="'.$n.'"/>
                                    <input type="submit" name="submit1" value="Submit" />
                                </form>
                    ';
                }

                if (isset ($_POST['submit1'])){
                    $n = $_POST['n1'];
                    $x = $_POST['x'];

                    $digit  = 0;
                    $posisi = 0;

                    $bil    = $n;

                    echo "<br>";
                    for ((int) $i=0; $i<$n; $i++){
                        echo "X".($i+1)." = ".$x[$i]."\t";
                    } echo "<br>";

                    //Menentukan nilai terbesar
                    $nMax   = $x[0];

                    for ((int) $i=0; $i<$n; $i++){
                        if ($x[$i]>$nMax){
                            $nMax   = $x[$i];
                            $posisi = $i;
                        }
                    }
                    echo "Nilai terbesar = ".$nMax."<br>";
                    echo "Posisi data ke-".($posisi+1)."<br>";

                    //Penukaran digit pertama ke digit terbesar
                    echo "<br>";
                    echo "Hasil penukaran digit terbesar ke digit pertama:";

                    $t          = $nMax;
                    $x[$posisi] = $x[0];
                    $x[0]       = $t;

                    echo "<br>";
                    for ((int) $i=0; $i<$n; $i++){
                        echo "X".($i+1)." = ".$x[$i]."\t";
                    } echo "<br>";

                    //Penggeseran array
                    $y      = $x[0];

                    for ((int) $i=1; $i<$n; $i++){
                        $x[$i-1] = $x[$i];
                    } $x[$n-1] = $y;

                    echo "<br>";
                    echo "Hasil penggeseran array: <br>";
                    for ((int) $i=0; $i<$n; $i++){
                        echo "X".($i+1)." = ".$x[$i]."\t";
                    } echo "<br>";
                }
            ?>
        </pre>
    </body>
</html>