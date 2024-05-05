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
                //Nomor 1
                if (isset ($_POST['submit_1'])){
                    $n = $_POST['n_1'];

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

                    echo "<br>";
                    for ((int) $i=0; $i<$n ; $i++){
                        echo "X".($i+1)." = ".$x[$i]."\t";
                    }
                }
            ?>
        </pre>
    </body>
</html>