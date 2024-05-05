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
                //Nomor 2
                function productValue (int $n){
                    (int) $hasil = 1;
                    for ((int) $i=1; $i<=$n; $i++){
                        $hasil  = $hasil*$i;
                    }
                    return $hasil;
                }

                if (isset ($_POST['submit_2'])){
                    $n = $_POST['n_2'];
                    
                    echo 'Hasil perkalian '.$n.'! = '.productValue ($n);
                }
            ?>
        </pre>
    </body>
</html>