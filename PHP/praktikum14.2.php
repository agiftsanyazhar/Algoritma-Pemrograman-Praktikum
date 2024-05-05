<!DOCTYPE html>
<html>
    <head>
        <meta charset="windows-1252">
        <title>
            Praktikum 14
        </title>
    </head>
    <body>
        <?php
            //Nomor 2
            function digitMinimum(int $n){
                if ($n<10){
                    return $n%10;
                } else {
                    if ($n%10<digitMinimum($n/10)){
                        return $n%10;
                    }
                    return digitMinimum($n/10);
                }
            }

            if (isset ($_POST['submit_2'])){
                $n = $_POST['n_2'];

                echo "<br>";
                echo "Digit minimumnya adalah ".digitMinimum($n);
            }
        ?>
    </body>
</html>