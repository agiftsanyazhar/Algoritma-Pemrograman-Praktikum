<!DOCTYPE html>
<html>
    <head>
        <meta charset="windows-1252">
        <title>
            Praktikum 12
        </title>
    </head>
    <body>
        <pre>
            <?php
                //Nomor 3
                if (isset ($_POST['submit_3'])){
                    $nx1 = $_POST['x_1'];
                    $nx2 = $_POST['x_2'];

                    echo "<br>";
                    echo "Array X";
                    for ((int) $i=0; $i<$nx1 ; $i++){
                        for ((int) $j=0; $j<$nx2; $j++){
                            echo '
                                <form method = "POST">
                                    Masukkan X['.$i.']['.$j.'] : <input type = "number" name="x['.$i.']['.$j.']" required="required"/>
                            ';
                        }
                    }
                    echo '
                                    <input type="hidden" name="n1" value="'.$nx1.'"/>
                                    <input type="hidden" name="n2" value="'.$nx2.'"/>
                                    <input type="submit" name="submit1" value="Submit" />
                                </form>
                    ';
                }

                if (isset ($_POST['submit1'])){
                    $n1 = $_POST['n1'];
                    $n2 = $_POST['n2'];
                    $x  = $_POST['x'];

                    echo '<br>';
                    for ((int) $i=0; $i<$n1 ; $i++){
                        for ((int) $j=0; $j<$n2; $j++){
                            echo "X[".($i+1)."][".($j+1)."] = ".$x[$i][$j]."\t\t\t";
                        } echo "<br><br>";
                    }
                    //Ditukar
                    echo "<br>";
                    echo "Ditukar:<br>";

                    for ((int) $i=0; $i<3; $i++){
                        $a          = $x[$i][1];
                        $x[$i][1]   = $x[$i][3];
                        $x[$i][3]   = $a;
                    }

                    for ((int) $i=0; $i<$n1 ; $i++){
                        for ((int) $j=0; $j<$n2; $j++){
                            echo "X[".($i+1)."][".($j+1)."] = ".$x[$i][$j]."\t\t\t";
                        } echo "<br><br>";
                    }
                }
            ?>
        </pre>
    </body>
</html>