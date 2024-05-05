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
                //Nomor 3
                if (isset ($_POST['submit_3'])){
                    $nx = $_POST['x'];
                    $ny = $_POST['y'];

                    echo "<br>";
                    echo "Array X";
                    for ((int) $i=0; $i<$nx ; $i++){
                            echo '
                                <form method = "POST">
                                    Masukkan X['.$i.'] : <input type = "number" name="x['.$i.']" required="required"/>
                            ';
                    }
                    echo "<br>";
                    echo "Array Y";
                    for ((int) $i=0; $i<$ny ; $i++){
                        echo '
                            <form method = "POST">
                                Masukkan Y['.$i.'] : <input type = "number" name="y['.$i.']" required="required"/>
                        ';
                }
                    echo '
                                    <input type="hidden" name="n1" value="'.$nx.'"/>
                                    <input type="hidden" name="n2" value="'.$ny.'"/>
                                    <input type="submit" name="submit1" value="Submit" />
                                </form>
                    ';
                }

                if (isset ($_POST['submit1'])){
                    $n1 = $_POST['n1'];
                    $n2 = $_POST['n2'];
                    $x  = $_POST['x'];
                    $y  = $_POST['y'];

                    //penggabungan Array X dan Y
                    for ((int) $i=0; $i<$n1+$n2 ; $i++){
                        if ($i<$n1){
                            $z[$i]  = $x[$i];
                        } else {
                            $z[$i]  = $y[$i-$n1];
                        }
                    }
                    echo "<br>";
                    echo "Hasil: <br>";
                    for ((int) $i=0; $i<$n1+$n2 ; $i++){
                        echo "Z".($i+1)." = ".$z[$i]  . "\t";
                    }
                }
            ?>
        </pre>
    </body>
</html>