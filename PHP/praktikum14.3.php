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
            //Nomor 3
            function digitSum(int $n){
                if ($n==0){
                    return $n;
                }
                (int) $digit = $n%10;

                return $digit+digitSum($n/10);
            }

            if (isset ($_POST['submit_3'])){
                $n = $_POST['n_3'];

                echo "<br>";
                echo "Jumlah semua digit adalah ".digitSum($n);
            }
        ?>
    </body>
</html>