<!DOCTYPE html>
<html>
    <head>
        <meta charset="windows-1252">
        <title>
            Praktikum 14
        </title>
    </head>
    <body>
        <pre>
            <?php
                //Nomor 4
                function asc(int $n){
                    if ($n>0){
                        asc ($n-1);
                        echo ($n)."  ";
                    }
                }

                if (isset ($_POST['submit_4'])){
                    $n = $_POST['n_4'];

                    echo "<br>";
                    echo asc($n);
                }
            ?>
        </pre>
    </body>
</html>