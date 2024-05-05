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
            //Nomor 1
            $x = array (3,2,7,4);
            function mean ($x, int $i){
                $arrleght = count($x);
                if ($i==$arrleght-1){
                    return $x[$i];
                } else if ($i==0){
                    return ($x[$i]+mean ($x, $i+1, $arrleght))/$arrleght;
                } else {
                    return ($x[$i]+mean ($x, $i+1, $arrleght));
                }
            }
            
            echo mean($x, 0);
        ?>
    </body>
</html>