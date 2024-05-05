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
                //Nomor 3
                function maximumValue (int $a, int $b, int $c){
                    (int) $max = $a;
                    if ($a>$b){
                        if ($a>$c){
                            $max    = $a;
                        } else {
                            $max    = $c;
                        }
                    } else if ($b>$c){
                        $max        = $b;
                    } else {
                        $max        = $c;   
                    }
                    
                    return $max;
                }

                if (isset ($_POST['submit_3'])){
                    $a = $_POST['a_1'];
                    $b = $_POST['b_2'];
                    $c = $_POST['c_3'];
                    
                    echo 'Nilai terbesarnya adalah '.maximumValue ($a, $b, $c);
                }
            ?>
        </pre>
    </body>
</html>