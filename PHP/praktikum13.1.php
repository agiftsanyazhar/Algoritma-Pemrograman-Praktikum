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
                //Nomor 1
                function higherValue (int $n, int $m){
                    if ($n>$m){
                        return "True";
                    } else {
                        return "False";
                    }
                }

                if (isset ($_POST['submit_1'])){
                    $n = $_POST['n_1'];
                    $m = $_POST['m_1'];
                    
                    echo 'Apakah '.$n.'>'.$m.'?'.'  '.higherValue($n, $m);
                }
            ?>
        </pre>
    </body>
</html>